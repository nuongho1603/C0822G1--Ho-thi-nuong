create database managers;
use managers;
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

create table instructor(
id int not null auto_increment primary key,
name varchar(25),
birthday date,
salary int
);

create table instructor_class(
instructor_id int,
class_id int,
primary key (instructor_id,class_id),
foreign key(instructor_id) references instructor(id),
foreign key(class_id) references class(id),
start_time datetime
);
