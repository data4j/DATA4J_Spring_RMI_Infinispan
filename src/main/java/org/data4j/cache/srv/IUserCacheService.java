package org.data4j.cache.srv;

import org.data4j.user.User;
import org.infinispan.Cache;

/**
 * IUserCacheService Interface exposes cache functionality.
 * 
 * @author data4j.org
 * @since 6 Oct 2013
 * @version 1.0.0
 *
 */
public interface IUserCacheService {

	/**
     * Adds User entry to cache
     *
     * @param User user 
     *
     */
	void addToUserCache(User user);
	
	/**
     * Removes User entry from cache
     *
     * @param long id - key
     *
     */
	void deleteFromUserCache(long id);
	
	/**
     * Gets User cache
     *
     * @return Cache<Long, User> cache
     */
	Cache<Long, User> getUserCache();
		
}
