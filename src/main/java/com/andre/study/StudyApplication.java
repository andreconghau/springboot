package com.andre.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication()
public class StudyApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StudyApplication.class, args);

        // TODO Case @Component context Scan Bean
        Apple apple = context.getBean(Apple.class);
        System.out.println("Instance: " + apple);
        apple.makeIphone();

        // TODO Case @Component auto finding Object and injected through out Interface
        AppleInterface testCallFromInterface = context.getBean(AppleInterface.class);
        System.out.println("Instance: " + testCallFromInterface);
        testCallFromInterface.openFaceId();

        // TODO Case Non @Autowired
        AppleIphone11 appleIphone11 = context.getBean(AppleIphone11.class);
        System.out.println("Instance: 11 " + appleIphone11.appleInterface);
        appleIphone11.appleInterface.openFaceId();

        // TODO Case Has @Autowired
        AppleIphone11 appleIphone11ProMax = context.getBean(AppleIphone11.class);
        System.out.println("Instance 11 ProMax: " + appleIphone11ProMax.appleInterface);
        appleIphone11ProMax.appleWire.openFaceId();

        // TODO Case Primary
        ChargeDevice testChargeDevice = context.getBean(ChargeDevice.class);
        System.out.println("Instance Charge Device: " + testChargeDevice);
        testChargeDevice.ChargePort();


    }

}
