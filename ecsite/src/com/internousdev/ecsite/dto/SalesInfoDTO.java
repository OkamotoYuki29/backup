package com.internousdev.ecsite.dto;

public class SalesInfoDTO {
	private String user_id;
	private String product_id;
	private String product_name;
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	private String product_count;
	private String buy_total_price;
	private String genka_total_price;
	private String rieki;
	private String regist_date;
	public String getRegist_date() {
		return regist_date;
	}
	public void setRegist_date(String regist_date) {
		this.regist_date = regist_date;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_count() {
		return product_count;
	}
	public void setProduct_count(String product_count) {
		this.product_count = product_count;
	}
	public String getBuy_total_price() {
		return buy_total_price;
	}
	public void setBuy_total_price(String buy_total_price) {
		this.buy_total_price = buy_total_price;
	}
	public String getGenka_total_price() {
		return genka_total_price;
	}
	public void setGenka_total_price(String genka_total_price) {
		this.genka_total_price = genka_total_price;
	}
	public String getRieki() {
		return rieki;
	}
	public void setRieki(String rieki) {
		this.rieki = rieki;
	}
}
