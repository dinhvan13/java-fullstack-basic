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
@Table(name = "monan")
public class MonAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    
    @Column
    @Size(max = 20,message = "ten loia khong duoc qua 20 ky tu!")
    private String tenMon;
    
    @Column
    @Min(value = 0,message = "gia ban phai lon hon 0")
    private int giaBan;
    
    @Column
    private String gioiThieu;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenMon() {
		return tenMon;
	}

	public void setTenMon(String tenMon) {
		this.tenMon = tenMon;
	}

	public int getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(int giaBan) {
		this.giaBan = giaBan;
	}

	public String getGioiThieu() {
		return gioiThieu;
	}

	public void setGioiThieu(String gioiThieu) {
		this.gioiThieu = gioiThieu;
	}

	public String getCachLam() {
		return cachLam;
	}

	public void setCachLam(String cachLam) {
		this.cachLam = cachLam;
	}

	public LoaiMonAn getLoaiMonAn() {
		return loaiMonAn;
	}

	public void setLoaiMonAn(LoaiMonAn loaiMonAn) {
		this.loaiMonAn = loaiMonAn;
	}

	public Set<CongThuc> getCongThucs() {
		return congThucs;
	}

	public void setCongThucs(Set<CongThuc> congThucs) {
		this.congThucs = congThucs;
	}

	@Column
    private String cachLam;
    
    
    @ManyToOne(fetch = FetchType.EAGER )
    @JoinColumn(name = "loaiMonAnID", foreignKey = @ForeignKey(name = "fk_monan_loaimonan"))
    @JsonIgnoreProperties(value = "monAn")
    LoaiMonAn loaiMonAn;
    
    @OneToMany(mappedBy = "monAn")
    @JsonIgnoreProperties(value = "monAn")
     Set<CongThuc> congThucs;
  
  
}
