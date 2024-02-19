package com.me.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class RenderController {
    @GetMapping("/{userId}")
    public String getUserNotes(@PathVariable("userId") String userId, Model model) {
        model.addAttribute("title", "Notes");
        model.addAttribute("userId", userId);
        return "notes";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("title", "login");
        return "login";
    }
}