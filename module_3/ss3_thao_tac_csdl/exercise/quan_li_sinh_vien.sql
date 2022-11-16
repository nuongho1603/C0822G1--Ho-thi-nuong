create database quan_li_sinh_vien;

use quan_li_sinh_vien;
create table class(
class_id int primary key,
class_name varchar(45) not null,
start_date date not null,
`status` bit
);

create table student(
student_id int not null auto_increment primary key,
student_name varchar(45)not null,
address varchar(45),
phone int,
`status` bit,
class_id int not null,
foreign key(class_id) references class(class_id)
);

create table subject
(
    sub_id   int primary key,
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
unique (sub_id,student_id),
foreign key(sub_id) references subject(sub_id),
foreign key(student_id) references student(student_id)
);
drop table mark;

insert into class
values(1, 'A1', '2008-12-20', 1),
(2, 'A2', '2008-12-22', 1),
(3, 'B3', current_date, 0);

insert into student(student_name,address,phone,`status`,class_id)
values('Hung', 'Ha Noi', '0912113113', 1, 1),
('Hoa', 'Hai phong',null, 1, 1),
('Manh', 'HCM', '0123123123',0, 2);
select*from student;

insert into subject
values (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       
insert into mark (sub_id,student_id,mark,exam_times)
values(1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);
       select * from mark;
-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select*
from student
where student_name like "H%"; 
-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
select*
from class
where start_date like "%12%";
-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
select*
from subject
where credit <= 5 and credit >= 3;
-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
set sql_safe_updates = 0;
update student set class_id = 2 where student_name ="Hung";
select*from student;
-- set lai che do an toan..
set sql_safe_updates =1;
-- Hiển thị các thông tin: StudentName, SubName, Mark.
-- Dữ liệu sắp xếp theo điểm thi (mark) giảm dần.
 -- nếu trùng sắp theo tên tăng dần.
 select (student_name,sub_name,mark)
 from student s join mark m join subject sub on s.student_name = m.mark = sub.sub_name
 order by mark desc , s.student_name asc;