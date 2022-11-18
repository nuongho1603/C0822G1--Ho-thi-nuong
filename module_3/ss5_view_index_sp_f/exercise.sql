create database demo;
use demo;
create table products(
  id int primary key, 
  product_code int, 
  product_name varchar(45), 
  product_price double, 
  product_amount int, 
  product_description varchar(100), 
  product_status varchar(45)
);
insert into products 
values 
  (
    1, 224, "sach", 5.6, 2, "sach tieng anh", 
    "asdsdf"
  ), 
  (
    2, 624, "but", 5.6, 1, "but chi", "asdsdf"
  ), 
  (
    3, 824, "thuoc", 5, 3, "thuoc ke", "asdsdf"
  );
-- Chỉ mục UNIQUE
create unique index i_product on products(product_code);
-- Chỉ mục COMPOSITE
create index i_product2 on products(product_name, product_price);
-- Sử dụng câu lệnh EXPLAIN 
explain 
select 
  * 
from 
  products;
-- Tạo view lấy về các thông tin: 
-- productCode, productName, productPrice, productStatus từ bảng products.
create view w_products as 
select 
  product_code, 
  product_name, 
  product_price, 
  product_status 
from 
  products;
select 
  * 
from 
  w_products;
-- sửa đổi view
update 
  w_products 
set 
  product_code = "163" 
where 
  product_name = "sach";
-- xoá view.
drop 
  view w_products;
-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
delimiter // create procedure sp_products() begin 
select 
  * 
from 
  products;
end // delimiter;
call sp_products;
-- Tạo store procedure thêm một sản phẩm mới
delimiter // create procedure sp_addproducts(
  IN id int, 
  IN product_code int, 
  IN product_name varchar(45), 
  IN product_price double, 
  IN product_amount int, 
  IN product_description varchar(100), 
  IN product_status varchar(45)
) begin insert into products value(
  id, product_code, product_name, product_price, 
  product_amount, product_description, 
  product_status
);
end // delimiter;
call sp_addproducts(6, 444, "as", 5, 3, "asd", "asass");
-- Tạo store procedure sửa thông tin sản phẩm theo id
delimiter // create procedure sp_set_products(
  IN set_id int, 
  IN product_name_update varchar(45)
) begin 
update 
  products 
set 
  product_name = product_name_update 
where 
  id = set_id;
end // delimiter;
call sp_set_products(1, "nuongcute");
-- Tạo store procedure xoá sản phẩm theo id
delimiter // create procedure sp_delete_id(IN delete_id int) begin 
delete from 
  products 
where 
  id = delete_id;
end // delimiter;
call sp_delete_id(2);
select 
  * 
from 
  products;