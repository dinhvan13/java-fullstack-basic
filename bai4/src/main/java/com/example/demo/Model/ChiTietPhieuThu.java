package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "chitietphieuthu")
public class ChiTietPhieuThu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	@Min(value = 1, message = "nhap so luong phai lon hon 0")
	private int soLuongBan;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "phieuThuID", foreignKey = @ForeignKey(name = "fk_chitietphieuthu_phieuthu"))
	@JsonIgnoreProperties(value = "chiTietPhieuThus")
	PhieuThu phieuThu;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSoLuongBan() {
		return soLuongBan;
	}

	public void setSoLuongBan(int soLuongBan) {
		this.soLuongBan = soLuongBan;
	}

	public PhieuThu getPhieuThu() {
		return phieuThu;
	}

	public void setPhieuThu(PhieuThu phieuThu) {
		this.phieuThu = phieuThu;
	}

	public NguyenLieu getNguyenLieu() {
		return nguyenLieu;
	}

	public void setNguyenLieu(NguyenLieu nguyenLieu) {
		this.nguyenLieu = nguyenLieu;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "nguyenLieuID", foreignKey = @ForeignKey(name = "fk_chitietphieuthu_nguyenlieu"))
	@JsonIgnoreProperties(value = "chiTietPhieuThus")
	NguyenLieu nguyenLieu;

}
