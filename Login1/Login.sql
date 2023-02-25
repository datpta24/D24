create database login_servlet

use login_servlet

create table Users(
	username  varchar(20),
	password  varchar(20)
)


insert into Users (username,password) values ('wer','123');
insert into Users (username,password) values ('rhtrt','567');
insert into Users (username,password) values ('etwg','463');
insert into Users (username,password) values ('gerg','176');
insert into Users (username,password) values ('yr5y5','563')

select * from Users

select * from Users WHERE username = 'wer' AND password = '123'