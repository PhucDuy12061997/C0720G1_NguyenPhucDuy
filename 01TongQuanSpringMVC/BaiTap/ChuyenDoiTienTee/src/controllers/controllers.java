package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controllers {
    @GetMapping("/chuyendoi")
    public String chuyendoi(@RequestParam String usd, Model model) {
double ketqua=23000*Integer.parseInt(usd);
model.addAttribute("ketqua",ketqua);

return "ketqua";
    }
}
