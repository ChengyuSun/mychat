package com.example.mychat.mapper;

import com.example.mychat.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author: Chengyu Sun
 * @Description:
 * @Date: Created in 2019/2/2 15:54
 */
@Mapper
@Repository
public interface UserMapper {

    @Select("select * from user where account=#{account}")
    @Results({
            @Result(property = "name",column = "name"),
            @Result(property = "account",column = "account"),
            @Result(property = "password",column = "password")
    })
    User findByAccount(String account);


}
