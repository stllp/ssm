package com.lvlp.stu.relation.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author lvlp
 * @create 2024/9/9 20:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Integer orderId;
    private String orderName;
    // 一个订单对应一个用户
    private Customer customer;
}
