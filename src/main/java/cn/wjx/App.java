package cn.wjx;


import cn.wjx.ssm.domain.User;
import cn.wjx.ssm.mapper.UserMapper;
import cn.wjx.ssm.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class App {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private IUserService userService;

    @Test
    public void testSelectAll(){
        userMapper.selectAll().forEach(System.out::println);
    }

    @Test
    public void testListAll(){
        userService.listAll().forEach(System.out::println);
    }
}