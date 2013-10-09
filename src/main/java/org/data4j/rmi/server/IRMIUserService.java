package org.data4j.rmi.server;

import java.util.List;

import org.data4j.user.User;

/**
 * RMI User Service Interface
 * 
 * @author data4j.org
 * @since 6 Oct 2013
 * @version 1.0.0
 *
 */
public interface IRMIUserService{

	/**
	 * Add User
	 * 
	 * @param  User user
	 */
	public void addUser(User user);
	
	/**
	 * Delete User
	 * 
	 * @param  long id
	 */
	public void deleteUser(long id);
	
	
	/**
	 * Get User List
	 * 
	 * @return List user list
	 */
	public List<User> getUserList();
	
}
