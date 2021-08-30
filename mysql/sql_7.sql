-- Lấy thông tin sinh viên có học bổng cao nhất.
select * from sinhvien where Hocbong >= (select Hocbong from sinhvien order by Hocbong desc limit 1)
select * from sinhvien where Hocbong = (select max(Hocbong) from sinhvien )
-- Cho biết những sinh viên điểm thi lần 1 cao nhất môn học 1.
select * from ketqua where  MonhocID = 1 AND SinhvienID = (select SinhvienID from ketqua where Lanthi = 1 order by Diemthi desc limit 1)
-- Cho biết sinh viên có điểm thi lần 2 môn bất kỳ lớn hơn tất cả điểm thi lần 1 của những sinh viên khác.
select * from ketqua where Lanthi = 2 and Diemthi >= any (select Diemthi from ketqua where Lanthi = 1 )
-- Cho biết sinh viên có nơi sinh cùng với Minh.
select * from sinhvien where Noisinh in (select Noisinh from sinhvien where Hoten like N'%Minh')
select * from sinhvien 
-- Cho biết điểm thi cao nhất mỗi môn học.
select * from ketqua
select MonhocID, max(Diemthi) from ketqua group BY MonhocID 
-- select MonhocID,Diemthi from ketqua group by MonhocID
-- Cho biết sinh viên có học bổng cao nhất mỗi khoa
select * ,KhoaID,MAX(Hocbong)from sinhvien group by KhoaID 
-- Môn học nào có nhiều sinh viên học nhất.
select MonhocID,count(SinhvienID) from ketqua group by MonhocID order by count(SinhvienID) desc limit 1
-- Khoa nào có đông sinh viên nam nhất.
select K.Tenkhoa,COUNT(k.Makhoa),k.Makhoa from khoa k ,sinhvien sv where sv.KhoaID =  k.KhoaID AND sv.Gioitinh = N'nam'group by k.Makhoa
HAVING COUNT(k.Makhoa) >= ALL(select count(sv.SinhvienID) from sinhvien sv WHERE sv.Gioitinh = N'nam' group by sv.KhoaID )/*dem so luong sinh vien trong moi khoa 
*/
select * from khoa
select *  from khoa k ,sinhvien sv where sv.KhoaID =  k.KhoaID AND sv.Gioitinh = N'nam'
-- Cho biết môn nào có nhiều sinh viên rớt lần 1 nhiều nhất.
select MonhocID from ketqua
where Lanthi = 1 and Diemthi < 5 group by MonhocID HAVING COUNT(Diemthi) >= all(select count(Diemthi) from ketqua where Lanthi = 1 and Diemthi < 5 group by MonhocID)
-- Cho biết sinh viên chưa thi môn học 1
select SinhvienID from ketqua where SinhvienID not in (select SinhvienID from ketqua where 	MonhocID = 1 and Lanthi = 1) group by SinhvienID
-- Cho biết những môn không có sinh viên rớt ở lần 1.
select  MonhocID  from KETqua WHERE  MonhocID not in(select MonhocID from ketqua where Lanthi = 1 and Diemthi < 5) group by MonhocID
-- Cho biết những sinh viên không có học bổng hoặc bị rớt môn học trong lần thi 1
select sv.SinhvienID from sinhvien sv WHERE sv.Hocbong <= 0 GROUP BY sv.SinhvienID union  (select SinhvienID FROM ketqua where Lanthi = 1 and Diemthi < 5 GROUP BY SinhvienID ) 
-- Cho biết những sinh viên có học bổng hoặc không trượt môn nào trong lần thi 1
select sv.SinhvienID from sinhvien sv WHERE sv.Hocbong > 0 GROUP BY sv.SinhvienID  union (select SinhvienID from ketqua where Lanthi = 1 and Diemthi >= 5 group by SinhvienID)
-- Điểm cao nhất và thấp nhất mỗi môn học
select max(Diemthi),MonhocID,MIN(DIEMTHI) FROM KETQUA GROUP BY MONHOCID
-- Tìm những môn mà tất cả sinh viên trong danh sách sinh viên đều học
SELECT MONHOCID,count(distinct sinhvienid) FROM KETQUA  GROUP BY MONHOCID having count(distinct sinhvienid) = (select count(sinhvienid) from sinhvien)
-- Tìm những sinh viên học những môn giống sinh viên 1 (có thể nhiều hơn)
select distinct sinhvienid from ketqua kq where exists (select distinct monhocid from ketqua where sinhvienid = '1')
-- Tìm những sinh viên học những môn bằng đúng sinh viên 1 (không hơn không kém môn nào)
select kq.sinhvienid from ketqua kq
where kq.monhocid = (select distinct monhocid from ketqua where sinhvienid = '1' and monhocid = kq.monhocid) and kq.sinhvienid not like '1' 
group by kq.sinhvienid
having count(distinct kq.monhocid ) = (select count(distinct monhocid) from ketqua where sinhvienid = '1')


