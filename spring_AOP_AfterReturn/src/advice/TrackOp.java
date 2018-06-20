package advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOp {
	@Pointcut("execution(* mailclass.Sample.*(..))")
	public void k() {}
	
	@AfterReturning(
			pointcut="execution(* mailclass.Sample.*(..))", returning="result"
			)
	public void myadvice(JoinPoint jp, Object result) {
		
		System.out.println();
		System.out.println("Advice");
		System.out.println("Model Signature : "+jp.getSignature());
		System.out.println("Result : "+result);
		System.out.println("End of Advice");
	}
}
