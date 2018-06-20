package advice;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.AfterAdvice;
@Aspect
public class TrackOperation implements AfterAdvice{
	
	@Pointcut("execution(* test.Operation.k*(..))")  
    public void k(){}//pointcut name  
      
    @After("k()")//applying pointcut on before advice  
    public void myadvice(JoinPoint jp)//it is advice (before advice)  
    {  
        System.out.println("additional concern");  
        //System.out.println("Method Signature: "  + jp.getSignature());  
    }  
}  