create database sale_manager;
use sale_manager;
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
  foreign key(c_id) references customer(c_id), 
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

insert into customer(c_name, c_age) 
values 
  ("Minh Quan", 10), 
  ("Ngoc Oanh", 20), 
  ("Hong Ha", 50);
  
insert into `order` (c_id, o_date) 
values 
  (1, '2006-11-03'), 
  (2, '2006-03-11'), 
  (1, '2006-03-11');
select 
  * 
from 
  `order`;
  
insert into product (p_name, p_price) 
values 
  ("May giat", 3), 
  ("May giat", 3), 
  ("Tu lanh", 5), 
  ("Dieu hoa", 7), 
  ("Quat", 1), 
  ("Bep dien", 2);
  
insert into order_detail(o_id, p_id, od_qty) 
values 
  (1, 1, 3), 
  (1, 3, 7), 
  (1, 4, 2), 
  (2, 1, 1), 
  (3, 1, 8), 
  (2, 5, 4), 
  (2, 3, 3);
  
-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select 
  o_id, 
  o_date, 
  o_total_price 
from 
  `order`;
  
-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select 
  c_name, 
  p_name 
from 
  order_detail as od 
  inner join `order` as o on o.o_id = od.o_id 
  inner join customer as c on c.c_id = o.c_id 
  inner join product as p on p.p_id = od.p_id;
  
-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select 
  c.c_name, 
  c.c_age, 
  c.c_id 
from 
  customer c 
where 
  c.c_id not in(
    select 
      o.c_id 
    from 
      `order` o
  );
-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn 
-- (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn.
-- Giá bán của từng loại được tính = odQTY*pPrice)
--
select 
  o.o_id, 
  o.o_date, 
  p.p_price, 
  od.od_qty, 
  (p.p_price * od.od_qty) as tong_tien 
from 
  customer c 
  join `order` o on c.c_id = o.c_id 
  join order_detail od on od.o_id = o.o_id 
  join product p on p.p_id = od.p_id;