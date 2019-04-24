package com.qf.emp.mapper;

import com.qf.pojo.EmpExample;
import org.apache.ibatis.session.RowBounds;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class EmpMapperTest {
    EmpMapper mapper;

    @Before
    public void setUp() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        mapper = context.getBean(EmpMapper.class);
    }

    @Test
    public void test() {
        mapper.selectByExample(new EmpExample()).forEach(emp -> System.out.println(emp));
        System.out.println("========");
        mapper.selectByExampleWithRowbounds(new EmpExample(), new RowBounds(2, 5)).forEach(emp -> System.out.println(emp));
    }
}