package com.lvlp.stu.relation.mapper;

import com.lvlp.stu.relation.pojo.Order;

/**
 * @Author lvlp
 * @create 2024/9/9 20:12
 */
public interface OrderMapper {

    Order selectOrderAndCustomer(Integer orderId);
}
