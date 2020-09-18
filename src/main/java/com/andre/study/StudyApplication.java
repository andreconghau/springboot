package com.andre.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication()
public class StudyApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StudyApplication.class, args);

        Apple apple = context.getBean(Apple.class);
        System.out.println("Instance: " + apple);
        apple.makeIphone();

        AppleInterface testCallFromInterface = context.getBean(AppleInterface.class);
        System.out.println("Instance: " + testCallFromInterface);
        testCallFromInterface.openFaceId();

        AppleIphone11 appleIphone11 = context.getBean(AppleIphone11.class);
        System.out.println("Instance: 11 " + appleIphone11.appleInterface);
        appleIphone11.appleInterface.openFaceId();

        AppleIphone11 appleIphone11ProMax = context.getBean(AppleIphone11.class);
        System.out.println("Instance 11 ProMax: " + appleIphone11ProMax.appleInterface);
        appleIphone11ProMax.appleInterface.openFaceId();

    }

}
