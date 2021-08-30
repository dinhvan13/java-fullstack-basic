/*danh sach cac hoc sinh co ho ten bat dau bang chu T*/
select * from hocsinh where Hoten like'T%'
/*liet ke danh sach nhung hoc sinh co chu a cai cuoi cung l*/
select * from hocsinh where Hoten like'%l'
/*danh sach nhung hoc sinh co ky tu thu hai cua ho ten la chu N*/
select * from hocsinh where Hoten like'_N%'
/*Liệt kê những học sinh mà họ tên có chứa chữ Thị.*/
select * from hocsinh where Hoten like N'%Thị%'
/*Cho biết danh sách những học sinh có ký tự đầu tiên của họ tên nằm trong khoảng từ a đến m*/
select * from hocsinh where Hoten like 'a%' or Hoten like 'm%'
/*Liệt kê các học sinh có địa chỉ ở Hà Nội*/
select * from hocsinh where Diachi like N'Hà Nội'
/*Danh sách các học sinh nữ có địa chỉ ở Hà Nội*/
select * from hocsinh where Diachi like N'Hà Nội' and GioiTinh like N'nữ'
/*Cho biết những học sinh có ngày sinh từ ngày 01/01/2005 đến ngày 05/06/2005*/
select distinct * from hocsinh where Ngaysinh between '2005-01-01' and '2005-06-05'
/*Danh sách những học sinh thuộc 1 trong các tỉnh Hà Nội, , Cao Bằng*/
select * from hocsinh where Diachi = N'Hà Nội' OR Diachi = N'Thái Bình'OR Diachi = N'Cao Bằng'
/*Cho biết những lớp có trên 30 học sinh và có giáo viên chủ nhiệm tên Quỳnh*/
select * from lop where Siso > 30 and GVCN like N'Quỳnh'
/*Danh sách học sinh nam ở Hà Giang thuộc lớp số 5*/
select hs.* from hocsinh hs ,lop l where hs.lopID = l.lopID and DiaChi = N'Hà Giang' and l.lopID = 5
/*Danh sách học sinh chưa có địa chỉ email*/
select * from hocsinh where Email is null
/*Danh sách những học sinh không sinh năm 2005*/
select * from hocsinh where NgaySinh not like '2005%'
/*Liệt kê danh sách học sinh, họ tên sắp xếp theo thứ tự trong bảng chữ cái*/
select hs.Hoten from hocsinh hs order by Hoten asc
/*Liệt kê danh sách học sinh, sắp xếp theo thứ tự giảm dần của ID học sinh*/
select * from hocsinh hs order by hs.HocsinhID DESC
/*Liệt kê danh sách học sinh, sắp xếp theo thứ tự ngày sinh tăng dần và lớp giảm dần.*/
select hs.Hoten,hs.LopID,hs.Ngaysinh from hocsinh hs  order by hs.Ngaysinh asc, hs.LopID desc
/*Liệt kê danh sách lớp tăng dần theo sĩ số*/
select * from lop l order by Siso asc
/*Liệt kê danh sách học sinh nữ ở Hà Nội, sắp xếp tăng dần theo ngày sinh*/
select * from hocsinh  where Diachi like N'Hà Nội' and Gioitinh like N'nữ'order by Ngaysinh asc
/*Liệt kê những học sinh mà địa chỉ không thuộc 1 trong các tỉnh Hà Nội, Lào Cai, Thanh Hóa, sắp xếp lớp tăng dần*/
select * from hocsinh where Diachi not in ('Hà Nội', 'Lào Cai', 'Thanh Hóa') order by lopID asc
/*Liệt kê tất cả địa chỉ quê quán của học sinh (không được liệt kê trùng lặp)*/
select distinct hs.Diachi from hocsinh hs 




