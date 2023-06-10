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
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}

