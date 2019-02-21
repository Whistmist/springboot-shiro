package com.imooc.mgj.com;

import lombok.Getter;

@Getter
public enum ResultCode {
	
	SUCCESS(0, "请求成功"),
    WARN(-1, "网络异常，请稍后重试");

    private int code;
    private String msg;
    ResultCode(int code, String msg) {
        this.msg = msg;
    }
}
