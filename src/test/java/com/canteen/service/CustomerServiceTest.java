package com.canteen.service;

import com.canteen.entity.CanteenCustomer;
import com.canteen.mapper.CanteenCustomerMapper;
import com.canteen.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;


public class CustomerServiceTest {

    @Test
    public void addCustomer() {
        //创建customer对象
        CanteenCustomer customer = new CanteenCustomer();
        customer.setCreateTime(new Date(System.currentTimeMillis()));
        customer.setUpdateTime(new Date(System.currentTimeMillis()));
        customer.setCustomerId("10019");
        customer.setCustomerName("James");
        customer.setCustomerMobile("12345678912");
        customer.setCustomerAddress("广州商学院");
        customer.setCustomerPostscript("hello");
        //插入customer对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            CanteenCustomerMapper customerMapper = sqlSession.getMapper(CanteenCustomerMapper.class);
            int result = customerMapper.insert(customer);
            sqlSession.commit();
            System.out.println(result);
        } catch (Exception e){
            sqlSession.rollback();
        }
    }
}