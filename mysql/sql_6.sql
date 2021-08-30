select * from ketqua
select * from khoa
select * from monhoc
select * from sinhvien
-- Danh sách những sinh viên có tuổi từ 21 đến 23
select * from sinhvien where (YEAR(CURDATE()) - YEAR(Ngaysinh)) between 21 and 23
-- Danh sách sinh viên sinh vào mùa xuân
select * from sinhvien where month(Ngaysinh) between 1 and 3
-- Cho biết thông tin về mức học bổng của các sinh viên. 
-- Trong đó, mức học bổng sẽ hiển thị là “Học bổng cao” 
-- nếu giá trị của học bổng lớn hơn 150,000 và ngược lại hiển thị là “Mức trung bình”
select *,
(case when Hocbong >= 150000 then 'hoc bong cao' else 'muc trung binh' end) 'thong tin muc hoc bong'  from sinhvien
-- Cho biết kết quả điểm thi của các sinh viên (Qua môn, trượt).
select *,(case when Diemthi >= 5.0 then ' qua mon' else 'truot' end)  'ket qua diem thi' from ketqua
-- Cho biết tổng số sinh viên, số sinh viên nam và số sinh viên nữ của mỗi khoa.
select count(SinhvienID) 'tong so luong sinh vien',KhoaID,
sum(case when Gioitinh = N'nữ' then 1 else 0 end) 'sv nu', 
sum(case when Gioitinh = N'nam' then 1 else 0 end) 'sv nam'
 from sinhvien group by KhoaID 
 -- Cho biết số lượng sinh viên theo từng tuổi [19-23]
 select count(SinhvienID),
 sum(case when (YEAR(CURDATE()) - YEAR(Ngaysinh)) = 19 then 1 else 0 end)'so luong sinh vien 19 tuoi',
 sum(case when (YEAR(CURDATE()) - YEAR(Ngaysinh)) = 20 then 1 else 0 end)'so luong sinh vien 20 tuoi',
 sum(case when (YEAR(CURDATE()) - YEAR(Ngaysinh)) = 21 then 1 else 0 end)'so luong sinh vien 21 tuoi',
 sum(case when (YEAR(CURDATE()) - YEAR(Ngaysinh)) = 22 then 1 else 0 end)'so luong sinh vien 22 tuoi',
 sum(case when (YEAR(CURDATE()) - YEAR(Ngaysinh)) = 23 then 1 else 0 end)'so luong sinh vien 23 tuoi'
 from sinhvien 
 -- Cho biết số lượng sinh viên đậu và số lượng sinh viên rớt của từng môn trong lần thi 1.
 select sum(case when Diemthi >= 5.0  and Lanthi = 1 then 1 else 0 end)'SO LUONG SINH VIEN DAU' ,
 sum(case when Diemthi < 5.0 and Lanthi = 1 then 1 else 0 end)'SO LUONG SINH VIEN TRUOT',
 MonhocID  from ketqua
 GROUP BY MonhocID
 -- Cho biết danh sách sinh viên rớt 2 môn trở lên ở lần thi 1.
 select SinhvienID,count(MonhocID) 'So mon truot' from ketqua
 where Lanthi = 1 and Diemthi < 5.0
 group by SinhvienID
 having count(MonhocID) >= 2
 -- Cho biết khoa nào có 2 sinh viên nam trở lên.
 select KhoaID from sinhvien where Gioitinh = N'Nam' GROUP BY KhoaID having count(SinhvienID) >= 2
 -- Cho biết môn không có sinh viên rớt ở lần 1.
select MonhocID  from ketqua where Lanthi = 1  group by MonhocID having sum(case when Diemthi < 5 then 1 else 0 end) = 0
select * from ketqua
SELECT * FROM ketqua
-- Cho biết sinh viên có điểm trung bình lần 1 từ 7 trở lên và không rớt môn nào ở lần 1.
-- select SinhvienID,Lanthi,avg(Diemthi) 'diem trung binh' from ketqua  where Lanthi = 1 group by SinhvienID having sum(case when Diemthi >= 5 then 1 else 0 end) = 0 and avg(Diemthi) >=7.0
select SinhvienID,AVG(Diemthi) from ketqua where SinhvienID NOT IN(select SinhvienID FROM ketqua where Lanthi = 1 and Diemthi < 5) group by SinhvienID HAVING AVG(Diemthi) >= 7
-- Cho biết sinh viên đăng ký học hơn 3 môn mà thi lần 1 không bị rớt môn nào.
-- select SinhvienID,Lanthi,count(MonhocID) from ketqua where Diemthi >= 5 and Lanthi = 1 group by Lanthi,SinhvienID having COUNT(MonhociD) > 3
select SinhvienID,COUNT(MonhocID) FROM ketqua where SinhvienID NOT IN(SELECT SinhvienID from ketqua where Lanthi = 1 and Diemthi < 5) group by SinhvienID HAVING count(MonhocID) > 3
-- Tìm những sinh viên nam 20 tuổi có học bổng mà quê quán không phải 1 trong các tỉnh Hà Nội, Đà Nẵng, Hải Phòng, Thái Bình.
select * from sinhvien sv where sv.Gioitinh = N'Nam' and (YEAR(CURDATE()) - YEAR(Ngaysinh)) = 24 and sv.Noisinh not in(N'Hà Nội', N'Đà Nẵng', N'Hải Phòng', N'Thái Bình')
-- Tìm những sinh viên nữ thuộc khoa số 1 sinh vào mùa hè và có học bổng
select * from sinhvien sv where sv.Gioitinh = N'nữ' and sv.KhoaID = 1 and sv.Hocbong > 0 and month(sv.Ngaysinh) in(5,6,7,8)
-- Tìm môn học có điểm trung bình trên 7 mà không có sinh viên trượt ở lần thi 1
-- select avg(kq.Diemthi),kq.Lanthi,kq.MonhocID from ketqua kq where kq.Lanthi = 1 and kq.Diemthi >= 5 group by kq.Lanthi,kq.MonhocID HAVING avg(kq.Diemthi) > 7 
SELECT  MonhocID FROM ketqua where MonhocID  not in ( select  MonhocID from ketqua where Lanthi = 1 and Diemthi < 5) group by MonhocID HAVING AVG(Diemthi) > 7
-- Tìm những sinh viên trượt 3 môn học trở lên
select COUNT(distinct kq.MonhocID),kq.SinhvienID from ketqua kq WHERE kq.Diemthi < 5 and kq.Lanthi = 1 group by kq.MonhocID HAVING COUNT(distinct kq.MonhocID) >= 3
-- Tìm những sinh viên học 5 môn trở lên mà điểm trung bình thi lần 1 trên 8
-- select SinhvienID, COUNT(distinct MonhocID),avg(kq.Diemthi) from ketqua WHERE　Lanthi = 1  group by SinhvienID,Diemthi having COUNT(distinct MonhocID) > 5 and avg(Diemthi) > 8
select sinhvienid,avg(diemthi) from ketqua where lanthi = 1 group by sinhvienid  having count(distinct monhocid) >= 3 and avg(diemthi)>8 
-- Điểm thi cao nhất và thấp nhất môn học 1
select min(kq.Diemthi),max(kq.Diemthi),kq.MonhocID from ketqua kq where kq.MonhocID = 1 GROUP BY kq.MonhocID 
-- Tìm những sinh viên có điểm thi lần 2 cao hơn hoặc bằng điểm cao nhất trong lần thi 1
select  * from ketqua kq where kq.Lanthi = 2 and kq.Diemthi >= (select max(Diemthi) from ketqua where Lanthi = 1)
select * from ketqua