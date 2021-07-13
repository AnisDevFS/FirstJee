package com.beans;

public class Voiture {

	private String marque;
	private String couleur;

	public Voiture(String marque, String couleur) {
		super();
		this.marque = marque;
		this.couleur = couleur;
	}

	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

}
