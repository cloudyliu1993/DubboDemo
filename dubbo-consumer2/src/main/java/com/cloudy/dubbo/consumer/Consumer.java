package com.cloudy.dubbo.consumer;

import com.cloudy.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/6/29.
 */
public class Consumer {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("Consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        while (true) {
            Thread.sleep(1000);
            System.out.println(demoService.getPermissions(3l));
        }
    }

}
