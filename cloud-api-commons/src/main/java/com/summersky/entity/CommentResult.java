package com.summersky.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lenovo
 * @Authur:zengfanbin
 * @Date:2020-4-18
 * @Time:11:02
 * @Description:前后端分离，向前台传数据的通用类，需要传递的状态码，状态信息，还有数据
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentResult <T>{
    private Integer code;
    private String massage;
    private T data;

    public CommentResult(Integer code,String massage){
        this(code,massage,null);
    }
}
