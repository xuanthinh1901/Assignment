package com.vti.backend;

import java.time.LocalDate;

public class Person {
	private String ten;
	private String gioitin;
	private LocalDate ngaysinh;
	private String diachi;
	public Person() {

	}
	public Person(String ten, String gioitin, LocalDate ngaysinh, String diachi) {
		super();
		this.ten = ten;
		this.gioitin = gioitin;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getGioitin() {
		return gioitin;
	}
	public void setGioitin(String gioitin) {
		this.gioitin = gioitin;
	}
	public LocalDate getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(LocalDate ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	} 
	

}
