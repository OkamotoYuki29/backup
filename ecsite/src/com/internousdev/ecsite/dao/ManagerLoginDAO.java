package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.internousdev.ecsite.dto.ManagerLoginDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ManagerLoginDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private ManagerLoginDTO managerLoginDTO = new ManagerLoginDTO();

	public ManagerLoginDTO getLoginManagerInfo(String loginManagerId, String loginManagerPassword){
		String sql = "SELECT * "
					+ "FROM login_manager_transaction "
					+ "WHERE login_id = ? "
					+ " AND login_pass = ?";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginManagerId);
			preparedStatement.setString(2, loginManagerPassword);

			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){
				managerLoginDTO.setLoginManagerId(resultSet.getString("login_id"));
				managerLoginDTO.setLoginManagerPassword(resultSet.getString("login_pass"));
				managerLoginDTO.setManagername(resultSet.getString("Manager_name"));
				managerLoginDTO.setPermissionLevel(resultSet.getInt("permission_level"));

				if(!(resultSet.getString("login_id").equals(null))){
					managerLoginDTO.setLoginFlg(true);
				}
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		return managerLoginDTO;
	}

	public ManagerLoginDTO getManagerLoginDTO(){
		return managerLoginDTO;
	}
}
