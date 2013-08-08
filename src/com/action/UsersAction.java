package com.action;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.runtime.ProcessInstance;

import com.model.Users;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UsersService;

/**
 * @author lintz
 */
@SuppressWarnings("serial")
public class UsersAction extends ActionSupport {
	private Users users;
	private UsersService usersService;
	private ProcessEngine processEngine;
	/**
	 * 用户登陆
	 * @return
	 */
	public String login() {
		String deploymentId = processEngine.getRepositoryService().createDeployment().addClasspathResource("deployments/work-1.0.bpmn20.xml").deploy().getId();
		ProcessInstance processInstance = processEngine.getRuntimeService().startProcessInstanceById(deploymentId);
		String procId = processInstance.getId();
		System.out.println(procId);
		users = new Users();
		users.setUserId(deploymentId);
		this.usersService.addUsers(users);
		return SUCCESS;
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

}
