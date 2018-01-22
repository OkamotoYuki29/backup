package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.internousdev.ecsite.dto.MyPageDTO;
import com.internousdev.ecsite.util.DBConnector;

public class MyPageDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	public ArrayList<MyPageDTO> getMyPageUserInfo(
			String item_transaction_id,String user_master_id)throws SQLException{

		ArrayList<MyPageDTO> myPageDTO = new ArrayList<MyPageDTO>();
		String sql = "SELECT "
						+ "ubit.id,"
						+ "iit.item_name,"
						+ "ubit.total_price,"
						+ "ubit.total_count,"
						+ "ubit.pay,"
						+ "ubit.insert_date"
					+ " FROM "
						+ "user_buy_item_transaction ubit"
					+ " LEFT JOIN "
						+ "item_info_transaction iit"
					+ " ON "
						+ "ubit.item_transaction_id = iit.id"
					+ " WHERE "
						+ "ubit.item_transaction_id = ?"
						+ " AND "
						+ "ubit.user_master_id = ?"
					+ " ORDER BY "
						+ "insert_date DESC";
		/* 表示する表の列は「履歴情報のid(not null primary key auto_increment)」
		 *                  「商品情報の商品名」
		 *                  「履歴情報の合計金額」
		 *                  「履歴情報の合計購入個数」
		 *                  「履歴情報の支払い方法」
		 *                  「履歴情報の購入時刻」
		 * 表の結合方法は   「履歴情報に商品情報を外部結合」
		 * 結合する列は     「履歴情報の商品id、商品情報のid(not null primary key auto_increment)」
		 * 表示する行は     「履歴情報の商品idとユーザーidがセッションと等しい行」
		 * 並び順は         「購入時刻(古い順)」
		 */

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, item_transaction_id);
			preparedStatement.setString(2, user_master_id);

			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				MyPageDTO dto = new MyPageDTO();
				dto.setId(resultSet.getString("id"));
				dto.setItemName(resultSet.getString("item_name"));
				dto.setTotalPrice(resultSet.getString("total_price"));
				dto.setTotalCount(resultSet.getString("total_count"));
				dto.setPayment(resultSet.getString("pay"));
				dto.setInsert_date(resultSet.getString("insert_date"));
				myPageDTO.add(dto);
			}
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			connection.close();
		}

		return myPageDTO;  //dtoが追加された配列
	}

	public int buyItemHistoryDelete(
			String item_transaction_id,String user_master_id)throws SQLException{

		String sql ="DELETE FROM user_buy_item_transaction WHERE item_transaction_id = ? AND user_master_id =?";

		PreparedStatement preparedStatement;
		int result = 0;
		try{
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, item_transaction_id);;
			preparedStatement.setString(2, user_master_id);
			result = preparedStatement.executeUpdate();
		} catch(SQLException e){
			e.printStackTrace();
		} finally{
			connection.close();
		}
		return result;
	}
}
