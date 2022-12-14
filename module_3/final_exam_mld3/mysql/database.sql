create database toa_nha_tcomplex;
use toa_nha_tcomplex;
 
 create table mat_bang_tcomplex(
 ma_mb varchar(45) primary key,
 dien_tich int,
 trang_thai varchar(45),
 tang int,
 loai_van_phong varchar(45),
 mo_ta_chi_tiet varchar(45),
 gia int,
 ngay_bat_dau date,
 ngay_ket_thuc date)
 ;
 
 insert into mat_bang_tcomplex(ma_mb,dien_tich,trang_thai,tang,loai_van_phong,mo_ta_chi_tiet,gia,ngay_bat_dau,ngay_ket_thuc)
 values ("MB001",100,"trống",2,"cho thuê","s", 200000,"2020-11-20",'2020-11-20'),
("MB002",200,"trống",5,"cho thuê","a", 800000,"2021-11-20",'2020-11-20');

select* from mat_bang_tcomplex;