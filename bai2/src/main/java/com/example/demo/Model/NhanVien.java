package com.example.demo.Model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name = "nhanvien")
@Entity
public class NhanVien {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	@Size(max = 20, message = "Ho ten khong duoc qua 20 ky tu")
	private String hoTen;

	@OneToMany(mappedBy = "nhanVien")
	@JsonIgnoreProperties(value = "nhanVien")
	Set<PhanCong> phanCongs;

	public Set<PhanCong> getPhanCongs() {
		return phanCongs;
	}

	public void setPhanCongs(Set<PhanCong> phanCongs) {
		this.phanCongs = phanCongs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(int soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	@Column
	@Min(value = 1970, message = "năm sinh phai lon hon 1969")
	@Max(value = 2000, message = "nam sinh phai nho hon 2001")
	private int namSinh;

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	@Column
	private int soDienThoai;

	@Column
	private String diaChi;

	@Column
	private String email;

	@Column
	private double heSoLuong;
}
