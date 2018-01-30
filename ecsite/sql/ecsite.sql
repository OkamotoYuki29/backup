set names utf8;
set foreign_key_checks = 0;
drop database if exists ecsite;

create database if not exists ecsite;
use ecsite;

drop table if exists login_user_transaction;

create table login_user_transaction(
	id int not null primary key auto_increment,
	login_id varchar(16) unique,
	login_pass varchar(16),
	user_name varchar(50),
	insert_date datetime,
	updated_date datetime
);

drop table if exists item_info_transaction;

create table item_info_transaction(
	id int null primary key auto_increment,
	item_name varchar(30),
	item_price int,
	item_stock int,
	insert_date datetime,
	update_date datetime
);

drop table if exists user_buy_item_transaction;

create table user_buy_item_transaction(
	id int not null primary key auto_increment,
	item_transaction_id int,
	total_price int,
	total_count int,
	user_master_id varchar(16),
	pay varchar(30),
	insert_date datetime,
	delete_date datetime
);

drop table if exists login_manager_transaction;

create table login_manager_transaction(
	id int not null primary key auto_increment,
	login_id varchar(16) unique,
	login_pass varchar(16),
	manager_name varchar(50),
	permission_level int not null check(level>0 and level<=5),
	insert_date datetime,
	updated_date datetime
);

drop table if exists permission_level;

create table permission_level(
	access_target varchar(50),
	level int not null check(level>0 and level<=5)
);

INSERT INTO
	item_info_transaction(item_name,item_price,item_stock)
	VALUES("ノートBook",100,50);

INSERT INTO
	login_user_transaction(login_id,login_pass,user_name)
	VALUES("internous","internous01","test");

INSERT INTO
	login_manager_transaction(login_id,login_pass,manager_name,permission_level)
	VALUES("internousdev","internousdev","インターノウス株式会社",5);

INSERT INTO
	permission_level
	VALUES("商品管理",1),("ユーザー管理",2),("管理者管理",5),("データ管理",3);
