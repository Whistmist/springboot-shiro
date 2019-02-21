package com.imooc.mgj.exceptionhandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ResponseBody
	@ExceptionHandler(RuntimeException.class)
	public Map<String, Object> exceptionHandle(){
		Map<String, Object> map=new HashMap<>();
		map.put("code", "500");
		map.put("msg", "系统出错，请稍后重试");
		return map;
	}
	
}
