package demo.integration.hello;

import java.awt.font.TransformAttribute;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

import demo.integration.transform.Transform;

//@MessageEndpoint(value="firstMessageService")
public class FirstMessageService {
	
	//@ServiceActivator(inputChannel="directChannel", autoStartup="true")
	public void recieveMessage(Message<?> message) {
		
		//System.out.println(message.get);
		System.out.println( "hello "+message.getPayload());
		
		Transform.path = message.getPayload().toString();
		
		Transform.transform(Transform.path);
		
	}
} 