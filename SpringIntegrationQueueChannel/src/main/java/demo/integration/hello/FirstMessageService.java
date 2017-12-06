package demo.integration.hello;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

//@MessageEndpoint(value="firstMessageService")
public class FirstMessageService {
	
	//@ServiceActivator(inputChannel="directChannel", autoStartup="true")
	public void recieveMessage(Message<String> message) {
		System.out.println(message.getHeaders() + "    "+ message.getPayload());
	}
} 