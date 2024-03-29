package com.example.demo.Model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "khoahoc")
public class KhoaHoc {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	@Size(max = 10, message = "ten khoa hoc khong duoc dai hon 10 ky tu")
	private String tenKhoaHoc;

	@Column
	private String moTa;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenKhoaHoc() {
		return tenKhoaHoc;
	}

	public void setTenKhoaHoc(String tenKhoaHoc) {
		this.tenKhoaHoc = tenKhoaHoc;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public double getHocPhi() {
		return hocPhi;
	}

	public void setHocPhi(double hocPhi) {
		this.hocPhi = hocPhi;
	}

	public Date getNgayBatDau() {
		return ngayBatDau;
	}

	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	public Date getNgayKetThuc() {
		return ngayKetThuc;
	}

	public void setNgayKetThuc(Date ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}

	public Set<HocVien> getHocViens() {
		return hocViens;
	}

	public void setHocViens(Set<HocVien> hocViens) {
		this.hocViens = hocViens;
	}

	@Column
	@Max(value = 10000000, message = "hoc phi khong duoc qua 10 trieu")
	private double hocPhi;

	@Column
	private Date ngayBatDau;

	@Column
	private Date ngayKetThuc;

	@OneToMany(mappedBy = "khoaHoc")
	@JsonIgnoreProperties(value = "khoaHoc")
	Set<HocVien> hocViens;

	@OneToMany(mappedBy = "khoaHoc")
	@JsonIgnoreProperties(value = "khoaHoc")
	Set<NgayHoc> ngayHocs;

}
