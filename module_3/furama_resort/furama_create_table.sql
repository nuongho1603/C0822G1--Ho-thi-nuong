create database furama_create_table;
use furama_create_table;
-- tạo bảng vi trí.
create table vi_tri(
  ma_vi_tri int primary key, 
  ten_vi_tri varchar(45)
);
-- tạo bảng trình độ.
create table trinh_do(
  ma_trinh_do int primary key, 
  ten_trinh_do varchar (45)
);
-- tạo bảng bộ phận. 
create table bo_phan(
  ma_bo_phan int primary key, 
  ten_bo_phan varchar(45)
);
-- tạo bảng nhân viên. 
create table nhan_vien(
  ma_nhan_vien int primary key, 
  ho_ten varchar(45), 
  ngay_sinh date, 
  so_cmnd varchar(45), 
  luong double, 
  so_dien_thoai varchar(45), 
  email varchar(45), 
  dia_chi varchar(45), 
  ma_vi_tri int, 
  foreign key(ma_vi_tri) references vi_tri(ma_vi_tri), 
  ma_trinh_do int, 
  foreign key(ma_trinh_do) references trinh_do(ma_trinh_do), 
  ma_bo_phan int, 
  foreign key(ma_bo_phan) references bo_phan(ma_bo_phan)
);
-- select * from vi_tri cross join nhan_vien;
-- tạo bảng loại khách. 
create table loai_khach(
  ma_loai_khach int primary key, 
  ten_loai_khach varchar(45)
);
-- tạo bảng khách hàng. 
create table khach_hang(
  ma_khach_hang int primary key, 
  ho_ten varchar(45), 
  ngay_sinh date, 
  gioi_tinh bit(1), 
  so_cmnd varchar (45), 
  so_dien_thoai varchar (45), 
  email varchar(45), 
  dia_chi varchar(45),
  ma_loai_khach int, 
  foreign key(ma_loai_khach) references loai_khach(ma_loai_khach)
);

-- tạo bảng hợp đồng .
create table hop_dong(
  ma_hop_dong int primary key, 
  ngay_lam_hop_dong datetime, 
  ngay_ket_thuc datetime, 
  tien_dat_coc double, 
  ma_nhan_vien int, 
  foreign key(ma_nhan_vien) references nhan_vien(ma_nhan_vien), 
  ma_khach_hang int, 
  foreign key(ma_khach_hang) references khach_hang(ma_khach_hang), 
  ma_dich_vu int, 
  foreign key(ma_dich_vu) references dich_vu(ma_dich_vu)
);
-- tạo bảng loại dich vu .
create table loai_dich_vu(
  ma_loai_dich_vu int primary key, 
  ten_loai_dich_vu varchar(45)
);

-- tạo bảng dịch vụ.
create table dich_vu(
  ma_dich_vu int primary key, 
  ten_dich_vu varchar(45), 
  dien_tich int, 
  chi_phi_thue double, 
  so_nguoi_toi_da int, 
  tieu_chuan_phong varchar(45),
  mo_ta_tien_nghi_khac varchar(45), 
  dien_tich_ho_boi double, 
  so_tang int, 
  dich_vu_mien_phi_di_kem text,
  ma_kieu_thue int, 
  foreign key(ma_kieu_thue) references kieu_thue(ma_kieu_thue), 
  ma_loai_dich_vu int, 
  foreign key(ma_loai_dich_vu) references loai_dich_vu(ma_loai_dich_vu)
 );
-- tao bang kieu thue.
create table kieu_thue(
  ma_kieu_thue int primary key, 
  ten_kieu_thue varchar(45)
);
-- tao bảng hợp đồng chi tiết. 
create table hop_dong_chi_tiet(
  ma_hop_dong_chi_tiet int primary key, 
  so_luong int,
  ma_hop_dong int, 
  foreign key(ma_hop_dong) references hop_dong(ma_hop_dong), 
  ma_dich_vu_di_kem int, 
  foreign key(ma_dich_vu_di_kem) references dich_vu_di_kem(ma_dich_vu_di_kem)
);
-- tao bảng dịch vụ đi kèm.
create table dich_vu_di_kem(
  ma_dich_vu_di_kem int primary key, 
  ten_dich_vu_di_kem varchar(45), 
  gia double, 
  don_vi varchar(10), 
  trang_thai varchar(45)
);
drop table hop_dong_chi_tiet;
