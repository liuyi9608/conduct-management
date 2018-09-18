package com.liuym.student.controller;

import com.alibaba.fastjson.JSON;
import com.liuym.student.repository.model.entity.Student;
import com.liuym.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiuYiMing
 * @date 2018/9/18 11:44
 * @describe：
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getById/{id}")
    public String getById(@PathVariable("id") int id) {
        Student student = studentService.findById(id);
        String s = JSON.toJSONString(student);
        return s;
    }
}
