use quan_li;
insert into class values 
(1,"c1121g1"),
(2,"c1221g1"),
(3,"a082li1"),
(4,"a092li1");

insert into student(id,`name`,gender,birthday,`point`,username,class_id) values 
(1,"nguyen ngoc cu",1,12/12/1981,8,"cunn",1),
(2,"le hai chung",1,12/12/1981,2,"chunglh",1),
(3,"hoang huu hoang",1,12/12/1990,5,"hoanhh",2),
(4,"dau dung",1,12/12/1981,8,"dungd",1),
(5,"ta dinh huynh",1,12/12/1987,1.5,"huynhtd",2),
(6,"nguyen minh hai",1,12/12/1989,2,"hainm",1),
(7,"tran van nam",1,12/12/1981,6,"namtv",2),
(8,"vo minh hieu",1,12/12/1981,2,"hieuvm",1),
(9,"le xuan ky",1,12/12/1981,5,"kynx",2),
(10,"le minh vu",1,12/12/1981,8,"culm",1),
(15,"nguyen van a",1,12/12/1981,7,null,null),
(16,"tran van b",1,12/12/1981,7,null,null);
select*from student;
drop table student;
-- 1.Lấy ra thông tin các học viên, và cho biết các học viên đang theo học lớp nào.
select*
from student
join class on student.class_id = class_id;
-- 2. Lấy ra thông tin các học viên, và cho biết các học viên đang theo học lớp nào và cả các bạn đã đăng ký nhưng chưa có lớp học.
select * 
from student
where class_id = null;
-- 4.Lấy thông tin của các học viên tên “Hai” và 'Huynh’.
select * 
from student 
where `name` like "%hai%" or `name` like "%huynh%";
-- 5. Lấy ra học viên có điểm lớn hơn 5.
select *
from student
where point > 5;
-- 6. Lấy ra học viên có họ là “nguyen”.
select *
from student 
where `name` like "%nguyen%";
-- 7.Thông kế số lượng học sinh theo từng loại điểm.
select count(+1)
from student
where point;
-- 8 .Thông kế số lượng học sinh theo điểm và điểm phải lớn hơn 5.
select count(+1)
from student
where point>5;
-- 9.Thông kế số lượng học sinh theo điểm lớn hơn 5 và chỉ hiện thị với số lượng>=2
select `point`, count(`point`) 
from student 
where `point` >5 group by `point` 
having count(`point`) >=2;
-- 10. Lấy ra danh sách học viên của lớp c1121g1 và sắp xếp tên học viên theo alphabet.
select *
from student join class on student.class_id= class_id
order by student.name; 
