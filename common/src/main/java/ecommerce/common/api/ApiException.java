package ecommerce.common.api;

public class ApiException extends RuntimeException {
    private InternetErrorCode errorCode;

    public ApiException(InternetErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public InternetErrorCode getErrorCode() {
        return errorCode;
    }
}