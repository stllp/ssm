package com.lvlp.stu.relation.mapper;

import com.lvlp.stu.relation.pojo.Customer;

/**
 * @Author lvlp
 * @create 2024/9/9 20:12
 */
public interface CustomerMapper {
    Customer selectCustomerAndOrders(Integer customerId);
}
