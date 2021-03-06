package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.internousdev.ecsite.dto.SalesInfoDTO;
import com.internousdev.ecsite.util.DBConnector;

public class SalesInfoDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	public ArrayList<SalesInfoDTO> getSalesInfo(
			String buy_date_start,String buy_date_end) throws SQLException{
		//buy_date_startからbuy_date_endの期間かつ、商品ID=product_idのリストを表示
		//asc_descで昇順か降順を指定可能

		ArrayList<SalesInfoDTO> salesInfoDTO = new ArrayList<SalesInfoDTO>();
		String sql ="SELECT IFNULL(ID,'ALL')as ID,IFNULL(product_name,'ALL')as product_name,IFNULL(buy_date,'total')as buy_date,product_count,buy_total_price,total_genka,rieki "
					+ "FROM "
						+ "(SELECT CAST(u.regist_date as date) as buy_date,u.product_id as ID,i.product_name as product_name,sum(u.product_count) as product_count,sum(u.buy_total_price) as buy_total_price,sum(u.genka_total_price) as total_genka,sum(u.rieki) as rieki "
							+ "FROM user_buy_item_transaction as u LEFT JOIN item_info_transaction as i "
								+ "ON u.product_id = i.product_id "
								+ "WHERE u.regist_date >= ? AND u.regist_date <= ? "
								+ "GROUP BY ID,product_name ,buy_date with rollup)as bit "
									+ "WHERE product_name is not null OR ID is null;"
					;

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, buy_date_start);
			preparedStatement.setString(2, buy_date_end);

			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				SalesInfoDTO dto = new SalesInfoDTO();
				dto.setRegist_date(resultSet.getString("buy_date"));
				dto.setProduct_id(resultSet.getString("ID"));
				dto.setProduct_name(resultSet.getString("product_name"));
				dto.setProduct_count(resultSet.getString("product_count"));
				dto.setBuy_total_price(resultSet.getString("buy_total_price"));
				dto.setGenka_total_price(resultSet.getString("total_genka"));
				dto.setRieki(resultSet.getString("rieki"));
				salesInfoDTO.add(dto);
			}
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		connection.close();
	}
		return salesInfoDTO;
	}
}
