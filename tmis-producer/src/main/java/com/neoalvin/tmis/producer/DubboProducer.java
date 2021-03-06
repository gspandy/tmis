package com.neoalvin.tmis.producer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * dubbo提供方
 *
 */
public class DubboProducer
{
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/*.xml");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();
    }
}
