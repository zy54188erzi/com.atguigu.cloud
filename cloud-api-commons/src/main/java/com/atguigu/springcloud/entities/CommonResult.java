package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by zhangY on 2022/5/23 20:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{
    private Integer code;
    private String message;
    private T data;

    //作为消息转发给前端的方法
    public CommonResult(Integer code, String message){
        this(code, message, null);
    }
}
