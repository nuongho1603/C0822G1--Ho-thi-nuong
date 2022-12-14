create database function_common;
use function_common;
create table class(
  class_id int primary key, 
  class_name varchar(45) not null, 
  start_date date not null, 
  `status` bit
);

create table student(
  student_id int not null auto_increment primary key, 
  student_name varchar(45) not null, 
  address varchar(45), 
  phone int, 
  `status` bit, 
  class_id int not null, 
  foreign key(class_id) references class(class_id)
);

create table subject (
  sub_id int primary key, 
  sub_name varchar(30) not null, 
  credit int, 
  `status` bit
);

create table mark(
  mark_id int not null auto_increment primary key, 
  sub_id int not null, 
  student_id int not null, 
  mark int, 
  exam_times int, 
  unique (sub_id, student_id), 
  foreign key(sub_id) references subject(sub_id), 
  foreign key(student_id) references student(student_id)
);

insert into class 
values 
  (1, 'A1', '2008-12-20', 1), 
  (2, 'A2', '2008-12-22', 1), 
  (3, 'B3', current_date, 0);
  
insert into student(
  student_name, address, phone, `status`, 
  class_id
) 
values 
  (
    'Hung', 'Ha Noi', '0912113113', 1, 
    1
  ), 
  ('Hoa', 'Hai phong', null, 1, 1), 
  ('Manh', 'HCM', '0123123123', 0, 2);
  
insert into subject 
values 
  (1, 'CF', 5, 1), 
  (2, 'C', 6, 1), 
  (3, 'HDJ', 5, 1), 
  (4, 'RDBMS', 10, 1);
  
insert into mark (
  sub_id, student_id, mark, exam_times
) 
values 
  (1, 1, 8, 1), 
  (1, 2, 10, 2), 
  (2, 1, 12, 1);
  
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select 
  * 
from 
  subject 
where 
  credit = (
    select 
      max(credit) 
    from 
      subject
  );
  
-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select 
  s.*, 
  m.mark as max_mark 
from 
  subject as s 
  inner join mark as m on s.sub_id = m.sub_id 
where 
  m.mark = (
    select 
      max(m.mark) 
    from 
      mark as m
  );
  
-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên,
-- xếp hạng theo thứ tự điểm giảm dần
select 
  stu.*, 
  avg(m.mark) 
from 
  student as stu 
  inner join mark as m on stu.student_id = m.student_id 
group by 
  student_id 
order by 
  avg(m.mark) desc;