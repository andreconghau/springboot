package com.andre.lifecycle.component;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
@Component
public class BeanCycle {
    @PostConstruct
    public void postConstruct() {
        System.out.println("Đối tượng BeanCycle sau khi khởi tạo sẽ chạy vào đây! => postConstruct()");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Đối tượng bean BeanCycle sau khi bi hủy hoặc container ko còn quản lý sẽ chạy vào đây! => preDestroy()");
    }
}
