package com.ss9_aop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Component
@Aspect
public class OrderAOP {
    @Pointcut("execution(* com.ss9_aop.controller.OrderBookController.show*(..))")

    public void callMethod(){
    }

    @Before("callMethod()")
    public void beforeMethod(JoinPoint joinPoint){
        System.out.println("Bạn đang vào method: " + joinPoint.getSignature().getName() + ", time: " + LocalDateTime.now());
    }
}
