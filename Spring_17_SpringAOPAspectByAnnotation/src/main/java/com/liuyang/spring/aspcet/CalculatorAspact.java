package com.liuyang.spring.aspcet;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect //标识为是一个切面
public class CalculatorAspact {

    //设置共用的切入点表达式
    @Pointcut("execution(* com.liuyang.spring.aspcet.CalculatorImpl.*(..))")
    public void pointCut(){}


    /**
     * 前置通知
     */
    //标识 任意访问修饰符 包下的 任意方法任意参数
    //@Before("execution(* com.liuyang.spring.aspcet.CalculatorImpl.*(..))")
    @Before("pointCut()")
    public void beforeAdviceMethods(JoinPoint joinPoint) {
        //获取方法名
        Signature signature = joinPoint.getSignature();
        String methodName = signature.getName();
        System.out.println("methodName = " + methodName);
        //获取方法参数
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("CalculatorAspact.beforeAdviceMethods , 前置通知方法执行了");
    }

    @After("pointCut()")
    public void afterAdviceMethod(){
        System.out.println("CalculatorAspact.afterAdviceMethod,后置方法执行了");
    }

    @AfterReturning(value = "pointCut()",returning = "result")
    public void afterReturnAdviceMethod(JoinPoint joinPoint,Object result){
        Signature signature = joinPoint.getSignature();
        String methodName = signature.getName();
        System.out.println("methodName = " + methodName+"返回值结果为:"+ result);
        System.out.println("返回通知");

    }

    @AfterThrowing(value = "pointCut()",throwing = "exception")
    public void throwAdviceMethod(JoinPoint joinPoint,Throwable exception){
        System.out.println("joinPoint.getSignature().getName() = " + joinPoint.getSignature().getName());
        System.out.println("异常通知");
        System.out.println("exception = " + exception);
    }


    @Around("pointCut()")
    public Object surroundingNotificationMethod(ProceedingJoinPoint proceedingJoinPoint){
        Object result = null;
        try {
            System.out.println("环绕通知 --> 前置通知");
            result = proceedingJoinPoint.proceed();
            System.out.println("环绕通知 --> 返回通知");
        } catch (Throwable e) {
            System.out.println("环绕通知 --> 异常通知");
        }finally {
            System.out.println("环绕通知 --> 后置通知");
        }
        return result;
    }


}
