package com.gestion_des_don.photo;

public class Photo {
	private int code_photo;
	private String nom_photo;
	
	public Photo() {
	}
	public Photo(int code_photo, String nom_photo) {
		super();
		this.code_photo = code_photo;
		this.nom_photo = nom_photo;
	}
	public int getCode_photo() {
		return code_photo;
	}
	public void setCode_photo(int code_photo) {
		this.code_photo = code_photo;
	}
	public String getNom_photo() {
		return nom_photo;
	}
	public void setNom_photo(String nom_photo) {
		this.nom_photo = nom_photo;
	}
}
