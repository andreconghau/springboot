package com.andre.study;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("trai-tao")
// @Primary
public class Apple implements AppleInterface, ChargeDevice {
    public void makeIphone() {
        System.out.println("We are building iphone device");
    }

    @Override
    public void openFaceId() {
        System.out.println("Opening FaceID on device");
    }

    @Override
    public void ChargePort() {
        System.out.println("Using lightning port");
    }
}
