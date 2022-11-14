create database exercise1;
use exercise1;
create table class(
  id int primary key, 
  `name` varchar(255)
);
insert into class value (3, "Diễm");
update 
  class 
set 
  name = 'lan' 
where 
  id = 1;
select 
  * 
from 
  Class;
create table teacher(
  id int primary key, 
  `name` varchar(255), 
  age int, 
  country varchar(255)
);
select 
  * 
from 
  teacher;
drop 
  table class;
