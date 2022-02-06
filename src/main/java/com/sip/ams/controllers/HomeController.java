package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class HomeController {
    @RequestMapping("/info")
    public String info(Model model ){
        String formation="fullstack";
        ArrayList lists = new ArrayList<>(Arrays.asList("CPA", "CPO", "Spring","Angular"));
        model.addAttribute("workshop",formation);
        model.addAttribute("list",lists);
        return "home/info";
    }

    @RequestMapping("/affichage")
    public String affichage(){
        System.out.println("sssss");
        return "home/affichage";
    }
}
