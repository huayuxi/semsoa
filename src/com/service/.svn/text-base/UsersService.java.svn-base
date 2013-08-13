/**
 * 
 */
package com.service;

import com.model.Users;

/**
 * @author lintz
 */
public interface UsersService {
	/**
	 * 添加用户
	 * @param users 用户
	 * @return true or false
	 */
	public Boolean addUsers(Users users);

	/**
	 * 删除用户
	 * @param users 用户
	 * @return true or false
	 */
	public Boolean delUsers(Users users);

	/**
	 * 更新用户
	 * @param users 用户
	 * @return true or false
	 */
	public Boolean updateUsers(Users users);
	/**
	 * 校验用户
	 * @param loginName 用户名
	 * @param password 密码明文
	 * @return "no" 不存在  "error" 帐号密码不符   "suc" 校验成功
	 */
	public String checkUsers(String loginName,String password);
}
