package com.action;

import org.activiti.engine.ProcessEngine;

import com.model.Users;
import com.service.UsersService;
import com.util.BaseAction;

/**
 * @description:用户管理Acion类
 * @date: 2013-8-13 下午2:55:32
 * @author: lintz
 */
@SuppressWarnings("serial")
public class UsersAction extends BaseAction {
	private Users users;
	private UsersService usersService;
	private ProcessEngine processEngine;
	private String loginName;
	private String password;

	/**
	 * 用户登陆
	 * @return
	 */
	public String login() {
		// String deploymentId = processEngine.getRepositoryService().createDeployment().addClasspathResource("deployments/work-1.0.bpmn20.xml").deploy().getId();
		// ProcessInstance processInstance = processEngine.getRuntimeService().startProcessInstanceById(deploymentId);
		// String procId = processInstance.getId();
		// System.out.println(procId);
		String rs = usersService.checkUsers(loginName, password);
		if (rs.equals("suc")) {
			return SUCCESS;
		} else if (rs.equals("error")) {
			return AGAIN;
		}
		return NOIN;
	}

	public String addUsers() {
		return null;
	}

	public String delUsers() {
		return null;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public UsersService getUsersService() {
		return usersService;
	}

	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}

	public ProcessEngine getProcessEngine() {
		return processEngine;
	}

	public void setProcessEngine(ProcessEngine processEngine) {
		this.processEngine = processEngine;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
