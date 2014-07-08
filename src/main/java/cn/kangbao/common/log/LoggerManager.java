package cn.kangbao.common.log;

import java.text.MessageFormat;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.kangbao.common.exception.ExceptionHandler;

/**
 * 日志封装类 <Description> <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年7月8日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.common.log <br>
 */

public final class LoggerManager {
    Logger logger = null;

    public String name = "";

    public final static ConcurrentHashMap<String, LoggerManager> loggerMap = new ConcurrentHashMap<String, LoggerManager>();

    private LoggerManager(String name) {
        this.logger = LoggerFactory.getLogger(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static LoggerManager getLogger(String name) {

        LoggerManager zsmartLogger = loggerMap.get(name);
        if (zsmartLogger == null) {
            zsmartLogger = new LoggerManager(name);
            loggerMap.remove(name, zsmartLogger);
            loggerMap.putIfAbsent(name, zsmartLogger);
        }
        return zsmartLogger;
    }

    public static LoggerManager getLogger(Class<?> clazz) {
        return getLogger(clazz.getName());
    }

    public void debug(String msg) {
        if (logger.isDebugEnabled()) {
            msg = dealMsg(msg);
            logger.debug(msg);
        }
    }

    public void debug(String msg, Object arg) {
        if (logger.isDebugEnabled()) {
            msg = dealMsg(msg, arg);
            logger.debug(msg);
        }
    }

    public void debug(String msg, Object arg1, Object arg2) {
        if (logger.isDebugEnabled()) {
            msg = dealMsg(msg, arg1, arg2);
            logger.debug(msg);
        }
    }

    public void debug(String msg, Object... args) {
        if (logger.isDebugEnabled()) {
            msg = dealMsg(msg, args);
            logger.debug(msg);
        }
    }

    public void debug(String msg, Throwable t) {
        if (logger.isDebugEnabled()) {
            logger.debug(msg, t);
        }
    }

    public void debug(Throwable t) {
        if (logger.isDebugEnabled()) {
            logger.debug("", t);
        }
    }

    // ------------------------------------------------------------
    public void info(String msg) {
        if (logger.isInfoEnabled()) {
            msg = dealMsg(msg);
            logger.info(msg);
        }
    }

    public void info(String msg, Object arg) {
        if (logger.isInfoEnabled()) {
            msg = dealMsg(msg, arg);
            logger.info(msg);
        }
    }

    public void info(String msg, Object arg1, Object arg2) {
        if (logger.isInfoEnabled()) {
            msg = dealMsg(msg, arg1, arg2);
            logger.info(msg);
        }
    }

    public void info(String msg, Object... args) {
        if (logger.isInfoEnabled()) {
            msg = dealMsg(msg, args);
            logger.info(msg);
        }
    }

    public void info(String msg, Throwable t) {
        if (logger.isInfoEnabled()) {
            logger.info(msg, t);
        }
    }

    public void info(Throwable t) {
        if (logger.isInfoEnabled()) {
            logger.info("", t);
        }
    }

    // -----------------------------------------------------------------
    public void warn(String msg) {
        if (logger.isWarnEnabled()) {
            msg = dealMsg(msg);
            logger.warn(msg);
        }
    }

    public void warn(String msg, Object arg) {
        if (logger.isWarnEnabled()) {
            msg = dealMsg(msg, arg);
            logger.warn(msg);
        }
    }

    public void warn(String msg, Object arg1, Object arg2) {
        if (logger.isWarnEnabled()) {
            msg = dealMsg(msg, arg1, arg2);
            logger.warn(msg);
        }
    }

    public void warn(String msg, Object... args) {
        if (logger.isWarnEnabled()) {
            msg = dealMsg(msg, args);
            logger.warn(msg);
        }
    }

    public void warn(String msg, Throwable t) {
        if (logger.isWarnEnabled()) {
            logger.warn(msg, t);
        }
    }

    public void warn(Throwable t) {
        if (logger.isWarnEnabled()) {
            logger.warn("", t);
        }
    }

    // -----------------------------------------------------------------
    public void error(String msg) {
        if (logger.isErrorEnabled()) {
            msg = dealMsg(msg);
            logger.error(msg);
        }
    }

    public void error(String msg, Object arg) {
        if (logger.isErrorEnabled()) {
            msg = dealMsg(msg, arg);
            logger.error(msg);
        }
    }

    public void error(String msg, Object arg1, Object arg2) {
        if (logger.isErrorEnabled()) {
            msg = dealMsg(msg, arg1, arg2);
            logger.error(msg);
        }
    }

    public void error(String msg, Object... args) {
        if (logger.isErrorEnabled()) {
            msg = dealMsg(msg, args);
            logger.error(msg);
        }
    }

    public void error(String msg, Throwable t) {
        if (logger.isErrorEnabled()) {
            logger.error(msg, t);
        }
    }

    public void error(Throwable t) {
        if (logger.isErrorEnabled()) {
            logger.error("", t);
        }
    }

    private String dealMsg(String msg, Object... args) {

        if (args != null && args.length > 0) {
            msg = MessageFormat.format(msg, args);
        }
        return new StringBuffer().append(this.name).append(": ").append(msg).toString();
    }

    public static void main(String args[]) {

        String res = MessageFormat.format("{1}  {0} {2}", "abc", "cde");
        System.out.println(res);

        LoggerManager log = LoggerManager.getLogger(LoggerManager.class);

        try {
            throw ExceptionHandler.publish("111", ExceptionHandler.BUSS_ERROR);
        }
        catch (Exception e) {
            log.error(e);
        }

        log.error("{0} sssssss{1}", "1111111111", "3333333333333");
    }
}
