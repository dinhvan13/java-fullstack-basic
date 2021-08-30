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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "phieuthu")
public class PhieuThu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private Date ngayLap;

	@Column
	private String nhanVienLap;

	@Column
	private String ghiChu;

	@Column
	private int thanhTien;

	@OneToMany(mappedBy = "phieuThu")
	@JsonIgnoreProperties(value = "phieuThu")
	Set<ChiTietPhieuThu> chiTietPhieuThus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}

	public String getNhanVienLap() {
		return nhanVienLap;
	}

	public void setNhanVienLap(String nhanVienLap) {
		this.nhanVienLap = nhanVienLap;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public int getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(int thanhTien) {
		this.thanhTien = thanhTien;
	}

	public Set<ChiTietPhieuThu> getChiTietPhieuThus() {
		return chiTietPhieuThus;
	}

	public void setChiTietPhieuThus(Set<ChiTietPhieuThu> chiTietPhieuThus) {
		this.chiTietPhieuThus = chiTietPhieuThus;
	}

}
