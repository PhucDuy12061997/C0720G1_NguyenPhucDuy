package com.blog.demo.controller;

import com.blog.demo.entity.BlogEntity;
import com.blog.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("")
    public String goHome() {
        return "home";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<BlogEntity> blogEntityList = blogService.findAll();
        model.addAttribute("blogentytis", blogEntityList);
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("blogentitys", new BlogEntity());
        return "create";
    }

    @PostMapping("/save")
    public String save(BlogEntity entity, RedirectAttributes redirectAttributes) {
        blogService.save(entity);
        redirectAttributes.addFlashAttribute("massage", " them thanh cong");
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("blogentitys", blogService.findById(id));
        return "edit";
    }

    @PostMapping("/update")
    public String update(BlogEntity blogEntity, RedirectAttributes redirectAttributes) {
        blogService.update(blogEntity.getId(), blogEntity);
        redirectAttributes.addFlashAttribute("massage1", " sua thanh cong");
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("blogentitys", blogService.findById(id)) ;
            return "delete";
    }
    @PostMapping("/delete")
    public String delete(BlogEntity blogEntity,RedirectAttributes redirectAttributes){
blogService.remove(blogEntity.getId());
redirectAttributes.addFlashAttribute("massage2"," xoas thaanh cong");
        return "redirect:/list";
    }
    @GetMapping("/view/{id}")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blogentitys", blogService.findById(id));
        return "view";
    }
}