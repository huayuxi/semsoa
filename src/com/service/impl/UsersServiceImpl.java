/**
 * 
 */
package com.service.impl;

import com.dao.UsersDao;
import com.model.Users;
import com.service.UsersService;

/**
 * @author lintz
 */
public class UsersServiceImpl implements UsersService {
	private UsersDao usersDao;

	@Override
	public Boolean addUsers(Users users) {
		return this.usersDao.addUsers(users);
	}

	@Override
	public Boolean delUsers(Users users) {
		return this.usersDao.delUsers(users);
	}

	@Override
	public Boolean updateUsers(Users users) {
		return this.usersDao.updateUsers(users);
	}

	public UsersDao getUsersDao() {
		return usersDao;
	}

	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}

}
