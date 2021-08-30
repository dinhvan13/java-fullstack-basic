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
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "congthuc")
public class CongThuc {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	@Min(value = 1, message = "so luong toi thieu bang 1")
	private int soLuong;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getDonViTinh() {
		return donViTinh;
	}

	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}

	public NguyenLieu getNguyenLieu() {
		return nguyenLieu;
	}

	public void setNguyenLieu(NguyenLieu nguyenLieu) {
		this.nguyenLieu = nguyenLieu;
	}

	public MonAn getMonAn() {
		return monAn;
	}

	public void setMonAn(MonAn monAn) {
		this.monAn = monAn;
	}

	@Column
	@Size(max = 10,message = "don vi tinh khong duoc qua 10 ky tu !")
	private String donViTinh;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "nguyenLieuID", foreignKey = @ForeignKey(name = "fk_congthuc_nguyenlieu"))
	@JsonIgnoreProperties(value = "congThucs")
	NguyenLieu nguyenLieu;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "monAnID", foreignKey = @ForeignKey(name = "fk_congthuc_monan"))
	@JsonIgnoreProperties(value = "congThucs")
	MonAn monAn;

}
