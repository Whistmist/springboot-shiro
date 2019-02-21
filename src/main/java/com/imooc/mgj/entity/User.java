package com.imooc.mgj.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class User {
	@NotBlank(message = "用户名不能为空")
	@Pattern(
	        regexp = "1(([38]\\d)|(5[^4&&\\d])|(4[579])|(7[0135678]))\\d{8}",
	        message = "手机号格式不合法"
	)
	private String username;
	@NotBlank(message = "密码不能为空")
    private String password;
}
