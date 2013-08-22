/**
 * 
 */
package com.dao.impl;

import org.hibernate.Query;

import com.dao.UsersDao;
import com.model.Users;
import com.util.BasicHibernateDao;

/**
 * @author lintz
 */
public class UsersDaoImpl extends BasicHibernateDao implements UsersDao {
	/**
	 * 添加用户
	 * @param users 用户
	 * @return true or false
	 */
	public Boolean addUsers(Users users) {
		try {
			getSession().save(users);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * 删除用户
	 * @param users 用户
	 * @return true or false
	 */
	public Boolean delUsers(Users users) {
		try {
			getSession().delete(users);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * 更新用户
	 * @param users 用户
	 * @return true or false
	 */
	public Boolean updateUsers(Users users) {
		try {
			getSession().update(users);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * 查询用户
	 * @param loginName 登陆名
	 * @return users对象
	 */
	public Users queryUser(String loginName) {
		try {
			Query query = getSession().createQuery("from Users where loginName =?");
			query.setString(0,loginName);
			Users users = (Users) query.list().get(0);
			return users;
		} catch (Exception e) {
			return null;
		}
	}
}
