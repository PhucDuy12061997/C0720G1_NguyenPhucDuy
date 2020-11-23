package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.impl.DichService;

@Controller
public class Controlers {
    @Autowired
    private DichService dichService;
    @GetMapping("/tudien")
    private String tudien(@RequestParam String english, Model model) {
        String ketqua = dichService.dich(english);
        model.addAttribute("ketqua", ketqua);
        return "/tudien";
    }
}
