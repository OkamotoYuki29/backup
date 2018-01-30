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
			<s:if test="#session.login_Manager_permission_level >= 1" >
			<div>
				<p id="text-link"><a href='<s:url action="ItemManagement"/>'>商品管理</a></p>
				<p id="content">商品追加・変更・削除・出力など
			</div>
			</s:if>
			<s:if test="#session.login_Manager_permission_level >= 2" >
			<div>
				<p id="text-link"><a href='<s:url action="UserManagement"/>'>ユーザー管理</a></p>
				<p id="content">ユーザー情報の閲覧・出力、ユーザーログイン情報の閲覧・出力など</p>
			</div>
			</s:if>
			<s:if test="#session.login_Manager_permission_level >= 5" >
			<div>
				<p id="text-link"><a href='<s:url action="ManagerManagement"/>'>管理者管理</a></p>
				<p id="content">管理者の追加・変更、管理者権限レベルマスタの追加・変更・出力、管理者ログイン情報の閲覧・出力など</p>
			</div>
			</s:if>
			<s:if test="#session.login_Manager_permission_level >= 3" >
			<div>
				<p id="text-link"><a href='<s:url action="DataManagement"/>'>データ管理</a></p>
				<p id="content">各データの分析・出力(商品マスタ,販売・損益実績,ユーザー情報,管理者情報など)
			</div>
			</s:if>
		</div>
	</div>

</body>
</html>