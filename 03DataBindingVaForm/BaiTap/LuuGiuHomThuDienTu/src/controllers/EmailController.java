package controllers;

import model.Mailbox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class EmailController {
    @GetMapping("")
    private String goHome(Model model) {
        model.addAttribute("mailbox", new Mailbox());
        return "home";
    }
    @GetMapping("/create")
    private String create(@ModelAttribute Mailbox mailbox,Model model){
        model.addAttribute("languages",mailbox.getLanguages());
        model.addAttribute("pageSize",mailbox.getPageSize());
        model.addAttribute("spamsFilter",mailbox.getSpamsFilter());
        model.addAttribute("signature",mailbox.getSignature());
        return "";
    }
}
