package ecommerce.common.api;

public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(InternetErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
