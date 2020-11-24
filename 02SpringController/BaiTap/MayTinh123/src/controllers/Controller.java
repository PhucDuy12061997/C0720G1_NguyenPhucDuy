package controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.MayTinh;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("")
    private String gohome() {
        return "home";
    }

    @Qualifier("nhanService")
    @Autowired
    private MayTinh nhanService;

    @GetMapping("/nhan")
    private String nhan(@RequestParam double so1, @RequestParam double so2, Model model) {
        model.addAttribute("ketqua", nhanService.mayTinh(so1, so2));
        model.addAttribute("so1", so1);
        model.addAttribute("so2", so2);
        return "home";
    }

    @Qualifier("chiaService")
    @Autowired
    private MayTinh chiaService;

    @GetMapping("/chia")
    private String chia(@RequestParam double so1, @RequestParam double so2, Model model) {
        if (so2 == 0) {
            return "mẫu số phải khác 0";
        } else
            model.addAttribute("ketqua", chiaService.mayTinh(so1, so2));
        model.addAttribute("so1", so1);
        model.addAttribute("so2", so2);
        return "home";
    }

    @Qualifier("congService")
    @Autowired
    private MayTinh congService;

    @GetMapping("/cong")
    private String cong(@RequestParam double so1, @RequestParam double so2, Model model) {
        model.addAttribute("ketqua", congService.mayTinh(so1, so2));
        model.addAttribute("so1", so1);
        model.addAttribute("so2", so2);
        return "home";
    }

    @Qualifier("truService")
    @Autowired
    private MayTinh truService;

    @GetMapping("/tru")
    private String tru(@RequestParam double so1, @RequestParam double so2, Model model) {
        model.addAttribute("ketqua", truService.mayTinh(so1, so2));
        model.addAttribute("so1", so1);
        model.addAttribute("so2", so2);
        return "home";
    }

}
