package com.andre.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope("prototype")
public class AppleIphone11 {
    public AppleInterface appleInterface;

    @Autowired
    public AppleInterface appleWire;

    public AppleIphone11() {
        this.appleInterface = new Apple();
    }

    public AppleInterface getAppleInterface() {
        return appleInterface;
    }

    public void setAppleInterface(AppleInterface appleInterface) {
        this.appleInterface = appleInterface;
    }

    public AppleInterface getAppleWire() {
        return appleWire;
    }

    public void setAppleWire(AppleInterface appleWire) {
        this.appleWire = appleWire;
    }
}
