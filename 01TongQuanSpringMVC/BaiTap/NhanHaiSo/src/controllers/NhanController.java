package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.Nhan2So;

@Controller
public class NhanController {
    @Autowired
    Nhan2So nhan2So;

    @GetMapping("/nhan")
    public String nhan2so(@RequestParam String so1, @RequestParam String so2, Model model) {
        int nhan2so = nhan2So.nhan(Integer.parseInt(so1), Integer.parseInt(so2));
        model.addAttribute("dapan",nhan2so );
        return "ketqua";
    }
}
