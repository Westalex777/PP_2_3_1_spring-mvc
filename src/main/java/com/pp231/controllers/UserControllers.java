package com.pp231.controllers;

import com.pp231.model.User;
import com.pp231.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserControllers {

    @Autowired
    private UserService userService;

    @GetMapping
    public String getAllUser(ModelMap model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "index";
    }

    @GetMapping("userForm")
    public String userForm(Model model, @RequestParam(value = "id", required = false) int id) {
        User user;
        String toController;
        String buttonName;
        if (id == 0) {
            user = new User();
            toController = "/saveUser";
            buttonName = "Create";
        } else {
            user = userService.getUser(id);
            toController = "/updateUser";
            buttonName = "Update";
        }
        model.addAttribute("toController", toController);
        model.addAttribute("user", user);
        model.addAttribute("buttonName", buttonName);
        return "user-form";
    }

    @GetMapping("saveUser")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @RequestMapping("deleteUser")
    public String deleteUser(@RequestParam("id") int id) {
        userService.deleteUser(id);
        return "redirect:/";
    }

    @RequestMapping("updateUser")
    public String updateUser(@ModelAttribute("user") User user) {
        userService.updateUser(user);
        return "redirect:/";
    }
}
