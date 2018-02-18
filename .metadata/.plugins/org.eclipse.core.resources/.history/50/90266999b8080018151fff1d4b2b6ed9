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
<title>管理者Home画面</title>

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
			<p>管理者Home画面</p>
		</div>
		<div>
			<s:if test="#session.login_manager_level >= 1" >
			<div>
				<p id="text-link"><a href='<s:url action="ItemManagement"/>'>仕入機能</a></p>
				<p id="content">商品の仕入
			</div>
			</s:if>
			<s:if test="#session.login_manager_level >= 2" >
			<div>
				<p id="text-link"><a href='<s:url action="UserManagement"/>'>商品追加・変更機能</a></p>
				<p id="content">新商品の追加や既存商品の編集</p>
			</div>
			</s:if>
			<s:if test="#session.login_manager_level >= 2" >
			<div>
				<p id="text-link"><a href='<s:url action="ManagerManagement"/>'>データ出力</a></p>
				<p id="content">各種データの出力</p>
			</div>
			</s:if>
		</div>
	</div>

</body>
</html>