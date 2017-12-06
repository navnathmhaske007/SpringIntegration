package demo.integration.getway;

import java.util.concurrent.Future;

public interface MyHello {
	
	    public Future<String> sendMessage(String message);

}
