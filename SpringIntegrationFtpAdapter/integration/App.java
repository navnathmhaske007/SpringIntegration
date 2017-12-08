package demo.integration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.integration.IntegrationMessageHeaderAccessor;
import org.springframework.integration.channel.RendezvousChannel;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new GenericXmlApplicationContext("beanConfig.xml");
    	MessageChannel channel = context.getBean("rendezvousChannel",MessageChannel.class);
    /*
     * 
     * this one is for priority channel
     * 
     * */
    	
    	//	Message<String> message = MessageBuilder.withPayload("Welcome to Spring Integration!").build();
    	//Message<String> message1 = MessageBuilder.withPayload("Welcome to Spring ");
    /*	for (int i=0;i<50;i++)
    	{
    		Message<String> message = MessageBuilder.withPayload("Welcome to Spring Integration!"+i).setHeaderIfAbsent(IntegrationMessageHeaderAccessor.PRIORITY, i).build();
    		channel.send(message);
    	}*/
    	
    	//channel.send(message1);
    	
    	/*
    	 * this one is rendezovos channel
    	 * 
    	 * */
    	
    	Message<String> message = MessageBuilder.withPayload("Welcome to Spring Integration!").setHeader(MessageHeaders.REPLY_CHANNEL,"replyChannel").build();
    	channel.send(message,10000);
		
		
    }
    
}
