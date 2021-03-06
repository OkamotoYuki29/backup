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
	product_id int	not null unique,
	product_name varchar(100) not null unique,
	product_name_kana varchar(100) not null unique,
	product_description varchar(255) not null,
	category_id int,
	buy_price int,
	zaiko double,
	genka double,
	total_genka double,
	image_file_path varchar(100),
	image_file_name varchar(50),
	release_date datetime not null,
	release_company varchar(50),
	status tinyint not null,
	rexist_date datetime not null,
	update_date datetime
);

drop table if exists user_buy_item_transaction;

create table user_buy_item_transaction(
	id int not null primary key auto_increment,
	user_id varchar(16) not null,
	product_id int not null,
	product_name varchar(100) not null,
	product_count int not null,
	buy_total_price int not null,
	genka_total_price double not null,
	rieki double not null,
	regist_date datetime not null DEFAULT CURRENT_TIMESTAMP,
	update_date datetime not null DEFAULT CURRENT_TIMESTAMP,
	delete_date datetime not null DEFAULT CURRENT_TIMESTAMP
);

drop table if exists supply_history;
create table supply_history(
	id int not null primary key auto_increment,
	supplies_date datetime not null,
	product_id int,
	product_name varchar(100) not null,
	supplies_count int not null,
	supplies_unit_price double not null,
	supplies_total_price double not null
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
	login_user_transaction(login_id,login_pass,user_name)
	VALUES("internous","internous01","test");


