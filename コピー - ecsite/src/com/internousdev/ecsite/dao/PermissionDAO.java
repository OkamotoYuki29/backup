package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.internousdev.ecsite.dto.PermissionDTO;
import com.internousdev.ecsite.util.DBConnector;

public class PermissionDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private PermissionDTO levelDto = new PermissionDTO();

	public ArrayList<PermissionDTO> getPermissionLevel() throws SQLException{

		ArrayList<PermissionDTO> permissionDTO = new ArrayList<>();
		String sql = "SELECT "
						+ "access_target, "
						+ "level "
					+ "FROM "
						+ "permission_level";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				PermissionDTO dto = new PermissionDTO();
				dto.setAccessTarget(resultSet.getString("access_target"));
				dto.setLevel(resultSet.getInt("level"));
				levelDto.setMap(dto.getAccessTarget(),dto.getLevel());
				permissionDTO.add(dto);
			}
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			connection.close();
		}
		return permissionDTO;
	}
	public ArrayList<PermissionDTO> getPermissionTable() throws SQLException{

		ArrayList<PermissionDTO> permissionDTO = new ArrayList<>();
		String sql = "SELECT "
						+ "access_target, "
						+ "level "
					+ "FROM "
						+ "permission_level";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();


			while(resultSet.next()){
				PermissionDTO dto = new PermissionDTO();
				dto.setAccessTarget(resultSet.getString("access_target"));
				dto.setLevel(resultSet.getInt("level"));
				permissionDTO.add(dto);
			}
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			connection.close();
		}
		return permissionDTO;
	}
}
