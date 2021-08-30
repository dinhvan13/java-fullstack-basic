-- Lấy thông tin loại sản phẩm của từng sản phẩm (select TenSanPham, TenLoai)
select lsp.TenLoai,sp.TenSanPham from sanpham sp inner join loaisanpham lsp on sp.LoaiSanPhamID = lsp.LoaiSanPhamID group by sp.sanphamid
-- In ra danh sách các sản phẩm không bán được trong năm 2019
select sp.sanphamid from sanpham sp where not exists (select ctdh.sanphamid from dondathang ddh inner join chitietdondathang ctdh on ddh.dondathangid = ctdh.dondathangid where year(ddh.ngaydat) = 2019 and sp.sanphamid = ctdh.sanphamid)
-- In ra danh sách sản phẩm thuộc loại "Đồ ăn" sản xuất và được bán ra trong ngày 25/5/2020 (sản xuất và bán ra là cùng 1 ngày)
select*, sp.loaisanphamid from sanpham sp where exists(select ctdh.sanphamid from dondathang ddh inner join chitietdondathang ctdh on ddh.dondathangid = ctdh.dondathangid where ddh.ngaydat ='2020-05-25' and sp.ngaydang = '2020-05-25' and sp.loaisanphamid = 1)
-- Tìm các số hiệu đơn đã mua sản phẩm thuộc loại sản phẩm "Đồ ăn" hoặc "Đồ uống", mỗi sản phẩm mua với số lượng từ 10 đến 20.
select ddh.sohieudon,ddh.dondathangid from dondathang ddh  
where ddh.dondathangid in (select distinct ctdh.dondathangid from chitietdondathang  ctdh inner join sanpham sp on ctdh.sanphamid = sp.sanphamid where sp.loaisanphamid in (select loaisanphamid from loaisanpham where tenloai like N'Đồ ăn' OR TENLOAI LIKE N'Đồ uống')  or sp.loaisanphamid = 2 and ctdh.soluong between 10 and 20) 
-- In ra tổng tiền của các hóa đơn trong ngày 25/05/2020
/*select sp.sanphamid ,ctdh.dondathangid in  (select distinct ddh.dondathangid from dondathang ddh inner join chitietdondathang ctdh on ddh.dondathangid = ctdh.dondathangid where ddh.ngaydat='2020-05-25' group by ddh.dondathangid) 
as chitietdondathang ,*/
-- sum(sp.giaban*ctdh.soluong)as giaban from chitietdondathang ctdh inner join sanpham sp on ctdh.sanphamid = sp.sanphamid group by sanphamid
select sum(sp.giaban*ctddh.soluong) from( sanpham sp inner join chitietdondathang ctddh on sp.sanphamid = ctddh.sanphamid )  inner join dondathang ddh where ddh.ngaydat = '2020-05-25'

-- Tính tổng số sản phẩm của từng hóa đơn
SELECT * FROM dondathang.chitietdondathang;
select dondathangid,sum(soluong*sanphamid) as soluong from chitietdondathang group by dondathangid 
-- Tìm khách hàng có số lần mua hàng nhiều nhất.
SELECT * FROM dondathang
select  kh.hoten,ddh.khachhangid,count(ddh.khachhangid) as 'soluongdon' from dondathang ddh inner join khachhang kh on ddh.khachhangid = kh.khachhangid group by ddh.khachhangid,kh.hoten order by count(ddh.khachhangid) desc limit 1
-- Tìm hóa đơn có mua 3 sản phẩm do Việt Nam sản xuất (3 sản phẩm khác nhau)
select distinct ddh.dondathangid,count(distinct ddh.sanphamid) from chitietdondathang ddh inner join sanpham sp on ddh.sanphamid = sp.sanphamid
where sp.nhasanxuat = N'Việt Nam'
group by ddh.dondathangid
having count(distinct ddh.sanphamid) = 3
-- Tháng mấy trong năm 2019 có doanh số bán hàng cao nhất ?
select sum(sp.giaban*ctddh.soluong) as doanhthutheothang,month(ddh.ngaydat) thang  from(sanpham sp inner join chitietdondathang ctddh on sp.sanphamid = ctddh.sanphamid) inner join dondathang ddh on ctddh.dondathangid = ddh.dondathangid where year(ddh.ngaydat) = 2019 group by month(ddh.ngaydat) order by doanhthutheothang desc limit 1
-- Cho biết trị giá hóa đơn cao nhất là bao nhiêu ?
select max(sp.giaban* ctddh.soluong) as doanhso from (sanpham sp inner join chitietdondathang ctddh on sp.sanphamid = ctddh.sanphamid) inner join dondathang ddh on ctddh.dondathangid = ddh.dondathangid
-- Cho biết trị giá hóa đơn cao nhất và thấp nhất là bao nhiêu ?
select max(sp.giaban* ctddh.soluong)  from (sanpham sp 
inner join chitietdondathang ctddh on sp.sanphamid = ctddh.sanphamid) 
inner join dondathang ddh on ctddh.dondathangid = ddh.dondathangid 
union
(select min(sp.giaban* ctddh.soluong)  from (sanpham sp inner join chitietdondathang ctddh on sp.sanphamid = ctddh.sanphamid) 
inner join dondathang ddh on ctddh.dondathangid = ddh.dondathangid)
-- Tìm sản phẩm có tổng số lượng bán ra thấp nhất trong năm 2019
select ctddh.sanphamid,sum(ctddh.soluong) as soluongbanra from dondathang ddh 
inner join chitietdondathang ctddh on ddh.dondathangid = ctddh.dondathangid 
where year(ddh.ngaydat) = 2019 
group by ctddh.sanphamid 
order by soluongbanra asc limit 1
-- Loại sản phẩm nào bán chạy nhất từ đầu năm đến nay ? (số lượng bán ra của sản phẩm thuộc loại đó là nhiều nhất)
select lsp.loaisanphamid,lsp.tenloai,sum(ctddh.soluong) as soluong from loaisanpham lsp 
inner join sanpham sp on lsp.loaisanphamid = sp.loaisanphamid  
inner join chitietdondathang ctddh on sp.sanphamid = ctddh.sanphamid  
inner join dondathang ddh on ctddh.dondathangid = ddh.dondathangid  where year(ddh.ngaydat) = 2019 and (month(ddh.ngaydat) between 1 and 4 )
 group by lsp.loaisanphamid order by sum(ctddh.soluong) desc limit 1
-- Tìm những loại sản phẩm được bán ra trong ngày 9/6/2020
select distinct lsp.loaisanphamid,lsp.tenloai from (loaisanpham lsp inner join sanpham  sp on lsp.loaisanphamid = sp.loaisanphamid) inner join chitietdondathang ctddh on sp.sanphamid = ctddh.sanphamid inner join dondathang ddh  on ctddh.dondathangid = ddh.dondathangid where ddh.ngaydat = '2020-06-09'
-- Tìm những khách hàng ở Hà Nội đã mua sản phẩm thuộc loại 1 trong tháng 6 năm 2020
select distinct kh.khachhangid,kh.hoten from khachhang kh inner join dondathang ddh on kh.khachhangid = ddh.khachhangid inner join chitietdondathang ctddh on ddh.dondathangid = ctddh.dondathangid    where kh.DIACHI like N'Hà Nội' and ctddh.sanphamid in (select sanphamid from loaisanpham where loaisanphamid = 1)and year(ddh.ngaydat) = 2020 and month(ddh.ngaydat) = 6
-- Tìm những sản phẩm chưa bán được trong 6 tháng vừa qua
select sp.sanphamid from sanpham sp where not exists(select ctddh.sanphamid from chitietdondathang ctddh inner join dondathang ddh on ctddh.dondathangid = ddh.dondathangid where year(ddh.ngaydat) = 2020 and month(ddh.ngaydat) in(1,2,3,4,5,6,7))
-- Tìm những hóa đơn có 3 loại sản phẩm khác nhau.
select ctddh.dondathangid,count(distinct sp.sanphamid) from chitietdondathang ctddh inner join sanpham sp on ctddh.sanphamid = sp.sanphamid group by ctddh.dondathangid having count(distinct sp.sanphamid) >= 3

-- Tìm những khách hàng đặt trên 100 sản phẩm trong 1 hóa đơn
select *,kh.khachhangid,ctddh.dondathangid,kh.hoten,sum(ctddh.soluong) as soluong from (khachhang kh inner join dondathang ddh on kh.khachhangid = ddh.khachhangid) inner join chitietdondathang ctddh on ddh.dondathangid = ctddh.dondathangid group by ctddh.dondathangid,kh.khachhangid having soluong > 100
-- Hóa đơn có số lượng sản phẩm cao nhất là hóa đơn nào, bao nhiêu sản phẩm, gồm mấy loại sản phẩm.
 select ctddh.dondathangid, max(ctddh.soluong) as soluong,count(distinct ctddh.sanphamid),count(distinct sp.loaisanphamid) from chitietdondathang ctddh inner join sanpham sp on ctddh.sanphamid = sp.sanphamid group by ctddh.dondathangid order by soluong desc limit 1
 

-- Tìm những sản phẩm chỉ được đặt 1 lần duy nhất.
select *,count(distinct ctddh.sanphamid) from sanpham sp inner join chitietdondathang ctddh on sp.sanphamid = ctddh.sanphamid where  ctddh.soluong = 1 group by ctddh.sanphamid having count(ctddh.sanphamid) = 1 
