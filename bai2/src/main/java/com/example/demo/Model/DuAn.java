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

@Table(name = "duan")
@Entity

public class DuAn {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	@Size(max = 10, message = "Ten du an khong duoc qua 10 ky tu")
	private String tenDuAn;

	@Column
	private String moTa;

	@Column
	private String ghiChu;

	@OneToMany(mappedBy = "duAn")
	@JsonIgnoreProperties(value = "duAn")
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

	public String getTenDuAn() {
		return tenDuAn;
	}

	public void setTenDuAn(String tenDuAn) {
		this.tenDuAn = tenDuAn;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
}
