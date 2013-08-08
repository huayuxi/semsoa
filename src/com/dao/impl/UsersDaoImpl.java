/**
 * 
 */
package com.dao.impl;

import com.dao.UsersDao;
import com.model.Users;
import com.util.BasicHibernateDao;

/**
 * @author lintz
 */
public class UsersDaoImpl extends BasicHibernateDao implements UsersDao {

	public Boolean addUsers(Users users) {
		try {
			getSession().save(users);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public Boolean delUsers(Users users) {
		try {
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public Boolean updateUsers(Users users) {
		try {
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
