package com.ec.corpinfo.mapper;

import com.ec.corpinfo.repository.mapper.base.CorpInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CorpInfoMapperTest {

    @Autowired
    private CorpInfoMapper corpInfoMapper;

    @Test
    public void getByIdTest() {
        System.out.println("getByIdTest:");
    }
}
