package com.ec.corpinfo.api;

import com.ec.corpcommon.thrift.CorpInfoApi;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class ApiTest {

    private static CorpInfoApi.Client client;
    private static TTransport transport;

    @Before
    public void init() throws TTransportException {
        System.out.println("...........连接thrift协议开始..............");
        transport = new TFramedTransport(new TSocket("localhost", 2052));
        transport.open();
        TProtocol protocol = new TBinaryProtocol(transport);
        client = new CorpInfoApi.Client(protocol);
        System.out.println("====连接成功=====");
    }

    @After
    public void close() {
        transport.close();
        System.out.println("transport is close.......");
    }

    @Test
    public void createCorpTest() {
        String content = "test";

        try {
            String result = client.createCorp(content);
            System.out.println("createCorpTest:" + result);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
