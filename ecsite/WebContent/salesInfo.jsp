<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content="">
<meta name="keywords" content=""/>
<title>売上損益管理</title>

<style type="text/css">
	/* ========TAG LAYOUT======== */
	body{
		margin:0;
		padding:0;
		line-height:1.6;
		letter-spacing:1px;
		font-family:Verdana,Helvetica,sans-serif;
		font-size:12px;
		color:#333;
		background:#fff;
	}
	table{
		text-align:center;
		margin:0 auto;
	}
	/* ========ID LAYOUT========*/
	#top{
		width:780px;
		margin:30px auto;
		border:1px solid #333;
	}
	#header{
		width:100%;
		height:80px;
		background-color:black;
	}
	#main{
		width:100%;
		height:500px;
		text-align:center;
	}
	#footer{
		width:100%;
		height:80px;
		background-color: black;
		clear:both;
	}
	#text-link{
		display:inline-block;
		text-align:right;
	}
	#content{
		font-size:6px;
		line-height:0px;
	}
</style>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>売上損益管理</p>
		</div>
		<div>
			<s:if test="SalesInfoList == null">
				<h3>売上情報はありません。</h3>
			</s:if>
				<h3>売上情報は以下になります。</h3>
			 	<s:form action="SalesInfoAction">
				</s:form>
				<table border="1">
					<tr>
						<th>ID</th>
						<th>商品名</th>
						<th>購入日</th>
						<th>個数</th>
						<th>売上高</th>
						<th>原価</th>
						<th>利益</th>
					</tr>
					<s:iterator value="salesInfoList">
						<tr>
							<td><s:property value="produce_id"/></td>
							<td><s:property value="product_name"/></td>
							<td><s:property value="regist_date"/></td>
							<td><s:property value="product_count"/></td>
							<td><s:property value="buy_total_price"/></td>
							<td><s:property value="genka_total_price"/></td>
							<td><s:property value="rieki"/></td>
						</tr>
					</s:iterator>
				</table>
		</div>
	</div>
</body>
</html>