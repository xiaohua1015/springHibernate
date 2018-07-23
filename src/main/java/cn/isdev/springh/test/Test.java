package cn.isdev.springh.test;

import cn.isdev.springh.service.UserService;
import cn.isdev.springh.bean.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/7/23.
 */
public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = new User();
        user.setName("红红");
        user.setPassword("777");
        UserService userService = (UserService) context.getBean("userService");
        userService.save(user);
    }
}
