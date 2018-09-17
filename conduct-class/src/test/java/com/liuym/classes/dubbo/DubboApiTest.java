package com.ec.corpinfo.dubbo;

import com.alibaba.fastjson.JSONObject;
import com.ec.corpcommon.dubbo.corpprotect.api.AgentProtectDubboService;
import com.ec.corpcommon.dubbo.corpprotect.dto.AddAgentProtectDTO;
import com.ec.corpcommon.exception.CorpProtectException;
import com.ec.usercenter.model.message.data.FindUserInfoResponseDTO;
import com.ec.usercenter.service.UserApiService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboApiTest {

    private static final Logger logger = LoggerFactory.getLogger(DubboApiTest.class);

    @Autowired
    private UserApiService userApiService;

    @Autowired
    private AgentProtectDubboService agentProtectDubboService;

    @Test
    public void findUserByIdOrAccount() {
        FindUserInfoResponseDTO user = userApiService.findUserByIdOrAccount("", "18575670000", "f_user_id,f_account,f_name");
        logger.info("findUserByIdOrAccount:" + user);
    }

    @Test
    public void testCorpProtectTest() {
        AddAgentProtectDTO addProtectBO = new AddAgentProtectDTO();
        addProtectBO.setCity(441900);
       /* addProtectBO.setProvince(440000);
        addProtectBO.setSales_id(1L);
        addProtectBO.setCorpname("公司gs2422");
        addProtectBO.setCorpshotname("六六六");
        addProtectBO.setIntent("111");
        addProtectBO.setIndustry(3);
        addProtectBO.setTxtname("刘大仙");
        addProtectBO.setTxtphone("1448778929926");
        addProtectBO.setTxttitle("无敌的我又回来了");*/
        // addProtectBO.setWebsite("www.123.com");
        JSONObject jsonObject = null;
        try {
            jsonObject = agentProtectDubboService.addProtect(21299, 1L, addProtectBO);
        } catch (CorpProtectException e) {
            logger.error("testCorpProtectTest:", e);
        }
        System.out.println("testCorpProtectTest:" + jsonObject);
    }



}
