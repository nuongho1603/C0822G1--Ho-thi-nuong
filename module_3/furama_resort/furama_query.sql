use furama_create_table;
-- 2.	Hiển thị thông tin của tất cả nhân viên có trong HỆ THỐNG CÓ TÊN bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
select * from nhan_vien nv where substring_index(nv.ho_ten, ' ', -1) like 'h%' 
or substring_index(nv.ho_ten, ' ',-1) like 't%' 
or  substring_index(nv.ho_ten, ' ',-1) like 'k%'
and length(nv.ho_ten) <= 15;
-- 2. hiEN THI THONG TIN THEO HỌ “H”, “T” hoặc “K” và có tối đa 15 kí tự.
select * from nhan_vien nv 
where nv.ho_ten like "H%" or   nv.ho_ten like "T%" or nv.ho_ten like "K%"
and length(nv.ho_ten) <= 15;

-- 3.Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select * 
from khach_hang as kh
where dia_chi like "%Đà Nẵng" 
or dia_chi like "%Quảng Trị"
and datediff (curdate(), ngay_sinh)/365 between 18 and 50; 

-- 4.Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần.
--  Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select kh.ma_khach_hang,kh.ho_ten,count(kh.ma_khach_hang) as so_luong_dat_phong
from hop_dong as hd
inner join khach_hang as kh on kh.ma_khach_hang = hd.ma_khach_hang
inner join loai_khach as lk on lk.ma_loai_khach = kh.ma_loai_khach
where lk.ten_loai_khach = "Diamond"
group by kh.ma_khach_hang
order by so_luong_dat_phong;

-- 5.	Hiển thị ma_khach_hang(kh), ho_ten(kh), ten_loai_khach(lk), ma_hop_dong(hd), ten_dich_vu(dv), ngay_lam_hop_dong, ngay_ket_thuc, 
-- tong_tien (Với tổng tiền được tính theo công thức như sau:
 -- Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) 
-- cho tất cả các khách hàng đã từng đặt phòng.
 -- (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
 select kh.ma_khach_hang,
 kh.ho_ten,
 lk.ten_loai_khach,
 hd.ma_hop_dong,
 dv.ten_dich_vu,
 hd.ngay_lam_hop_dong,
 hd.ngay_ket_thuc,
 (dv.chi_phi_thue + hdct.so_luong * dvdk.gia) as tong_tien
 from hop_dong as hd 
 right join khach_hang as kh on hd.ma_khach_hang = kh.ma_khach_hang
 inner join loai_khach as lk on lk.ma_loai_khach = kh.ma_loai_khach
 inner join dich_vu as dv on dv.ma_dich_vu = hd.ma_dich_vu 
 inner join hop_dong_chi_tiet as hdct
 inner join dich_vu_di_kem as dvdk
 group by kh.ma_khach_hang,hd.ma_hop_dong 
 order by kh.ma_khach_hang;
 
  select kh.ma_khach_hang,
 kh.ho_ten,
 lk.ten_loai_khach,
 hd.ma_hop_dong,
 dv.ten_dich_vu,
 hd.ngay_lam_hop_dong,
 hd.ngay_ket_thuc,
 (dv.chi_phi_thue + hdct.so_luong * dvdk.gia) as tong_tien
 from hop_dong as hd 
 right join khach_hang as kh on hd.ma_khach_hang = kh.ma_khach_hang
 left join loai_khach as lk on lk.ma_loai_khach = kh.ma_loai_khach
 left join dich_vu as dv on dv.ma_dich_vu = hd.ma_dich_vu 
 left join hop_dong_chi_tiet as hdct
 left join dich_vu_di_kem as dvdk
 group by kh.ma_khach_hang,hd.ma_hop_dong 
 order by kh.ma_khach_hang;