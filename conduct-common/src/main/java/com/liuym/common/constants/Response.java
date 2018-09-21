package com.liuym.common.constants;

public class Response<DATA> {

    private int code;
    private String msg;
    private DATA data;

    public Response(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Response(int code, String msg, DATA data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
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

    public DATA getData() {
        return data;
    }

    public void setData(DATA data) {
        this.data = data;
    }

    public static Response success() {
        return new Response(ResponseCodeConstants.SUCCESS_CODE, ResponseCodeConstants.SUCCESS_MSG);
    }

    public static <DATA> Response<DATA> success(DATA data) {
        return new Response<DATA>(ResponseCodeConstants.SUCCESS_CODE, ResponseCodeConstants.SUCCESS_MSG, data);
    }

    public static Response internalServerError() {
        return new Response(ResponseCodeConstants.INTERNAL_SERVER_ERROR_CODE, ResponseCodeConstants.INTERNAL_SERVER_ERROR_MSG);
    }
}
