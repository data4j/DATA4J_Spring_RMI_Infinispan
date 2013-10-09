package org.data4j.rmi.server.starter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * RMI Server Starter
 * 
 * @author data4j.org
 * @since 6 Oct 2013
 * @version 1.0.0
 *
 */
public class RMIServerStarter {

	public static void main(String[] args) {
		
		//RMI Server' s Application Context is started... 
		new ClassPathXmlApplicationContext("rmiServerAppContext.xml");
	}
}
