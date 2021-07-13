package com.beans;

public class User {



	private String nom;
	private String email;
	private int age;
	private Voiture voiture;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String nom, String email, int age, Voiture voiture) {
		super();
		this.nom = nom;
		this.email = email;
		this.age = age;
		this.voiture = voiture;
	}

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
