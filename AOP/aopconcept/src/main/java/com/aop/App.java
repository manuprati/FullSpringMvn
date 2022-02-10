package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.services.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/aop/config.xml");
    	PaymentService paymentObj = ctx.getBean("payment",PaymentService.class);
    	
    	paymentObj.makePayment(123);
    }
}
