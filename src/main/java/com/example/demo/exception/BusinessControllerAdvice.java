package com.example.demo.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理,只能捕获Controller异常，作用于所有@RequestMapping
 * @author Tong Wei
 *
 */
@ControllerAdvice
public class BusinessControllerAdvice {

	/**
	 * 捕获Eeception异常
	 * @param ex
	 * @return
	 */
	@ResponseBody
	@ExceptionHandler(value=Exception.class)
	public Map<String, Object> exceptionHandle(Exception  ex){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", -1);
		map.put("message", ex.getMessage());
		
		return map;
	}
	
	/**
	 * 捕获BusinessException异常
	 * @param ex
	 * @return
	 */
	@ResponseBody
	@ExceptionHandler(value=BusinessException.class)
	public Map<String, Object> businessExceptionHandle(BusinessException  ex){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", ex.getCode());
		map.put("message", ex.getMsg());
		
		return map;
	}
	
	
}
