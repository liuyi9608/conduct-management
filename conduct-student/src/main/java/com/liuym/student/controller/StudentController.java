package com.liuym.student.controller;

import com.alibaba.fastjson.JSON;
import com.liuym.student.repository.model.entity.Student;
import com.liuym.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author LiuYiMing
 * @date 2018/9/18 11:44
 * @describe：
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getById/{id}")
    public String getById(@PathVariable("id") int id) {
        Student student = studentService.findById(id);
        String s = JSON.toJSONString(student);
        return s;
    }

    @RequestMapping(value = "/greeting")
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("title", "欢迎使用Thymeleaf!");
        return modelAndView;
    }


}
