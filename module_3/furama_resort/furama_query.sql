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
 from khach_hang as kh
 right join hop_dong as hd  on hd.ma_khach_hang = kh.ma_khach_hang
 inner join loai_khach as lk on lk.ma_loai_khach = kh.ma_loai_khach
 inner join dich_vu as dv on dv.ma_dich_vu = hd.ma_dich_vu 
 inner join hop_dong_chi_tiet as hdct
 inner join dich_vu_di_kem as dvdk
 group by kh.ma_khach_hang,hd.ma_hop_dong 
 order by kh.ma_khach_hang;
 
 -- 6.	Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu của 
 -- tất cả các loại dịch vụ chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).
 select dv.ma_dich_vu,dv.ten_dich_vu,dv.dien_tich,dv.chi_phi_thue, ldv.ten_loai_dich_vu
 from dich_vu as dv 
  join loai_dich_vu as ldv on dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
  join hop_dong as hd on hd.ma_dich_vu = dv.ma_dich_vu 
where (hd.ma_dich_vu) not in (select ma_dich_vu from hop_dong where month(ngay_lam_hop_dong) in (1,2,3) and year(ngay_lam_hop_dong)=2021)
group by dv.ma_dich_vu;
 
 -- 7.	Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu 
 -- của tất cả các loại dịch vụ đã từng được khách hàng đặt phòng trong năm 2020 nhưng chưa từng được khách hàng đặt phòng trong năm 2021.
 select dv.ma_dich_vu, dv.ten_dich_vu,dv.dien_tich, dv.so_nguoi_toi_da,dv.chi_phi_thue,ldv.ten_loai_dich_vu
 from dich_vu as dv
join loai_dich_vu as ldv on dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
 join hop_dong as hd on hd.ma_dich_vu = dv.ma_dich_vu
  where year(hd.ngay_lam_hop_dong)  in (2020) and hd.ma_dich_vu not in(select ma_dich_vu from hop_dong where year(ngay_lam_hop_dong)=2021)
  group by dv.ma_dich_vu;
 
 -- 8.	Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên.
-- c1:
select kh.ho_ten,kh.ma_khach_hang
from khach_hang kh
union
select kh.ho_ten,kh.ma_khach_hang
from khach_hang kh;

-- c2:
select ho_ten from khach_hang
group by ho_ten;


-- 9.Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(hd.ngay_lam_hop_dong) as thang,count(hd.ma_hop_dong) as so_luong_khach_hang
from hop_dong as hd
where year(hd.ngay_lam_hop_dong)=2021
group by thang
order by thang;

-- order by thang;

-- 10.	Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm.
-- Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).
select hd.ma_hop_dong,hd.ngay_lam_hop_dong,hd.ngay_ket_thuc,hd.tien_dat_coc, sum(ifnull(hdct.so_luong,0)) as so_luong_dich_vu_di_kem
 from hop_dong as hd
 left join hop_dong_chi_tiet as hdct on hd.ma_hop_dong = hdct.ma_hop_dong 
 group by hd.ma_hop_dong;
 
 -- 11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.

 select dvdk.ma_dich_vu_di_kem,dvdk.ten_dich_vu_di_kem
 from dich_vu_di_kem as dvdk
 inner join hop_dong_chi_tiet as hdct on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
 inner join hop_dong as hd on hdct.ma_hop_dong = hd.ma_hop_dong
 inner join khach_hang as kh on hd.ma_khach_hang = kh.ma_khach_hang
 inner join loai_khach as lk on kh.ma_loai_khach = lk.ma_loai_khach
where lk.ten_loai_khach = "Diamond" and kh.dia_chi like "%Vinh%" or kh.dia_chi like "%Quảng Ngãi";

-- 12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng), ten_dich_vu, so_luong_dich_vu_di_kem 
-- (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), 
-- tien_dat_coc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.
select hd.ma_hop_dong,nv.ho_ten,kh.ho_ten,kh.so_dien_thoai,dv.ten_dich_vu,sum(hdct.so_luong) as so_luong_dich_vu_di_kem,hd.tien_dat_coc
from hop_dong as hd
join nhan_vien as nv on hd.ma_nhan_vien = nv.ma_nhan_vien
join khach_hang as kh on hd.ma_khach_hang = kh.ma_khach_hang
left join dich_vu as dv on hd.ma_dich_vu = dv.ma_dich_vu
left join hop_dong_chi_tiet as hdct on hd.ma_hop_dong =hdct.ma_hop_dong
where month(hd.ngay_lam_hop_dong) in (10,11,12) and year(hd.ngay_lam_hop_dong) = 2020 and dv.ma_dich_vu not in(
select distinct ma_dich_vu 
from hop_dong hd  where month(hd.ngay_lam_hop_dong) between 1 and 6 and year(hd.ngay_lam_hop_dong)=2021)
group by hd.ma_hop_dong;
  ;
 
-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
 -- select dvdk.ma_dich_vu_di_kem,dvdk.ten_dich_vu_di_kem,max(dv.ma_dich_vu) as so_luong_dich_vu_di_kem
-- from khach_hang as kh
-- inner join hop_dong as hd on kh.ma_khach_hang = hd.ma_khach_hang    
-- inner join dich_vu as dv on hd.ma_dich_vu = dv.ma_dich_vu
-- inner join hop_dong_chi_tiet as hdct on hd.ma_hop_dong = hdct.ma_hop_dong
 -- inner join dich_vu_di_kem as dvdk on hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
 -- group by dvdk.ma_dich_vu_di_kem
 -- limit 2;

-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu,
--  ten_dich_vu_di_kem, so_lan_su_dung (được tính dựa trên việc count các ma_dich_vu_di_kem).
select hd.ma_hop_dong, ldv.ten_loai_dich_vu,dvdk.ten_dich_vu_di_kem,count(dvdk.ma_dich_vu_di_kem) as so_lan_su_dung
from hop_dong as hd 
 join dich_vu as dv on hd.ma_dich_vu = dv.ma_dich_vu
 join loai_dich_vu as ldv on dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
 join hop_dong_chi_tiet as hdct on hd.ma_hop_dong = hdct.ma_hop_dong
 join dich_vu_di_kem as dvdk on hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
group by dvdk.ma_dich_vu_di_kem
having count(dvdk.ma_dich_vu_di_kem) = 1;

-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi
-- mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.
select *
from nhan_vien as nv 
join hop_dong as hd on nv.ma_nhan_vien = hd.ma_nhan_vien
group by nv.ma_nhan_vien
having count(hd.ma_hop_dong) <= 3 ;

-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.
set sql_safe_updates = 0;
set sql_safe_updates = 1;
delete nv.ma_nhan_vien
 from nhan_vien as nv where not exists(select nv.ma_nhan_vien,nv.ho_ten from nhan_vien as nv
 join hop_dong as hd on nv.ma_nhan_vien = hd.ma_nhan_vien 
 group by nv.ma_nhan_vien);
 
 -- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, 
 -- chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.
-- select *
-- from khach_hang as kh
-- join loai_khach as lk on kh.ma_loai_khach = lk.ma_loai_khach
-- join hop_dong as hd on kh.ma_khach_hang = hd.ma_khach_hang
-- join dich_vu as dv on hd.ma_dich_vu = dv.ma_dich_vu 
-- where lk.ten_loai_khach between Platinum and Diamond

 -- 18.	Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).
 delete from khach_hang where (
 select *
 from khach_hang as kh
 join hop_dong as hd on kh.ma_khach_hang = hd.ma_khach_hang
 where year(hd.ngay_lam_hop_dong) <2021);
 
 -- 19.	Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi.
--  select *
--  from dich_vu_di_kem as dvdk
--  join 

-- 20.	Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, 
-- thông tin hiển thị bao gồm id (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.
select nv.ma_nhan_vien,kh.ma_khach_hang,nv.ho_ten,kh.ho_ten,nv.email,kh.email,nv.so_dien_thoai,kh.so_dien_thoai,nv.ngay_sinh,kh.ngay_sinh,nv.dia_chi,kh.dia_chi
from nhan_vien as nv
left join hop_dong as hd on hd.ma_nhan_vien = nv.ma_nhan_vien
left join khach_hang as kh on hd.ma_khach_hang = kh.ma_khach_hang
;