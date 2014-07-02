package cn.kangbao.common.util;

public class ExceptionStackTraceHelper {
    public static String getExceptionStackTrace(Throwable e) {
        String exception = "";
        exception = e.getMessage() + "\n\t";
        for (StackTraceElement stack : e.getStackTrace()) {
            exception += stack.toString() + "\n\t";
        }
        while (!(e.getCause() == null)) {
            e = e.getCause();
            exception = e.getMessage() + "\n\t";
            for (StackTraceElement stack : e.getStackTrace()) {
                exception += stack.toString() + "\n\t";
            }
        }
        return exception;
    }
}
