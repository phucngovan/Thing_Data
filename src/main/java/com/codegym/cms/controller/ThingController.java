package com.codegym.cms.controller;

import com.codegym.cms.model.Thing;
import com.codegym.cms.service.ThingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class ThingController {
    @Autowired
    private ThingService thingService;
    @GetMapping("/")
    public ModelAndView showIndex() {
        ModelAndView modelAndView=new ModelAndView("/create");
        modelAndView.addObject("thing",new Thing());
        return modelAndView;
    }
    @PostMapping("/")
    public ModelAndView saveThing(@ModelAttribute("thing") Thing thing) {
        thingService.save(thing);
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("thing", new Thing());
        modelAndView.addObject("message","tao thanh cong" );
        return modelAndView;
    }
    @GetMapping("/phucdz")
    public ModelAndView showList() {
        List<Thing> things = thingService.findAll();
        ModelAndView modelAndView = new ModelAndView("/list") ;
        modelAndView.addObject("things",things);
        return modelAndView;
    }
}