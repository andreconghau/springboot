package com.andre.study;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DesktopConfig {
    /* Nếu method được đánh dấu bởi @Bean có tham số truyền vào,
    thì Spring Boot sẽ tự inject các Bean đã có trong Context vào làm tham số.
     */

    @Bean("desktopDell")
    DesktopDell desktopDellConfig(Desktop desktop) {
        return new DesktopDell(desktop);
    }

    @Bean("desktop")
    Desktop desktopConfig() {
        return new Desktop(2);
    }
}
