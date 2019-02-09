package com.example.mychat.controller;

import com.example.mychat.controller.form.LogForm;
import com.example.mychat.controller.form.RecordForm;
import com.example.mychat.controller.vo.ResultVo;
import com.example.mychat.service.UserService;
import com.example.mychat.utile.ResultUtile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    @PostMapping("/login")
    public ResultVo login(@RequestBody LogForm logForm){
        System.out.println("in");
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

    @GetMapping("/{account}/setcookie")
    public ResultVo setCookie(HttpServletResponse response,@PathVariable String account){
        System.out.println("in get");
        Cookie cookie=new Cookie("name",String.valueOf(userService.findNameByAccount(account)));
        response.addCookie(cookie);
        return ResultUtile.success();
    }

//    @PostMapping(value = "/speak")
//    public ResultVo speak(@RequestBody RecordForm recordForm, HttpServletRequest request){
//        Cookie[] cookies =  request.getCookies();
//        if(cookies != null){
//            for(Cookie cookie : cookies){
//                if(cookie.getName().equals("")){
//
//                }
//            }
//        }
//
//    }
}
