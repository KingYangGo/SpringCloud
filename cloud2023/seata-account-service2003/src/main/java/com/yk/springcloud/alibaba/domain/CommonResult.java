package com.yk.springcloud.alibaba.domain;/**
 * @Title: CommonResult
 * @Author YangK
 * @Package com.yk.springcloud.alibaba.domain
 * @Date 2023/6/9 19:50
 * @description:
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author YangCoder
 * @version 2023/6/9 19:50
 * @since JDK8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>
{
    private Integer code;
    private String  message;
    private T       data;

    public CommonResult(Integer code, String message)
    {
        this(code,message,null);
    }
}

