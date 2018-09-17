package com.ec.corpinfo;

import com.ec.corpcommon.constants.Constants;
import com.ec.corpcommon.utils.DateUtils;
import com.ec.corpinfo.repository.mapper.base.CorpFunctionMapper;
import com.ec.corpinfo.repository.model.entity.CorpFunction;
import com.ec.corpinfo.service.impl.CorpInfoServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.phprpc.util.PHPSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CorpInfoTest {

    private static final Logger logger = LoggerFactory.getLogger(CorpInfoTest.class);

    @Autowired
    private CorpInfoServiceImpl corpInfoServiceImpl;
    @Autowired
    private CorpFunctionMapper corpFunctionMapper;

    @Test
    public void sendInitRandomPwd() {
        corpInfoServiceImpl.sendInitRandomPwd(2160411, "18575670000", "Aa888888");
        logger.info("sendInitRandomPwd:");
    }

    @Test
    public void serializeTest() throws Exception {
        CorpFunction corpFunction = new CorpFunction();
        Byte byte0 = new Byte("1");
//        JSONObject serializeData = new JSONObject();
//        serializeData.put("cs","200");
//        serializeData.put("faxyear", "500");
//        serializeData.put("tel400", "0.3");
//        serializeData.put("fax", "0.3");
//        serializeData.put("sms", "0.1");
//        serializeData.put("tel", "0.1");
//        serializeData.put("min400", "100");

        Map<String, String> serializeData = new HashMap<String, String>();
        serializeData.put("cs","200");
        serializeData.put("faxyear", "500");
        serializeData.put("tel400", "0.3");
        serializeData.put("fax", "0.3");
        serializeData.put("sms", "0.1");
        serializeData.put("tel", "0.1");
        serializeData.put("min400", "100");


        PHPSerializer serializer = new PHPSerializer();
//        corpFunction.setSerializeData(serializeData.toJSONString());
        corpFunction.setSerializeData(new String(serializer.serialize(serializeData),"utf-8"));



        corpFunction.setCorpId(313159879L);
        corpFunction.setTelFun(1);
//                    corpFunction.setFaxUsername();
//                    corpFunction.setFaxPwd();
//                    corpFunction.setFaxCode();
//                    corpFunction.setFaxType();
        corpFunction.setFaxFunction(new Byte("1"));
        corpFunction.setFaxrFunction(byte0);
        corpFunction.setFaxNumber(Constants.EMPTY_STRING);
        corpFunction.setFaxChargeType(byte0);
        corpFunction.setSmsFun(1);
        corpFunction.setCsFun(0);
        corpFunction.setCsOpenTime(DateUtils.convertYMDString2Date("2009-01-01"));
        corpFunction.setCsChargetime(DateUtils.convertYMDString2Date("2010-01-01"));
        corpFunction.setFaxTimeout(DateUtils.convertYMDString2Date("2009-10-01"));
        corpFunction.setAuction(byte0);
//                    corpFunction.setAuctionUname();
//                    corpFunction.setAuctionUpasswd();
        corpFunction.setfax51Open(byte0);
        corpFunction.setMailFun(1);
        corpFunction.setCsTimeout(DateUtils.convertYMDString2Date("2009-01-01"));
        corpFunction.setCsType(3);
        corpFunction.setCsUpdate("0");
        corpFunction.setQqcsUpdate(0);
//        corpFunction.setSerializeData(serializeData.toJSONString());
        corpFunction.setCsWebsite(Constants.EMPTY_STRING);
        corpFunction.setShareType(new Byte("2"));
        corpFunction.setTel400Function(byte0);
        corpFunction.setTel400Timeout(DateUtils.convertYMDString2Date("2010-01-01"));
        corpFunction.setCsInitiative(byte0);
        corpFunction.setCsAnalyze(byte0);
//                    corpFunction.setCsNextcharge(csNextcharge);
        corpFunction.setCsAuto(byte0);
//                    corpFunction.setTelUsername(telUsername);
//                    corpFunction.setTelPwd(telPwd);
        corpFunction.setComboFunction(byte0);
        corpFunction.setQq(byte0);
        corpFunction.setEcFun(0);
        corpFunction.setBoxFun(0);
        corpFunction.setEstateFunction(byte0);
        corpFunction.setWeixinFun(0);
        corpFunction.setQihuFunction(byte0);
        corpFunction.setEimFun(1);
        corpFunction.setUserQQFun(0);
        corpFunction.setWorkWeixinFun(0);
        int row = 0;
        row = corpFunctionMapper.insert(corpFunction);
        if (row > 0) {
            logger.info("corpFunctionMapper.insert success");
            row = 0;
        }
    }

}
