package by.peshkur.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
    //this is where add all of our related advices for logging

    //let's start with an @before advice

//    @Before("execution(public void add*())")

    @Before("execution(* add*(by.peshkur.aopdemo.Account))")

    public void beforeAddAccountAdvice() {

        System.out.println("\n=====>>> Executing @Before advice on method");

    }

}
