package com.httptool;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by huyoucheng on 2018/10/20.
 */
@Configuration
@Aspect
public class ResponseExceptionAspect {
    @Autowired
    HttpServletResponse response;

    static Logger logger = Logger.getLogger(ResponseExceptionAspect.class);

    public ResponseExceptionAspect(){}

    @Pointcut("execution(* com.controller..*(..)) ")
    public void response(){}

    @Around("response()")
    public Object runControllerMethod(ProceedingJoinPoint joinPoint) throws Exception{
        Object object = null;
        try {
            object = joinPoint.proceed();
        } catch (Throwable throwable) {
            logger.error(throwable);
            response.setStatus(606);
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            response.getWriter().write(throwable.getMessage());
        }
        return object;
    }

}
