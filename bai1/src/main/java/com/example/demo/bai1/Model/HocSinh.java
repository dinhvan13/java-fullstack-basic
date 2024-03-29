package com.example.demo.bai1.Model;

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
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "hocsinh")
public class HocSinh {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	@Size(max = 20, message = "ho ten khong duoc qua 20 ky tu")
	private String hoTen;

	@Column
	@Min(value = 2002, message = "nam sinh phai lon hon 2001")
	@Max(value = 2014, message = "nam sinh phai nho hon 2015")
	private int namSinh;

	@Column
	private String queQuan;
    
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="lopID",foreignKey = @ForeignKey(name = "fk_hocsinh_lop"))
	@JsonIgnoreProperties(value = "hocSinh")
	Lop lop;
	
	public Lop getLop() {
		return lop;
	}

	public void setLop(Lop lop) {
		this.lop = lop;
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

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

}
