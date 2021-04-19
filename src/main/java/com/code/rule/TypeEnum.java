package com.code.rule;

/**
 * 建议不能有setter，避免给后面的开发者造成麻烦
 * Created by yangchanghao on 2020/1/3 16:40.
 */

public enum TypeEnum {
    TEST(1,"你好"),
    TEST2(2,"你好，世界");

    private Integer code;
    private String msg;
    TypeEnum(Integer code, String msg){
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
