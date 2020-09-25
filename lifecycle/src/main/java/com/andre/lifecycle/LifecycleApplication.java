package com.andre.lifecycle;

import com.andre.lifecycle.component.BeanCycle;
import com.andre.lifecycle.connector.DatabaseConnector;
import com.andre.lifecycle.model.User;
import com.andre.lifecycle.service.UserJdbcTemplate;
import com.andre.lifecycle.service.UserMybatis;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
@MapperScan("com.andre.lifecycle.mapper")
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

        // TODO @Bean Connector
        DatabaseConnector mysql = (DatabaseConnector) context.getBean("mysqlConnector");
        mysql.connect();

        DatabaseConnector mongodb = (DatabaseConnector) context.getBean("mongodbConnector");
        mongodb.connect();

        // Todo test JDBC template
        UserJdbcTemplate userJdbcTemplate = context.getBean(UserJdbcTemplate.class);
        userJdbcTemplate.findAllUser();

        // TODO test Mybatis
        UserMybatis userMybatis = context.getBean(UserMybatis.class);
        userMybatis.findAllUsers();
    }

}
