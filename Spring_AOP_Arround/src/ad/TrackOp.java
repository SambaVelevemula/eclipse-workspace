package ad;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;

@Aspect
public class TrackOp {

	@Pointcut("execution(* test.Operation.*(..))")
	public void p() {}
	
	@Around("p()")
	public Object myAd(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("Before ");
		Object obj=pjp.proceed();
		System.out.println("After");
		return obj;
	}
	
}
