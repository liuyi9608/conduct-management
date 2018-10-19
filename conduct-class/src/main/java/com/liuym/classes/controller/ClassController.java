package com.liuym.classes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author LiuYiMing
 * @date 2018/10/19 14:54
 * @describe：
 */
@Controller
public class ClassController {
    @RequestMapping(value = "/greeting")
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("title", "欢迎使用Thymeleaf!");
        return modelAndView;
    }
}
