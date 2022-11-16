create database sales_manager;
use sales_manager;
-- tạo bảng lưu danh sách khách hàng.
create table customer(
  c_id int not null auto_increment primary key, 
  c_name varchar(45), 
  c_age tinyint
);

-- tạo bảng order.
create table `order`(
  o_id int not null auto_increment primary key, 
  c_id int, 
  foreign key(cID) references customer(cID), 
  o_date datetime, 
  o_total_price int
);

-- tạo bảng product(sản p). 
create table product(
  p_id int not null auto_increment primary key, 
  p_name varchar(25), 
  p_price int
);

-- tạo bảng orderDetail(chi tiết đặt hàng).
create table order_detail(
  o_id int, 
  p_id int, 
  primary key(o_id, p_id), 
  foreign key(o_id) references `order`(o_id), 
  foreign key(p_id) references product(p_id), 
  od_qty int
);
 
insert into customer(c_name,c_age)
values( "Minh Quan",10),
( "Ngoc Oanh",20),
( "Hong Ha",50);