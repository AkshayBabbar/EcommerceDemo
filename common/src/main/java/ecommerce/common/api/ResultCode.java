package ecommerce.common.api;

public enum ResultCode implements InternetErrorCode {

    SUCCESS(200,"Successfull Operation"),
    FAILED(500,"Failure Operation"),
    UNAUTHORIZED(401,"User Token Failed"),
    VALIDATE_FAILED(404,"Parameter Validation Failed"),
    FORBIDDEN(403,"Permissions Required");


    private long code;
    private String message;


    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
