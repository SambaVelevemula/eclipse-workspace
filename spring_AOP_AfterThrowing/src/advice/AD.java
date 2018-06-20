package advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AD {
	@AfterThrowing(
			pointcut="execution(* mainclass.MC.*(..))",
			throwing="error"
			)
	public void myAD(JoinPoint jp,Throwable error) {
		System.out.println();
		System.out.println("Advice");
		System.out.println("Model Signature : "+jp.getSignature());
		System.out.println();
		System.out.println("Status : "+error);
		System.out.println();
		System.out.println("End of Advice");
	}
}
