package com.liuym.common.exception;

public class ServiceException extends Exception{
    private int code;
    private String msg;

    public ServiceException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 该兜底异常放这个父类中，当抛异常时报错信息如右：com.ec.corpcommon.exception.ServiceException: 内部服务器错误
     * 这样就不知道具体是哪个服务出问题了，故将其置于子类中
     * @return
     */
//    public static ServiceException internalServerError() {
//        return new ServiceException(ResponseCodeConstants.INTERNAL_SERVER_ERROR_CODE, ResponseCodeConstants.INTERNAL_SERVER_ERROR_MSG);
//    }

    @Override
    public String toString() {
        return "ServiceException{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
