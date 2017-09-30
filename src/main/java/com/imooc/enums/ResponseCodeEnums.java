package com.imooc.enums;

/**
 * @author KeeYang on 2017/9/29.
 * @Description :
 */
public enum ResponseCodeEnums {
    SUCCESS("0","success"),FAIL("1","fail");

    private String code;

    private String desc;

    ResponseCodeEnums(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
