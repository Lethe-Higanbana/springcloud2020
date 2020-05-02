package com.summersky.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.summersky.entity.CommentResult;

/**
 * @author Lenovo
 * @Authur:zengfanbin
 * @Date:2020-4-30
 * @Time:11:23
 * @Description:
 */
public class CustomerBlockHandler {
    public static CommentResult handlerException(BlockException exception) {
        return new CommentResult(444, "客户自定义，global handlerException---1");
    }

    public static CommentResult handlerException2(BlockException exception) {
        return new CommentResult(444, "客户自定义，global handlerException---2");
    }
}
