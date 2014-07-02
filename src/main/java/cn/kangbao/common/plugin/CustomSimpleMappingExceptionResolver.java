package cn.kangbao.common.plugin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.transaction.CannotCreateTransactionException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import cn.kangbao.common.exception.BaseAppException;
import cn.kangbao.common.exception.SysExceptionCode;
import cn.kangbao.common.log.AmManagerLogger;
import cn.kangbao.common.util.MessageResourceHelper;

public class CustomSimpleMappingExceptionResolver extends
		SimpleMappingExceptionResolver {
	
	final static AmManagerLogger logger=AmManagerLogger.getLogger(CustomSimpleMappingExceptionResolver.class);

	@Override
	protected ModelAndView doResolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {

		//记录所有异常日志
		logger.error(ex);
		
		String errCode;
		String msg;
		if (ex instanceof BaseAppException) {
			errCode = ((BaseAppException) ex).getCode();
			msg = ((BaseAppException) ex).getLocaleMessage();
		} else if (ex instanceof DuplicateKeyException) {
			errCode = SysExceptionCode.DUPLICATE_KEY_EXCEPTION;
			msg = MessageResourceHelper.getMessage(errCode);
		} else if (ex instanceof DataIntegrityViolationException) {
			errCode = SysExceptionCode.DATA_INTEGRITY_VIOLATION_EXCEPTION;
			msg = MessageResourceHelper.getMessage(errCode);
		} else if (ex instanceof BadSqlGrammarException) {
			errCode = SysExceptionCode.BAD_SQL_GRAMMAR_EXCEPTION;
			msg = MessageResourceHelper.getMessage(errCode);
		} else if (ex instanceof DataAccessException) {
			errCode = SysExceptionCode.DATABASE_ACCESS_EXCEPTION;
			msg = MessageResourceHelper.getMessage(errCode);
		} else if (ex instanceof CannotCreateTransactionException) {
			errCode = SysExceptionCode.DATABASE_ACCESS_EXCEPTION;
			msg = MessageResourceHelper.getMessage(errCode);
		} else {
			errCode = SysExceptionCode.UNKNOW_EXPCEPTION;
			msg = MessageResourceHelper.getMessage(errCode);
		}
		String responseMsg = "{\"msg\":\"" + msg
				+ "\",\"success\":false,\"errCode\":\"" + errCode + "\"}";
		try {
			response.setContentType("text/json;charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.write(responseMsg);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
