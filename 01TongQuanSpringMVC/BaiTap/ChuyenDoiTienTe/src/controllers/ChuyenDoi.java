package controllers;

import org.springframework.stereotype.Controller;
import org.springfaramework.ui.Model;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChuyenDoi {
    @GetMapping("/chuyendoi")
    public String chuyenDoi(@RequestParam String usd, Model model){
        int ketQua=23000* Integer.parseInt(usd);

        return "ketqua";
    }
}
