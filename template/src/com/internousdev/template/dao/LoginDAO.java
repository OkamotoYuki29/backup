package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.internousdev.template.dto.LoginDTO;
import com.internousdev.template.util.DBConnector;

public class LoginDAO {
	private DBConnector dbconnector = new DBConnector();
	private Connection connection = dbconnector.getConnection();
	private LoginDTO loginDTO = new LoginDTO();

	public LoginDTO getLoginserInfo(String loginUserId,String loginPassword){
		String sql = "SELECT * FROM"
	}
}
