package com.gmall.common.api;

import com.gmall.common.inerface.ResultCode;

/**
 * 统一返回结果
 */
public class CommonResult<T> {
    private long code;
    private String message;
    private T data;

    public CommonResult(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public CommonResult(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static CommonResult successNoData(){
        return new CommonResult(ResultCodeImpl.SUCCESS.getCode(),ResultCodeImpl.SUCCESS.getMessage());
    }

    public static CommonResult successWithData(){
        return new CommonResult(ResultCodeImpl.SUCCESS.getCode(),ResultCodeImpl.SUCCESS.getMessage());
    }

    public static CommonResult failed(ResultCode resultCode){
        return new CommonResult(resultCode.getCode(),resultCode.getMessage());
    }
    public static CommonResult failed(ResultCode resultCode,String message){
        return new CommonResult(resultCode.getCode(),message);
    }
}
