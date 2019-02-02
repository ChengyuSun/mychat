package com.example.mychat.controller;

import com.example.mychat.controller.form.LogForm;
import com.example.mychat.controller.vo.ResultVo;
import com.example.mychat.service.UserService;
import com.example.mychat.utile.ResultUtile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Chengyu Sun
 * @Description:
 * @Date: Created in 2019/2/2 16:01
 */
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value ="/login")
    public ResultVo login(@RequestBody LogForm logForm){
        int flag=userService.login(logForm.getAccount(),logForm.getPassword());
        switch (flag){
            case 0:
                return ResultUtile.wrongAccount();
            case 1:
                return ResultUtile.success();
            case 2:
                return ResultUtile.wrongPassword();
            default:
                return null;
        }
    }

    @GetMapping("/hello")
    public ResultVo hello(){
        return ResultUtile.success();
    }
}
