package ru.icl.bbcodeconverter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.icl.bbcodeconverter.model.Victim;

/**
 * This is simple controller for two methods: GET & POST
 *
 * @author Danil Yusupov
 */
@Controller
@RequestMapping("/")
public class AppController {
    @GetMapping
    public String index(Model model) {
        model.addAttribute("title", "BBCode to HTML converter");
        return "index";
    }

    @PostMapping("/convert")
    public String convert(@ModelAttribute Victim victim) {
        victim.setResult(victim.getText());
        return "convert";
    }
}
