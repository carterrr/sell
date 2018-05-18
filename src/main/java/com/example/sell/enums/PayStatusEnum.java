package com.example.sell.enums;

public enum PayStatusEnum {
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),
    ;

    private  Integer code;
    private  String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
