package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: STARTs return book in library");

        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
            targetMethodResult = "Java Cooking Book";
        } catch (Throwable e) {
            System.out.println("aroundReturnBookLoggingAdvice: EXCEPTION " + e);
            throw e;
        }

        System.out.println("aroundReturnBookLoggingAdvice: ENDs return book in library");

        return targetMethodResult;
    }
}
