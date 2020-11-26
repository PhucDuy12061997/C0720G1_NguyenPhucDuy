package com.product.controller;

import com.product.model.SanPham;
import com.product.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ControllerSanPham {
    @Autowired
    SanPhamService sanPhamService;

    @GetMapping("")
    public String trangchu() {
        return "home";
    }

    @GetMapping("/index")
    public String index(Model model) {
        List<SanPham> sanPhamList = sanPhamService.findAll();
        model.addAttribute("sanPhams", sanPhamList);
        return "index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("sanPhams", new SanPham());
        return "create";
    }

    @PostMapping("/save")
    public String save(SanPham sanPham, RedirectAttributes redirectAttributes) {
//        sanPham.setId((int) (Math.random() * 1000));
        sanPhamService.Save(sanPham);
        redirectAttributes.addFlashAttribute("massage", " them thanh cong !");
        return "redirect:/index";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("sanPhams", sanPhamService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(SanPham sanPham, RedirectAttributes redirectAttributes) {
        sanPhamService.update(sanPham.getId(), sanPham);
        redirectAttributes.addFlashAttribute("massage", "sửa thành công!");
        return "redirect:/index";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("sanPhams", sanPhamService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(SanPham sanPham, RedirectAttributes redirectAttributes) {
        sanPhamService.remove(sanPham.getId());
        redirectAttributes.addFlashAttribute("massage", "Xoa thanh công");
        return "redirect:/index";
    }


    @GetMapping("/view/{id}")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("sanPhams", sanPhamService.findById(id));
        return "/view";
    }
}
