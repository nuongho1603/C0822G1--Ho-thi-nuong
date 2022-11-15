create database QuanLiDiemThi;
use QuanLiDiemThi;
create table hoc_sinh(
ma_hoc_sinh varchar(10) primary key,
ten_hs varchar(40),
ngay_sinh datetime,
lop varchar(10),
gioi_tinh varchar(10)
);

create table mon_hoc(
ma_mh varchar(10) primary key,
ten_mh varchar(45),
ma_gv varchar(45)
);

alter table mon_hoc add ma_gv varchar(20);
alter table mon_hoc add constraint fk_ma_gv foreign key(ma_gv) references giao_vien(ma_gv);

select * from mon_hoc;
create table bang_diem(
ma_hoc_sinh varchar(10),
ma_mh varchar(10),
diem_thi int,
ngay_kiem_tra datetime,
primary key (ma_hoc_sinh,ma_mh),
foreign key(ma_hoc_sinh) references hoc_sinh(ma_hoc_sinh),
foreign key(ma_mh) references mon_hoc(ma_mh)
);

create table giao_vien(
ma_gv varchar(20) primary key,
ten_gv varchar(45),
sdt varchar(10)
);