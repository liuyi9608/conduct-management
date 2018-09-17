package com.ec.corpinfo.service;

import com.alibaba.fastjson.JSONObject;
import com.ec.corpcommon.dubbo.corpprotect.api.AgentProtectDubboService;
import com.ec.corpcommon.dubbo.corpprotect.dto.AgentProtectDTO;
import com.ec.corpcommon.exception.CorpInfoException;
import com.ec.corpinfo.properties.NsqProperties;
import com.ec.corpinfo.repository.model.bo.CreateCorpBO;
import com.ec.corpinfo.repository.model.entity.CorpInfo;
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
public class CorpInfoServiceTest {

    private static final Logger logger = LoggerFactory.getLogger(CorpInfoServiceTest.class);

    @Autowired
    private CorpInfoService corpInfoService;

    @Autowired
    private AgentProtectDubboService agentProtectDubboService;
    @Autowired
    private NsqProducer nsqProducer;
    @Autowired
    private NsqProperties nsqProperties;

    @Test
    public void createCorpTest() {
        CreateCorpBO createCorpBO = new CreateCorpBO();
        createCorpBO.setCorpName("瑾轩测试企业有限科技公司2");
        createCorpBO.setShortname("瑾轩测试企业");
        createCorpBO.setContactName("余瑾轩");
        createCorpBO.setContactTitle("CEO");
        createCorpBO.setContactMobile("18575670060");
        createCorpBO.setVocation(47);
        createCorpBO.setProvinceId(110000);
        createCorpBO.setCityId(110101);

        createCorpBO.setRegisterType(10);
        //3,8,9
        createCorpBO.setAgentId(21299L);
        createCorpBO.setAgentCsid(56553L);
        createCorpBO.setAgentGjid(56553L);
        createCorpBO.setOperatorAccount("13418638209");
        createCorpBO.setOperatorUserName("罗凯");

        //非3,8,9
//        createCorpBO.setAgentId(2167396L);
//        createCorpBO.setAgentCsid(2167395L);
//        createCorpBO.setAgentGjid(2167395L);
//        createCorpBO.setOperatorAccount("15019487874");
//        createCorpBO.setOperatorUserName("严森");

        try{
            JSONObject result = corpInfoService.createCorp(createCorpBO);
            logger.info("createCorpTest:", result.toString());
        }catch (Exception e){
            logger.error("createCorpTest:", e);
        }
    }

    @Test
    public void createCorpByAgentTypeTest() {
        CreateCorpBO createCorpBO = new CreateCorpBO();
        createCorpBO.setAgentId(21299L);
        createCorpBO.setCorpName("瑾轩测试企业有限科技公司");
        createCorpBO.setShortname("瑾轩测试企业");
        createCorpBO.setContactName("余瑾轩");
        createCorpBO.setContactTitle("CEO");
        createCorpBO.setContactMobile("18575670062");
        createCorpBO.setVocation(47);
        createCorpBO.setProvinceId(110000);
        createCorpBO.setCityId(110101);
        createCorpBO.setPwdType(1);
        createCorpBO.setPwd("Aa888888");

        createCorpBO.setRegisterType(10);
        createCorpBO.setAgentCsid(56553L);
        try{
            JSONObject result = corpInfoService.createCorpByAgentType(createCorpBO);
            logger.info("createCorpByAgentTypeTest:", result.toString());
        }catch (Exception e){
            logger.error("createCorpByAgentTypeTest:", e);
        }
    }

    @Test
    public void getCorpInfoByName() {
        CorpInfo name = null;
        try {
            name = corpInfoService.getCorpInfoByCorpName("温州几米会计有限公司");
        } catch (CorpInfoException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(name.getShortname());
    }

    @Test
    public void isExsitContactMobileTest() {
        boolean exsitContactMobile = false;
        try {
            exsitContactMobile = corpInfoService.isExsitContactMobile("18684454557");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(exsitContactMobile);
    }

    @Test
    public void sendAddBizMsgTest() {
        //新增商机
        JSONObject addBizJSONObj = new JSONObject();
        addBizJSONObj.put("agentId", 21299);
        addBizJSONObj.put("corpId", 5416411);
        addBizJSONObj.put("userId", 5416410);
        addBizJSONObj.put("corpName", "瑾轩测试");
        addBizJSONObj.put("contactMobile", "18575670014");
        addBizJSONObj.put("contactName", "余瑾轩");
        addBizJSONObj.put("contactPosition", "CEO");
        addBizJSONObj.put("provinceId", 500000);
        addBizJSONObj.put("cityId", 500101);
        //NewCorpRegisterSourceEnum类 注册类型：1:PC官网;2:PV注册;3:m.workec.com;4:EC APP;10:代理商添加
        //10时下面type传2；其他全传1
        addBizJSONObj.put("type", 2);
        //商机侧要求新建企业时统一传8
        addBizJSONObj.put("sourceId", 8);
        nsqProducer.produceAsyn(nsqProperties.NSQ_TOPIC_CREATE_BIZ, addBizJSONObj.toString().getBytes());
        logger.info("发送新增商机消息，args：{}", addBizJSONObj.toString());
    }


    @Test
    public void isExsitCorpNameTest() {

        boolean a = false;
        try {
            a = corpInfoService.isExsitCorpName("abcssssss");
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Test
    public void getVaildProtectInfoByCnameTest() throws Exception {
        AgentProtectDTO abc = agentProtectDubboService.getValidCorpProtectInfoByCName("TEST12");
        System.out.println(abc);
    }

}
