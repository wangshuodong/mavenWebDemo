package com.wangsd.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/1/13.
 */
@Controller
public class SysController {

    private static final Logger logger = LogManager.getLogger(SysController.class.getName());

    @RequestMapping("/hello")
    public String hello(Model model) {
        try {
            int a = 2 / 0;
        }catch (Exception e) {
            logger.error(e);
        }
        model.addAttribute("greeting", "Hello Spring MVC");
        return "helloworld";
    }
}
