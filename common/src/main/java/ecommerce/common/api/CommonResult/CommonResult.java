package ecommerce.common.api.CommonResult;

import ecommerce.common.api.ResultCode;
import ecommerce.common.api.exception.InternetErrorCode;

public class CommonResult<T> {

    private long code;
    private String message;
    private T data;

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public CommonResult(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonResult() {
    }

    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    public static <T> CommonResult<T> success(T data, String message) {
        return new CommonResult<>(ResultCode.SUCCESS.getCode(), message, data);
    }

    public static <T> CommonResult<T> failed(InternetErrorCode errorCode) {
        return new CommonResult<>(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMessage(), null);
    }

    public static <T> CommonResult<T> failed(InternetErrorCode errorCode, String message) {
        return new CommonResult<>(ResultCode.FAILED.getCode(), message, null);
    }

    public static <T> CommonResult<T> failed(String message) {
        return new CommonResult<>(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMessage(), null);
    }

    public static <T> CommonResult<T> failed(){
        return new CommonResult<>(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMessage(), null);

    }

//    public static <T> CommonResult<T> success(T data, String message) {
//        return new CommonResult<T>(ResultCode.SUCCESS.getCode(), message, data);
//    }
//
//    public static <T> CommonResult<T> success(T data) {
//        return new CommonResult<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
//    }

//    public static <T> CommonResult<T> success(T data, String message) {
//        return new CommonResult<T>(ResultCode.SUCCESS.getCode(), message, data);
//    }

}
