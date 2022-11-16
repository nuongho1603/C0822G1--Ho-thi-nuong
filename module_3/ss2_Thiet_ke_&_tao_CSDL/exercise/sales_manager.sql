create database sales_manager;
use sales_manager;
-- tạo bảng lưu danh sách khách hàng.
create table customer(
  cID int primary key, 
  cName varchar(45), 
  cAge int
);

-- tạo bảng order.
create table `order`(
  oID int primary key, 
  cID int, 
  foreign key(cID) references customer(cID), 
  oDate date, 
  oTotalPrice varchar(45)
);

-- tạo bảng product(sản p). 
create table product(
  pID int primary key, 
  pName varchar(40), 
  pPrice varchar(45)
);

-- tạo bảng orderDetail(chi tiết đặt hàng).
create table order_detail(
  oID int, 
  pID int, 
  primary key(oID, pID), 
  foreign key(oID) references `order`(oID), 
  foreign key(pID) references product(pID), 
  odQTY varchar(45)
);
