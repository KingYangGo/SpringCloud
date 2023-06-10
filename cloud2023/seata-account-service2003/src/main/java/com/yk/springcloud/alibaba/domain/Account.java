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
public class Account {

    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 总额度
     */
    private BigDecimal total;

    /**
     * 已用额度
     */
    private BigDecimal used;

    /**
     * 剩余额度
     */
    private BigDecimal residue;
}


