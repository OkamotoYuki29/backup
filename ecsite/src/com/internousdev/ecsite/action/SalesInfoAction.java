package com.internousdev.ecsite.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import com.internousdev.ecsite.dao.SalesInfoDAO;
import com.internousdev.ecsite.dto.SalesInfoDTO;

public class SalesInfoAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private SalesInfoDAO salesInfoDAO = new SalesInfoDAO();
	private ArrayList<SalesInfoDTO> salesInfoList = new ArrayList<>();


	public String execute() throws SQLException{
		String result = ERROR;
		if((int)session.get("login_manager_level") >= 2){
			Object start = session.get("buy_date_start");
			Object end = session.get("buy_date_end");
			String buy_date_start ="2017-01-01";
			String buy_date_end="2050-12-31";
			if(start != null) {
				buy_date_start = start.toString();
			}
			if(end != null) {
				buy_date_end = end.toString();
			}
			salesInfoList = salesInfoDAO.getSalesInfo(buy_date_start,buy_date_end);
			result = SUCCESS;
		}
		return result;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
	public ArrayList<SalesInfoDTO> getSalesInfoList(){
		return this.salesInfoList;
	}
}
