package com.example.demo.Model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "nguyenlieu")
public class NguyenLieu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	@Size(max = 20, message = "ten nguyen lieu khong duoc qua 20 ky tu!")
	private String tenNguyenLieu;

	@Column
	private String ghiChu;

	@OneToMany(mappedBy = "nguyenLieu")
	@JsonIgnoreProperties(value = "nguyenLieu")
	Set<CongThuc> congThucs;

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

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public Set<CongThuc> getCongThucs() {
		return congThucs;
	}

	public void setCongThucs(Set<CongThuc> congThucs) {
		this.congThucs = congThucs;
	}
}
