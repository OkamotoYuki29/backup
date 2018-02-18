package com.internousdev.ecsite.action;

import java.util.Map;
import java.util.ArrayList;
import java.sql.SQLException;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.ecsite.dao.ManagerLoginDAO;
import com.internousdev.ecsite.dto.ManagerLoginDTO;
import com.internousdev.ecsite.dao.PermissionDAO;
import com.internousdev.ecsite.dto.PermissionDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ManagerLoginAction extends ActionSupport implements SessionAware{
	private String loginManagerId;
	private String loginManagerPassword;
	public Map<String,Object> session;
	private ManagerLoginDAO managerLoginDAO = new ManagerLoginDAO();
	private ManagerLoginDTO managerLoginDTO = new ManagerLoginDTO();
	private PermissionDAO permissionDAO = new PermissionDAO();
	private ArrayList<PermissionDTO> permissionList = new ArrayList<>();

	public String execute() throws SQLException{
		String result = ERROR; //再度管理者	ログイン画面へ
		managerLoginDTO = managerLoginDAO.getLoginManagerInfo(loginManagerId,loginManagerPassword);
		session.put("loginManager",managerLoginDTO);

		if(((ManagerLoginDTO)session.get("loginManager")).getLoginFlg()){

			result = SUCCESS; //管理者画面へ

			session.put("login_Manager_id",managerLoginDTO.getLoginManagerId());
			session.put("login_Manager_name",managerLoginDTO.getManagername());
			session.put("login_manager_level",managerLoginDTO.getPermissionLevel());

			//管理権限レベルを取得
			permissionList = permissionDAO.getPermissionLevel();
			session.put("permission_list",permissionList);

			return result;
		}
		return result;
	}

	public String getLoginManagerId() {
		return loginManagerId;
	}

	public void setLoginManagerId(String loginManagerId) {
		this.loginManagerId = loginManagerId;
	}

	public String getLoginManagerPassword() {
		return loginManagerPassword;
	}

	public void setLoginManagerPassword(String loginManagerPassword) {
		this.loginManagerPassword = loginManagerPassword;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}
