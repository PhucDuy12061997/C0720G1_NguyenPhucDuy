package com.example.validate.controller;

import com.example.validate.entity.User;
import com.example.validate.service.UserService;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public String home() {
        return "home";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("userList", users);
        return "list";
    }

    @GetMapping("/save")
    public String create(Model model) {
        model.addAttribute("userList", new User());
        return "create";
    }

    @PostMapping("/save")
    public String create(@Valid @ModelAttribute (name = "userList") User user, BindingResult bindingResult,
                         RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()){
            return "create";
        }
        this.userService.save(user);
        redirectAttributes.addFlashAttribute("message", " them thanh cong");
        return "redirect:/list";
    }

}
