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
@Table(name = "loainguyenlieu")
public class LoaiNguyenLieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    
    @Column
    @Size(max = 20, message = "ten loai khong duoc qua 20 ky tu")
    private String tenLoai;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public Set<NguyenLieu> getNguyenLieus() {
		return nguyenLieus;
	}

	public void setNguyenLieus(Set<NguyenLieu> nguyenLieus) {
		this.nguyenLieus = nguyenLieus;
	}

	@Column
    
    private String moTa;
    
    @OneToMany(mappedBy = "loaiNguyenLieu")
    @JsonIgnoreProperties(value = "loaiNguyenLieu")
    Set<NguyenLieu> nguyenLieus;
    
	
	
}
