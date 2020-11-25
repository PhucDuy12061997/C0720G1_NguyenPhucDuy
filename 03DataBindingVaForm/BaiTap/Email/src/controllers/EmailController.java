package controllers;

import model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import services.EmailService;

@Controller
@RequestMapping("/")
public class EmailController {
    private String[] languages = {"English", "Vietnamese", "Japanese", "Chinese"};
    private String[] pageSize = {"5", "10", "15", "25", "50", "100"};

    @Autowired
    private EmailService emailService;

    @GetMapping
    public String home(@ModelAttribute Email email, Model model) {
        model.addAttribute("languages", languages);
        model.addAttribute("pageSizes", pageSize);

        Email emailShowInfo = emailService.create();
        model.addAttribute("email", emailShowInfo);

        return "home";
    }

    @GetMapping("showUpdate")
    public String showUpdate(Model model) {
        model.addAttribute("languages", languages);
        model.addAttribute("pageSizes", pageSize);

        Email email = emailService.create();
        model.addAttribute("email", email);

        return "home";
    }

    @PostMapping("update")
    public String update(@ModelAttribute Email email, Model model, RedirectAttributes redirectAttributes) {
        model.addAttribute("languages", languages);
        model.addAttribute("pageSizes", pageSize);
        Email emailResult = emailService.update(email);
        model.addAttribute("email", emailResult);

        return "result";
    }
}
