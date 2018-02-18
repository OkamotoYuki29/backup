package com.internousdev.ecsite.dto;

public class ManagerLoginDTO {
	private String loginManagerId;
	private String loginManagerPassword;
	private String Managername;
	private int permissionLevel;
	private boolean loginFlg = false;


	public String getManagername() {
		return Managername;
	}
	public void setManagername(String Manager_name) {
		this.Managername = Manager_name;
	}
	public boolean getLoginFlg() {
		return loginFlg;
	}
	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
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
	public int getPermissionLevel() {
		return permissionLevel;
	}
	public void setPermissionLevel(int permissionLevel) {
		this.permissionLevel = permissionLevel;
	}


}
