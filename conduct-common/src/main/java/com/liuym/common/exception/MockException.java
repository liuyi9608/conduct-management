package com.liuym.common.exception;

/**
 * dubbo 降级时抛出的异常类
 */
public class MockException extends RuntimeException {

    public MockException(String msg) {
        super(msg);
    }
}
