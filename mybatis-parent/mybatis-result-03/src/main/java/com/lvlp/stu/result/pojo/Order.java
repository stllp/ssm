package com.lvlp.stu.result.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : 吕良平
 * @Date: 2024-09-09 17:33
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private String orderId;
    private String orderValue;
}
