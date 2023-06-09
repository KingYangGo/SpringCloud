package com.yk.springcloud.alibaba.dao;/**
 * @Title: OrderDao
 * @Author YangK
 * @Package com.yk.springcloud.alibaba.dao
 * @Date 2023/6/9 19:51
 * @description:
 */

import com.yk.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author YangCoder
 * @version 2023/6/9 19:51
 * @since JDK8
 */
@Mapper
public interface OrderDao {

    /**
     * 创建订单
     */
    void create(Order order);

    /**
     * 修改订单金额，从0改为1
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}



