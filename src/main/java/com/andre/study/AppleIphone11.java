package com.andre.study;

import org.springframework.stereotype.Component;

@Component
public class AppleIphone11 {
    public AppleInterface appleInterface;

    public AppleIphone11() {
        this.appleInterface = new Apple();
    }

    public AppleInterface getAppleInterface() {
        return appleInterface;
    }

    public void setAppleInterface(AppleInterface appleInterface) {
        this.appleInterface = appleInterface;
    }
}
