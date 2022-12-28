package com.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Aspect
public class LogAOP {
    @Pointcut("execution(* com.controller.BookController.show*(..))")

    public void callMethod(){}

    @Before("callMethod()")
    public void beforeMethod(JoinPoint joinPoint){
        System.out.printf("Bạn đang vào phương thức: " +joinPoint.getSignature().getName() + ",time: " + LocalDateTime.now());
    }
}
