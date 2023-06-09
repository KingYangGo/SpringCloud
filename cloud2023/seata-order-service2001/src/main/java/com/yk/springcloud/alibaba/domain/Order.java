package com.yk.springcloud.alibaba.domain;/**
 * @Title: Order
 * @Author YangK
 * @Package com.yk.springcloud.alibaba.domain
 * @Date 2023/6/9 19:50
 * @description:
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 *
 * @author YangCoder
 * @version 2023/6/9 19:50
 * @since JDK8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order
{
    private Long id;

    private Long userId;

    private Long productId;

    private Integer count;

    private BigDecimal money;

    /**
     * 订单状态：0：创建中；1：已完结
     */
    private Integer status;
}


