package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.ChuyenDoiService;

@Controller
public class controllers {
    @Autowired
    private ChuyenDoiService chuyenDoiService;

    @GetMapping("/chuyendoi")
    public String chuyendoi(@RequestParam double usd, Model model) {
        double ketqua = chuyenDoiService.chuyendoi(usd);
        model.addAttribute("ketqua",ketqua);
        return "ketqua";
    }
}
