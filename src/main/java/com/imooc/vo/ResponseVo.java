package com.imooc.vo;

import lombok.Data;

/**
 * @author KeeYang on 2017/9/29.
 * @Description :
 */
@Data
public class ResponseVo<T> {

    private String code;

    private String desc;

    private T data;

    private long timestamp;

    public ResponseVo(String code, String desc) {
        this.code = code;
        this.desc = desc;
        timestamp = System.currentTimeMillis();
    }

    public ResponseVo(String code, String desc, T data) {
        this.code = code;
        this.desc = desc;
        this.data = data;
        this.timestamp = System.currentTimeMillis();
    }


}
