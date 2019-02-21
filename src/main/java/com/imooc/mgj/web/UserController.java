package com.imooc.mgj.web;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.mgj.com.Result;
import com.imooc.mgj.com.ResultCode;
import com.imooc.mgj.entity.User;


@RestController
@RequestMapping("/sys/user")
public class UserController {

    @RequestMapping("/login")
    public Result login(@RequestBody @Valid User loginUser) {
        return new Result(ResultCode.SUCCESS,loginUser);
    }
}
