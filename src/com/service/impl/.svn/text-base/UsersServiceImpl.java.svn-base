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
/*----------------------------服务接口---------------------------------*/
	/**
	 * 添加用户
	 * @param users 用户
	 * @return true or false
	 */
	public Boolean addUsers(Users users) {
		return this.usersDao.addUsers(users);
	}

	/**
	 * 删除用户
	 * @param users 用户
	 * @return true or false
	 */
	public Boolean delUsers(Users users) {
		return this.usersDao.delUsers(users);
	}

	/**
	 * 更新用户
	 * @param users 用户
	 * @return true or false
	 */
	public Boolean updateUsers(Users users) {
		return this.usersDao.updateUsers(users);
	}
	/**
	 * 校验用户
	 * @param loginName 用户名
	 * @param password 密码明文
	 * @return "no" 不存在  "error" 帐号密码不符 "suc" 校验成功
	 */
	public String checkUsers(String loginName,String password){
		Users users=this.usersDao.queryUser(loginName);
		if(users!=null){
			if(users.getLoginPassword().equals(password)){
				return "suc";
			}
			return "error";
		}
		return "no";
	}
	/*----------------------------Get and Set---------------------------------*/
	public UsersDao getUsersDao() {
		return usersDao;
	}

	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}

}
