package pl.sda.chuck.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Aspect
@Component
@Slf4j
public class CalculateInvocationTimeAspect {

    @PostConstruct
    public void log() {
        log.info("Aspect properly invoked.");
    }

    @Around("@annotation(pl.sda.chuck.aspect.CalculateInvocationTime)")
    public Object calculate(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //start stoper
        //stop stoper
        //log diff
        Object proceed = proceedingJoinPoint.proceed();
        return proceed;
    }
}