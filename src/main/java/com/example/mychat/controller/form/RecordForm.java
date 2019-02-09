package com.example.mychat.controller.form;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @Author: Chengyu Sun
 * @Description:
 * @Date: Created in 2019/2/4 11:52
 */
@Data
public class RecordForm {
    private Timestamp timestamp;
    private String line;
}
