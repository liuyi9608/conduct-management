package com.liuym.admin.service;

import com.alibaba.fastjson.JSONObject;
import com.ec.corpcommon.dubbo.corpinfo.api.CorpInfoDubboService;
import com.ec.corpcommon.dubbo.corpinfo.dto.CorpInfoDTO;
import com.ec.corpcommon.exception.CorpInfoException;
import com.liuym.admin.repository.model.bo.AddProtectBO;
import com.liuym.admin.repository.model.entity.AgentProtect;
import com.liuym.admin.repository.model.entity.AgentProtectConfig;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AgentProtectServiceTest {

    @Autowired
    private AgentProtectService agentProtectService;


    @Autowired
    private CorpInfoDubboService corpInfoDubboService;

    @Test
    public void addProtectTest() throws Exception {
        AddProtectBO addProtectBO = new AddProtectBO();
        addProtectBO.setCity(441900);
        addProtectBO.setProvince(440000);
        addProtectBO.setSales_id(1L);
        addProtectBO.setCorpname("公司gs2422");
        addProtectBO.setCorpshotname("六六六");
        addProtectBO.setIntent("111");
        addProtectBO.setIndustry(3);
        addProtectBO.setTxtname("刘大仙");
        addProtectBO.setTxtphone("1448778929926");
        addProtectBO.setTxttitle("无敌的我又回来了");
        // addProtectBO.setWebsite("www.123.com");
        JSONObject jsonObject = agentProtectService.addProtect(21299, 1L, addProtectBO);
        System.out.println("createCorpTest:" + jsonObject);
    }

    @Test
    public void getCorpProtectInfoByCNameTest() throws Exception {
        AgentProtect protectId = agentProtectService.getCorpProtectInfoByCName("lym11111有限公司");
        System.out.println(protectId.getAgentCorpId());
    }

    @Test
    public void getProtectConfigByCityIdTest() throws Exception {
        AgentProtectConfig protectConfigByCityId = agentProtectService.getProtectConfigByCityId(110113);
        System.out.println("getProtectConfigByCityId:" + protectConfigByCityId.getProvince());
    }

    @Test
    public void getProtectNumTest() throws Exception {
        int num = agentProtectService.getProtectNum(21299);
        System.out.println("getProtectNum:" + num);
    }

    @Test
    public void getProtectTotalTest() throws Exception {
        System.out.println("getProtectTotal:" + agentProtectService.getProtectTotal(21299));
    }

    @Test
    public void getProtectAreaTest() throws Exception {
        List<Map<String, Integer>> protectArea = agentProtectService.getProtectArea(21299);
        for (Map map : protectArea) {
            System.out.println(map);
        }
    }

    @Test
    public void checkProtectArea() throws Exception {
        boolean b = agentProtectService.checkProtectArea(21299, 610000, 520000);
        boolean b1 = agentProtectService.checkProtectArea(21299, 440000, 440100);
        boolean b2 = agentProtectService.checkProtectArea(21299, 810000, 520000);
        boolean b3 = agentProtectService.checkProtectArea(21299, 640000, 520000);
        boolean b4 = agentProtectService.checkProtectArea(21299, 440000, 520000);
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

    }

    @Test
    public void hasValidProtectTest() throws Exception{
        boolean b = agentProtectService.hasValidProtect("12323123213112312");
        System.out.println(b);
    }

    @Test
    public void hasProtectNumTest() throws Exception {
        boolean b = agentProtectService.hasProtectNum(21299);
        System.out.println(b);
    }

    @Test
    public void getCorpInfoByIdTest() throws CorpInfoException {
        CorpInfoDTO corpInfoById = corpInfoDubboService.getCorpInfoById(21299);
        System.out.println(corpInfoById.getCorpId());
    }

    @Test
    public void getCorpInfoByNameTest() throws Exception {
        CorpInfoDTO corpInfoById = corpInfoDubboService.getCorpInfoByCorpName("测试注册登记地有限公司");
        System.out.println(corpInfoById.getCorpId());
    }

    @Test
    public void isExsitContactMobileTest() throws Exception {
        boolean mobile = corpInfoDubboService.isExsitContactMobile("13570841912");
        System.out.println(mobile);
    }

    @Test
    public void getVaildProtectInfoByCName() throws Exception {
        AgentProtect abc = agentProtectService.getValidCorpProtectInfoByCName("TEST12");
        System.out.println(abc);
    }

    @Test
    public void testDubbo() throws Exception {
        boolean liutiezhu = corpInfoDubboService.isExsitCorpName("liutiezhu");
        System.out.println(liutiezhu);
    }

    @Test
    public void dubboException() throws CorpInfoException {
        boolean exsitCorpName = corpInfoDubboService.isExsitCorpName("123");
        System.out.println(exsitCorpName);
    }

}
