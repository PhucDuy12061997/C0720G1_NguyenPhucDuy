create database baitap;
use baitap;
create table products(
ID int primary key,
Name nvarchar(50) ,
ImageUrl nvarchar(1000),
Price int,
Discount int,
Stock Int,
Categoryid int,
Supplierid int,
Description nvarchar(255)
);
create table Orders(
ID int primary key,
CreatedDate datetime,
ShippedDate datetime,
Status varchar(50),
Description nvarchar(255),
ShippingAddress nvarchar(500),
ShippingCity nvarchar(50),
PaymentType varchar(20),
CustomerId varchar(50),
EmployeeId varchar(50)
);

 insert into Orders values(1,'1000-01-01 00:00:00','1000-01-01 00:00:00','dang chuyen',' nct','76ndc','da nang','20k','001','012');
select * from Orders;
update Orders set Status = 'duy duy' where id=1;