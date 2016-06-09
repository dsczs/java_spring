package com.dsczs.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public static void main(String[] args) {
//        HelloWorld helloworld = new HelloWorld();
//        helloworld.setName("zhanggang");
//        helloworld.hello();
        //ApplicationContext 代表IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) ctx.getBean(HelloWorld.class);
        helloWorld.hello();
        
        Car car = ctx.getBean(Car.class);
        car.toString();
        
        Person person = (Person)ctx.getBean("person");
        System.out.println(person);
    }

}
