package com.internousdev.ecsite.action;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

public class UserManagementAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;

	public String execute(){
		String result = ERROR;
		if((int)session.get("login_Manager_permission_level") >= 2){
			result = SUCCESS;
		}
		return result;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}
