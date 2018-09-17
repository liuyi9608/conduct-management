package com.ec.corpinfo.service;

import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AgentServiceTest {

    private static final Logger logger = LoggerFactory.getLogger(AgentServiceTest.class);

    @Autowired
    private CorpInfoService corpInfoService;

    @Autowired
    private AgentService agentService;

    @Test
    public void createCorpTest() throws Exception {
        boolean result = agentService.isAgentType(21299L);
        logger.info("createCorpTest:" + result);
    }

    @Test
    public void getAgentOperatorInfoTest() throws Exception {
        Map<String, String> agentOperatorInfo = agentService.getAgentOperatorInfo(21299, 64634);
        System.out.println(agentOperatorInfo);
    }
}
