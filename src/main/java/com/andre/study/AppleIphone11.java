package com.andre.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope("prototype")
public class AppleIphone11 {
    public AppleInterface appleInterface;
    @Autowired
    public AppleInterface appleWire;

    @Autowired
    // @Qualifier("sam-sung")
    @Qualifier("trai-tao")
    public ChargeDevice chargeDevice;

    public ChargeDevice getChargeDevice() {
        return chargeDevice;
    }

    public void setChargeDevice(ChargeDevice chargeDevice) {
        this.chargeDevice = chargeDevice;
    }

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
