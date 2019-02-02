package com.example.mychat.controller.vo;

import lombok.Data;

/**
 * @Author: Chengyu Sun
 * @Description:
 * @Date: Created in 2019/2/2 16:50
 */
@Data
public class ResultVo {
    private int code;
    private String msg;
    private Object data;
}
