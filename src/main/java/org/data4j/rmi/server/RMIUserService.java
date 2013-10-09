package org.data4j.rmi.server;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.data4j.cache.srv.IUserCacheService;
import org.data4j.user.User;

/**
 * RMI User Service Implementation
 * 
 * @author data4j.org
 * @since 6 Oct 2013
 * @version 1.0.0
 *
 */
public class RMIUserService implements IRMIUserService {

	private static final Logger logger = Logger.getLogger(RMIUserService.class);
	
	private IUserCacheService userCacheService;
	
	public void addUser(User user) {
		userCacheService.addToUserCache(user);
		logger.debug("User has been added to cache. User : "+userCacheService.getUserCache().get(user.getId()));
	}

	public void deleteUser(long id) {
		userCacheService.deleteFromUserCache(id);
		logger.debug("User has been deleted from cache. User : " + id);
	}

	public List<User> getUserList() {
		List<User> userList = new ArrayList<User>(userCacheService.getUserCache().values());
		logger.debug("User List : " + userList);
		return userList;
	}

	public void setUserCacheService(IUserCacheService userCacheService) {
		this.userCacheService = userCacheService;
	}
	
}
