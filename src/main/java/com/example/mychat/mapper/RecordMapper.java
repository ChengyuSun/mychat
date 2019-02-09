package com.example.mychat.mapper;

import com.example.mychat.entity.Record;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Chengyu Sun
 * @Description:
 * @Date: Created in 2019/2/4 16:53
 */
@Mapper
@Repository
public interface RecordMapper {
    @Insert("insert into record(line ,time,user_name) values(#{record.line},#{record.time},#{record.userName})")
    int addRecord(@Param("record")Record record);

    @Select("select * from record where user_name=#{userName}")
    @Results({
            @Result(property = "line",column = "line"),
            @Result(property = "time",column = "time"),
            @Result(property = "userName",column = "user_name")
    })
    List<Record> findByUserName(String userName);
}
