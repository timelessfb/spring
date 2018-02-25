package test;

import Service.UserService;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Demo1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        UserService userService=(UserService) ac.getBean("userServiceId");
        userService.apple();
    }



}
