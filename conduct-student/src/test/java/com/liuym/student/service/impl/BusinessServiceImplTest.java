package com.liuym.student.service.impl;

import com.liuym.student.service.BusinessService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BusinessServiceImplTest {

    @Autowired
    private BusinessService businessService;

    @Test
    public void addSameNameMove() {
        String corpName = "44深圳市王亚飞集团";
        Boolean addResult = businessService.addSameNameMove(corpName,222222);

        System.out.println(addResult);
    }
}