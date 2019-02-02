package com.example.mychat.utile;

import com.example.mychat.controller.vo.ResultVo;

/**
 * @Author: Chengyu Sun
 * @Description:
 * @Date: Created in 2019/2/2 17:12
 */
public class ResultUtile {

    private static ResultVo var(int code,String msg,Object object){
        ResultVo resultVo=new ResultVo();
        resultVo.setCode(code);
        resultVo.setMsg(msg);
        resultVo.setData(object);
        return resultVo;
    }

    public static ResultVo success(Object object){
        return var(200,"成功",object);
    }

    public static ResultVo success(){
        return success(null);
    }

    public static ResultVo wrongAccount(){
        return var(701,"账户不存在",null);
    }

    public static ResultVo wrongPassword(){
        return var(702,"密码错误",null);
    }

}
