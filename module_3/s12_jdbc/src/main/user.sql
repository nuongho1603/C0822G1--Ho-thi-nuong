create database exercise;
use exercise;
create table user(
id int primary key,
name varchar(45),
email varchar(45),
country varchar(45)
);
insert into user
values(1,"Nga","Ngaho@gmail.com","Hà Tĩnh"),
(2,"Nương","nuongho.160304@gmail.com","Quảng Nam"),
(3,"Thúy Kiều","ThuyKieu@gmail.com","Hà Tĩnh");

select * from user;

