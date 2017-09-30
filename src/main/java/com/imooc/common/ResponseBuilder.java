package com.imooc.common;

import com.imooc.enums.ResponseCodeEnums;
import com.imooc.vo.ResponseVo;

/**
 * @author KeeYang on 2017/9/29.
 * @Description :
 */
public class ResponseBuilder {

    public static ResponseVo success(){
        return new ResponseVo(ResponseCodeEnums.SUCCESS.getCode(),ResponseCodeEnums.SUCCESS.getDesc());
    }

    public static <T> ResponseVo<T> success(T data){
        return new ResponseVo(ResponseCodeEnums.SUCCESS.getCode(),ResponseCodeEnums.SUCCESS.getDesc(),data);
    }

    public static <T> ResponseVo<T> fail(T data){
        return new ResponseVo(ResponseCodeEnums.FAIL.getCode(),ResponseCodeEnums.FAIL.getDesc(),data);
    }

    public static <T> ResponseVo<T> fail(String desc){
        return new ResponseVo(ResponseCodeEnums.FAIL.getCode(),desc);
    }

    public static <T> ResponseVo<T> fail(String desc,T data){
        return new ResponseVo(ResponseCodeEnums.FAIL.getCode(),desc,data);
    }

}
