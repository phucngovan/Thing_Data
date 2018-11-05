package com.codegym.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThingController {
    @GetMapping("/")
    public ModelAndView showIndex() {
        ModelAndView modelAndView=new ModelAndView("/create");
        return modelAndView;
    }
}
