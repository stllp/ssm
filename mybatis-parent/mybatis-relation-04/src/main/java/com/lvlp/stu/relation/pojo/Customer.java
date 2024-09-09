package com.lvlp.stu.relation.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author lvlp
 * @create 2024/9/9 20:09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private Integer customerId;
    private String customerName;
    //一个用户有多个订单
    private List<Order> orderList;
}
