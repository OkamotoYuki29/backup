package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.Map;
import java.sql.SQLException;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.ecsite.dao.PermissionDAO;
import com.internousdev.ecsite.dto.PermissionDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PermissionLevelEditAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private ArrayList<PermissionDTO> permissionList = new ArrayList<>();
	private PermissionDAO permissionDAO = new PermissionDAO();

	public String execute() throws SQLException{
		String result = ERROR;
		if((int)session.get("login_Manager_permission_level") >= 5){
			result = SUCCESS;
			permissionList = permissionDAO.getPermissionTable();
		}
		return result;
	}

	public ArrayList<PermissionDTO> getPermissionList(){
		return permissionList;
	}
	public void setPermissionList(ArrayList<PermissionDTO> permissionDTO){
		this.permissionList = permissionDTO;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}

