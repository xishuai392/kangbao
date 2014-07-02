package cn.kangbao.common.exception;

public class SysException extends RuntimeException {

    @Override
    public String toString() {
        return "SysException [message=" + message + "]";
    }

    private String message;

    public SysException(Throwable e, String message) {
        super(message);
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] estack = e.getStackTrace();
        for (StackTraceElement stackTraceElement : estack) {
            sb.append(stackTraceElement.toString());
        }
        this.message = "SysException：" + message + "。异常信息：【" + e.getMessage() + sb.toString() + "】";
    }

    public SysException(Throwable e) {
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] estack = e.getStackTrace();
        for (StackTraceElement stackTraceElement : estack) {
            sb.append(stackTraceElement.toString());
        }
        this.message = "SysException异常信息：【" + e.getMessage() + sb.toString() + "】";
    }

    public SysException(String message) {
        super(message);
        this.message = "SysException：" + message;
    }

}
