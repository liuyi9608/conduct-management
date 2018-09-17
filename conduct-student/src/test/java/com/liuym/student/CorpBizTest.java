package com.liuym.student;

import com.alibaba.fastjson.JSON;
import com.ec.corpcommon.dubbo.corpbiz.dto.BusinessDubboDTO;
import com.ec.springbt.common.nsq.producer.NsqProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CorpBizTest {

    private static final Logger logger = LoggerFactory.getLogger(CorpBizTest.class);

    @Autowired
    private NsqProducer nsqProducer;

    @Test
    public void sendCreateBizNsq() {
        BusinessDubboDTO businessDubboDTO = new BusinessDubboDTO();
        businessDubboDTO.setCorpId(2147777);
        businessDubboDTO.setCorpName("严森测试有限公司");
        businessDubboDTO.setAgentId(2147777);
        businessDubboDTO.setContactMobile("15045566334");
        businessDubboDTO.setContactName("严森");
        businessDubboDTO.setContactPosition("ceo");
        businessDubboDTO.setProvinceId(40000);
        businessDubboDTO.setCityId(40100);
        businessDubboDTO.setVocation(134);
        businessDubboDTO.setUserId(65536);
        businessDubboDTO.setType(2);
        businessDubboDTO.setSourceId(8);

        try {
            nsqProducer.produce("j_cb_createBiz", JSON.toJSONString(businessDubboDTO).getBytes());
        } catch (Exception e){
            logger.info("testCorpProtectTest:", e);
        }

    }
}