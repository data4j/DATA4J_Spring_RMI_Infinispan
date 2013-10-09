package org.data4j.rmi.client;

import org.apache.log4j.Logger;
import org.data4j.rmi.server.IRMIUserService;
import org.data4j.user.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * RMI Service Client
 * 
 * @author data4j.org
 * @since 6 Oct 2013
 * @version 1.0.0
 *
 */
public class RMIServiceClient {
	
	private static final Logger logger = Logger.getLogger(RMIServiceClient.class);
	
	/**
	 * Starts RMI Service Client
	 * 
	 */
	public static void main(String[] args) {
		logger.debug("RMI Service Client is starting...");
		
		//RMI Client' s Application Context is started... 
		ApplicationContext context = new ClassPathXmlApplicationContext("rmiClientAppContext.xml");
		
		//Remote User Service is being called via RMI Client Application Context...
		IRMIUserService rmiClient = (IRMIUserService) context.getBean("rmiUserService");

		//10 users are being added to cache via RMI Service
		for(int i=0; i<10; i++) {
			
			//New User is created...
			User user = new User();
			user.setId(i);
			user.setName("user_name_" + i);
			user.setSurname("user_surname_" + i);
			
			//The user is added to the remote cache...
			rmiClient.addUser(user);
		}
		
		//The users are gotten via remote cache...
		logger.debug("User List : " + rmiClient.getUserList());
				
		logger.debug("RMI Service Client is stopped...");
	}
}
