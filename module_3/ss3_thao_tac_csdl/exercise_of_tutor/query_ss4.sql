use managers;

select * from student;
select * from class;
select * from instructor;
select * from instructor_class;

-- 1.Hiện thị danh sách các lớp có học viên theo học và số lượng học viên của mỗi lớp
select c.name as lop_co_hoc_vien,count(c.name) as so_luong_hv
from student as s 
inner join class as c on s.class_id = c.id
group by c.name;

-- 2.Tính điểm lớn nhất của mỗi các lớp
select c.name as class, max(s.point) as point_max
from student as s 
inner join class as c on s.class_id = c.id
group by c.name;

-- 3.Tinh điểm trung bình  của từng lớp
select c.name as class, avg(s.point) as point_avg
from student as s 
inner join class as c on s.class_id = c.id
group by c.name;

-- 4.Lấy ra toàn bộ tên và ngày sinh các instructor và student ở CodeGym.
select s.name as student_name ,
s.birthday as birthday_student,
 ins.name as name_instructor,
ins.birthday as birth_of_instructor
from instructor as ins,student as s;

-- 5.Lấy ra top 3 học viên có điểm cao nhất của trung tâm.
select s.name as class , s.point as top_3_point_max
from student as s 
order by s.point desc,s.name
  limit 3;

-- 6.Lấy ra các học viên có điểm số là cao nhất của trung tâm.
select * from student where point = (select max(s.point) from student s ) ;




