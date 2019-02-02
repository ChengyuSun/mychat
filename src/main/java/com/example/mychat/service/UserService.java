package com.example.mychat.service;

import com.example.mychat.entity.User;
import com.example.mychat.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Chengyu Sun
 * @Description:
 * @Date: Created in 2019/2/2 16:01
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public int login(String account,String password){
        User user=userMapper.findByAccount(account);
        if(user==null){
            return 0;
        }
        else if(user.getPassword().equals(password)){
            return 1;
        }
        else {
            return 2;
        }
    }
}
