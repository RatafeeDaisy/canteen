package com.canteen.mapper;

import com.canteen.entity.CanteenCustomer;

public interface CanteenCustomerMapper {
    int deleteByPrimaryKey(String customerId);

    int insert(CanteenCustomer row);

    int insertSelective(CanteenCustomer row);

    CanteenCustomer selectByPrimaryKey(String customerId);

    int updateByPrimaryKeySelective(CanteenCustomer row);

    int updateByPrimaryKey(CanteenCustomer row);
}