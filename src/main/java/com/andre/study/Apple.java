package com.andre.study;

import org.springframework.stereotype.Component;

@Component
public class Apple implements AppleInterface {
    public void makeIphone() {
        System.out.println("We are building iphone device");
    }

    @Override
    public void openFaceId() {
        System.out.println("Opening FaceID on device");
    }
}
