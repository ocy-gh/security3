package com.example.security3.controller;

import com.example.security3.entity.po.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model){
        Msg msg =  new Msg("测试标题","测试内容","ADMIN MESSAGE");
        model.addAttribute("msg", msg);
        return "home";
    }
}