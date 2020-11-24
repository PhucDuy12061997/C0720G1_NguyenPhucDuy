package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.Calculator;

@Controller
public class CalculatorController {
    @Autowired
    Calculator calculator;

    @GetMapping("")
    public String trangChu() {
        return "trangchu";
    }

    @PostMapping("/maytinh")
    public String ketQuaTinh(@RequestParam String so1, @RequestParam String so2, @RequestParam String boNho, Model model) {

        String hienThi = "";
        try {
            double ketqua = calculator.calculator(Double.parseDouble(so1), Double.parseDouble(so2), boNho);
            hienThi = (so1 + " " + boNho + " " + so2 + " " + "=" + " " + ketqua);
        } catch (RuntimeException e) {
            hienThi = e.getMessage();
        }
        model.addAttribute("so1", so1);
        model.addAttribute("so2", so2);
        model.addAttribute("ketqua", hienThi);

        return "trangchu";
    }

}