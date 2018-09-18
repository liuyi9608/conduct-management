package com.liuym.student.service;

import com.liuym.student.repository.model.entity.Student;

/**
 * @author LiuYiMing
 * @date 2018/9/18 11:43
 * @describe：
 */
public interface StudentService {

    Student findById(int id);

}
