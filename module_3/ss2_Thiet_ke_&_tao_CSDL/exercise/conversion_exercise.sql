create database conversion_exercise;
use conversion_exercise;
create table nha_cung_cap(
  ma_ncc int primary key, 
  ten_ncc varchar(45), 
  dia_chi varchar(200)
);

create table sdt(
  ma_ncc int, 
  foreign key(ma_ncc) references nha_cung_cap(ma_ncc), 
  sdt int
);

create table phieu_xuat(
  so_px int primary key, ngay_xuat date
);
create table vat_tu(
  ma_vtu int primary key, 
  ten_vtu varchar(45)
);

create table chi_tiet_phieu_xuat(
  so_px int, 
  ma_vtu int, 
  primary key(so_px, ma_vtu), 
  foreign key(so_px) references phieu_xuat(so_px), 
  foreign key(ma_vtu) references vat_tu(ma_vtu), 
  dg_xuat double, 
  sl_xuat int
);

create table phieu_nhap(
  so_pn int primary key, ngay_nhap date
);

create table chi_tiet_phieu_nhap(
  ma_vtu int, 
  so_pn int, 
  primary key(ma_vtu, so_pn), 
  foreign key (ma_vtu) references vat_tu(ma_vtu), 
  foreign key (so_pn) references phieu_nhap(so_pn), 
  dg_nhap double, 
  sl_nhap int
);

create table don_dh(so_dh int primary key, ngay_dh date);
create table chi_tiet_don_dat_hang(
  ma_vtu int, 
  so_dh int, 
  primary key (ma_vtu, so_dh), 
  foreign key(ma_vtu) references vat_tu(ma_vtu), 
  foreign key(so_dh) references don_dh(so_dh)
);

create table cung_cap(
  so_dh int, 
  ma_ncc int, 
  primary key(so_dh, ma_ncc), 
  foreign key(so_dh) references don_dh(so_dh), 
  foreign key(ma_ncc) references nha_cung_cap(ma_ncc)
);