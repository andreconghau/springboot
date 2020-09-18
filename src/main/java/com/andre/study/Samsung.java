package com.andre.study;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Samsung  implements ChargeDevice{
    @Override
    public void ChargePort() {
        System.out.println("Using USB-TypeC port");
    }
}
