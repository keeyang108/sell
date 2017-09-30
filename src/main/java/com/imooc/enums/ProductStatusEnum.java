package com.imooc.enums;

/**
 * @author KeeYang on 2017/9/28.
 * @Description :
 */
public enum ProductStatusEnum {

    UP(0,"上架中"),
    DOWN(1,"已下架");

    private Integer code;

    private String desc;

    ProductStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
