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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "ngayhoc")
public class NgayHoc {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	
	@Column
	private String noiDung;
	
	@Column
	private String ghiChu;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "khoaHocID", foreignKey = @ForeignKey(name = "fk_ngayhoc_khoahoc"))
	@JsonIgnoreProperties(value = "ngayHocs")
	KhoaHoc khoaHoc;
}
