-- Đếm tổng số nhân viên trong công ty
select count(nv.NhanvienID) as 'tong so nhan vien'  from nhanvien nv
-- Đếm tổng số dự án đã được đề ra
select count(da.DuanID) as tongsoduan from duan da
-- Đếm tổng số nhân viên tham gia dự án số 1
 -- select * from nhanvien
--  select * from duan
 -- select *  from phancong where DuanID = 1
 select count(pc.NhanvienID),pc.DuanID from phancong pc where pc.DuanID = 1
 -- Đếm số nhân viên tham gia mỗi dự án
  select count(pc.NhanvienID),pc.DuanID from phancong pc group by pc.DuanID
-- Tính tổng giờ làm của nhân viên 1
select sum(pc.Sogiolam), pc.NhanvienID from phancong pc where pc.NhanvienID = 1
-- Tính tổng giờ làm của mỗi nhân viên
select sum(pc.Sogiolam), pc.NhanvienID from phancong pc group by pc.NhanvienID
-- Tìm nhân viên có tổng số giờ làm cao nhất dự án 1
select max(pc.Sogiolam),pc.NhanvienID from phancong pc where pc.DuanID = 1
-- Tìm dự án có ít nhân viên tham gia nhất
select pc.DuanID,count(pc.NhanvienID) from phancong pc GROUP BY pc.DuanID HAVING count(pc.NhanvienID) = 
(select count(pc.NhanvienID) from phancong pc group by pc.DuanID order by count(pc.NhanvienID) asc limit 1)
-- Tìm nhân viên có số giờ làm cao nhất công ty
select sum(pc.Sogiolam),pc.NhanvienID from phancong pc GROUP BY pc.NhanvienID ORDER BY SUM(pc.Sogiolam) desc limit 1
-- Tính tổng giờ làm của mỗi dự án
select sum(pc.Sogiolam),pc.DuanID from phancong pc group by pc.DuanID
-- Tính số giờ làm trung bình trong mỗi dự án
select avg(pc.Sogiolam),pc.DuanID from phancong pc group by pc.DuanID
-- Tính số giờ làm trung bình mỗi nhân viên (mỗi dự án làm trung bình bao nhiêu giờ)
select avg(pc.Sogiolam),pc.NhanvienID from phancong pc GROUP BY pc.NhanvienID 
-- Tìm 3 dự án có tổng số giờ làm của nhân viên là cao nhất
select  sum(pc.Sogiolam),pc.DuanID from phancong pc GROUP BY pc.DuanID order by sum(pc.Sogiolam) desc limit 3
-- Tìm 3 nhân viên có số giờ làm cao nhất công ty
select sum(pc.Sogiolam),pc.NhanvienID from phancong pc group by pc.NhanvienID order by sum(pc.Sogiolam) desc limit 3
-- Tìm những nhân viên có tổng giờ làm trên 300 giờ
select sum(pc.Sogiolam),pc.NhanvienID from phancong pc group by pc.NhanvienID having sum(pc.Sogiolam) > 300
-- Tìm những nhân viên có tổng giờ làm từ 150 – 200 giờ
select sum(pc.Sogiolam),pc.NhanvienID from phancong pc group by pc.NhanvienID having sum(pc.Sogiolam) between 150 and 200
-- Đếm mỗi thành phố có bao nhiêu nhân viên
select count(nv.NhanvienID) as ' so luong  nhan vien',nv.Diachi as 'thanh pho' from nhanvien nv group by nv.Diachi
-- Tìm 3 nhân viên có số giờ làm thấp nhất công ty 
select sum(pc.Sogiolam),pc.NhanvienID from phancong pc group by pc.NhanvienID order by sum(pc.Sogiolam) limit 3
-- Tìm những thành phố nào có ít hơn 3 nhân viên
select count(nv.NhanvienID) as ' so luong  nhan vien',nv.Diachi as 'thanh pho' from nhanvien nv group by nv.Diachi having count(nv.NhanvienID) < 3
-- Tìm nhân viên tham gia nhiều dự án nhất
select count(pc.DuanID), pc.NhanvienID from phancong pc GROUP BY pc.NhanvienID order by count(pc.DuanID) DESC limit 1