package com.andre.lifecycle;

import com.andre.lifecycle.component.BeanCycle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LifecycleApplication {

    public static void main(String[] args) {
        // ApplicationContext chính là container, chứa toàn bộ các Bean
        System.out.println("> Trước khi IoC Container được khởi tạo");
        ApplicationContext context = SpringApplication.run(LifecycleApplication.class, args);
        System.out.println("> Sau khi IoC Container được khởi tạo");

        // Khi chạy xong, lúc này context sẽ chứa các Bean có đánh
        // dấu @Component.
        BeanCycle beanCycle = context.getBean(BeanCycle.class);

        System.out.println("> Trước khi IoC Container destroy BeanCycle");
        ((ConfigurableApplicationContext) context).getBeanFactory().destroyBean(beanCycle);
        System.out.println("> Sau khi IoC Container destroy BeanCycle");

    }

}
