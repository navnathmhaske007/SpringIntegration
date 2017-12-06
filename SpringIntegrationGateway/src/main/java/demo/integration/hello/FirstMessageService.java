package demo.integration.hello;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

//@MessageEndpoint(value="firstMessageService")
public class FirstMessageService {
	
	//@ServiceActivator(inputChannel="directChannel", autoStartup="true")
	public String sendMessage( String message) {
		
		return "Hello"+message;
	}
} 