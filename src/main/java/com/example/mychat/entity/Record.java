package com.example.mychat.entity;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @Author: Chengyu Sun
 * @Description:
 * @Date: Created in 2019/2/2 12:10
 */
@Data
public class Record {
    private String line;
    private Timestamp time;
    private int userName;
}
