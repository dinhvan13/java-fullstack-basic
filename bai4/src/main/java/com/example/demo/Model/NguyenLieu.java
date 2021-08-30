package com.example.demo.Model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "nguyenlieu")
public class NguyenLieu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	@Size(max = 20, message = "ten nguyen lieu khong duoc qua 20 ky tu")
	private String tenNguyenLieu;

	@Column
	@Min(value = 0, message = "gia ban toi thieu bang 0")
	private int giaBan;
	@Column
	@Size(max = 10, message = "don vi tinh khong duoc qua 10 ky tu")
	private String donViTinh;

	@Column
	@Min(value = 0, message = "so luong kho toi thieu bang 0")
	private int soLuongKho;

	@OneToMany(mappedBy = "nguyenLieu")
	@JsonIgnoreProperties(value = "nguyenLieu")
	Set<ChiTietPhieuThu> chiTietPhieuThus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenNguyenLieu() {
		return tenNguyenLieu;
	}

	public void setTenNguyenLieu(String tenNguyenLieu) {
		this.tenNguyenLieu = tenNguyenLieu;
	}

	public int getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(int giaBan) {
		this.giaBan = giaBan;
	}

	public String getDonViTinh() {
		return donViTinh;
	}

	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}

	public int getSoLuongKho() {
		return soLuongKho;
	}

	public void setSoLuongKho(int soLuongKho) {
		this.soLuongKho = soLuongKho;
	}

	public Set<ChiTietPhieuThu> getChiTietPhieuThus() {
		return chiTietPhieuThus;
	}

	public void setChiTietPhieuThus(Set<ChiTietPhieuThu> chiTietPhieuThus) {
		this.chiTietPhieuThus = chiTietPhieuThus;
	}

	public LoaiNguyenLieu getLoaiNguyenLieu() {
		return loaiNguyenLieu;
	}

	public void setLoaiNguyenLieu(LoaiNguyenLieu loaiNguyenLieu) {
		this.loaiNguyenLieu = loaiNguyenLieu;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "loaiNguyenLieuID", foreignKey = @ForeignKey(name = "fk_nguyenlieu_loainguyenlieu"))
	LoaiNguyenLieu loaiNguyenLieu;

}
