package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.TuDien;

@Controller
public class Controllers {
    @Autowired
    private TuDien tuDien;

    @GetMapping({"/tudien"})
    private String tudien(@RequestParam String tienganh, Model model) {
        String ketqua = tuDien.tudien(tienganh);
        model.addAttribute("ketqua", ketqua);
        return "ketqua";
    }

}
