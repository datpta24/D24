Drop table if exists Users

Create Database Account_Controller

use Account_Controller

create table Users(
	id				int primary key identity(1,1),
	username		varchar(50),
	password		varchar(50),
	name			nvarchar(50),
	address			nvarchar(50),
	phonenumber		int
)

insert into	Users(username, password,name,address,phonenumber) values 
				 ('datpt','123','Pham Dat','Ha Noi',0123456),
				 ('phild','321','Le Duc Phi','Vinh Phuc',0235425),
				 ('duynv', 'wer','Nguyen Van Duy', 'Phu Tho', 0823175)


select *
from Users

delete 
from Users
where id = 2


