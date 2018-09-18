package com.liuym.student.service.impl;

import com.liuym.student.repository.mapper.base.StudentMapper;
import com.liuym.student.repository.model.entity.Student;
import com.liuym.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LiuYiMing
 * @date 2018/9/18 11:43
 * @describe：
 */
@Service
public class StuedntServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student findById(int id) {
        return studentMapper.fintById(id);
    }
}
