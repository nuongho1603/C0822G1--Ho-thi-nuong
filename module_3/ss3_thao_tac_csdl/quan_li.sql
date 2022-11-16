create database quan_li;
drop database quan_li;
use quan_li;
create table class(
id int primary key,
name varchar(10)
);

create table student(
id int primary key,
`name` varchar(45),
gender int,
birthday date,
email varchar(45),
`point` double,
username varchar(45),
class_id int,
foreign key(class_id) references class(id)
);

