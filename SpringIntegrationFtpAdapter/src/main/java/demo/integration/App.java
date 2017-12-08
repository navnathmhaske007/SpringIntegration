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
    	/*MessageChannel channel = context.getBean("ftpChannel",MessageChannel.class);
    	Message<String> message = MessageBuilder.withPayload("Welcome to Spring Integration!").setHeader(MessageHeaders.REPLY_CHANNEL,"replyChannel").build();
    	channel.send(message,10000);*/
		
		
    }
    
}
