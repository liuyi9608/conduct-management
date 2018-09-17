package com.liuym.common.exception;

/**
 * dubbo 降级时抛出的异常类
 *
 * @Package:
 * @datetime: 2018/8/7 14:53
 * @author: lk
 * @copyright: ec
 */
public class MockException extends RuntimeException {

    public MockException(String msg) {
        super(msg);
    }
}
