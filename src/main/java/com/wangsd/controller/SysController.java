package com.wangsd.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/1/13.
 */
@Controller
@RequestMapping("/hello")
public class SysController {

    private static final Logger logger = LogManager.getLogger(SysController.class.getName());


    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public String hello1(Model model) {

        model.addAttribute("greeting", "Hello Spring MVC");
        return "helloworld";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String hello2(Model model) {

        model.addAttribute("greeting", "Hello Spring MVC");
        return "helloworld";
    }
}
