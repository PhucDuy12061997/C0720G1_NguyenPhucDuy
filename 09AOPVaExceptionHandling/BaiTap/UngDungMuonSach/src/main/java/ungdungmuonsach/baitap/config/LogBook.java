package ungdungmuonsach.baitap.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;

@Aspect
public class LogBook {
    @AfterThrowing(pointcut = "execution(public * ungdungmuonsach.baitap.service.BookService.*(..))", throwing = "e")
    public void logError(JoinPoint joinPoint, Exception e) {
        String className = joinPoint.getClass().getSimpleName();
//        String className = String.valueOf(joinPoint.getTarget().getClass());
        String returnType = joinPoint.getSignature().getDeclaringType().getName();
        String methodName = joinPoint.getSignature().getName();
        String argsName = Arrays.toString(joinPoint.getArgs());
        System.err.printf("Warning :)): %s.%s.%s.%s: %s", className,
                returnType,
                methodName,
                argsName,
                e.getMessage());
    }

    @After("execution(public * ungdungmuonsach.baitap.service.BookService.save(..))" + " || execution(public * ungdungmuonsach.baitap.service.BookService.borrow(..))"
            + " || execution(public * ungdungmuonsach.baitap.service.BookService.giveBack(..))")
    public void logChange(JoinPoint joinPoint) {
        String className = joinPoint.getClass().getSimpleName();
        String returnType = joinPoint.getSignature().getDeclaringType().getName();
        String methodName = joinPoint.getSignature().getName();
        String argsName = Arrays.toString(joinPoint.getArgs());
        System.err.printf("Warning : %s.%s.%s.%s: %s", className,
                returnType,
                methodName,
                argsName,
                "So luong sach da thay doi !");
    }
}
