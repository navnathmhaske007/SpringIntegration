package demo.integration;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import demo.integration.getway.MyHello;
import demo.integration.hello.FirstMessageService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new GenericXmlApplicationContext("beanConfig.xml");
    	
    	MyHello firstMessageService = context.getBean("helloService",MyHello.class);
    
    	//System.out.println(firstMessageService.sendMessage("navnath"));
    	

    	
    	System.out.println("the end");
    	
    	Future<String> f = firstMessageService.sendMessage("navnath");
    	
    	try {
			String myString =f.get();
			System.out.println(myString);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
			
				 
    }
    
	
		
		
		

}
