package com.b2.mysql.beans;

public class Acteur {
	private int m_code;
	private String m_prenom;
	private String m_nom;
	private Genre m_sexe;
	private int m_anneeNaissance;
	public Acteur(int code, String prenom, String nom, Genre sexe, int anneeNaissance) {
		m_code = code;
		m_prenom = prenom;
		m_nom = nom;
		m_sexe = sexe;
		m_anneeNaissance = anneeNaissance;
	}
	public String toString() {
		String titre=m_sexe==Genre.Feminin?"Mme":"M.";
		return "["+m_code+"] : "+titre+" "+m_prenom+" "+m_nom+" ("+m_anneeNaissance+")";
	}
	public int getCode() {
		return m_code;
	}
	public String getPrenom() {
		return m_prenom;
	}
	public String getNom() {
		return m_nom;
	}
	public Genre getSexe() {
		return m_sexe;
	}
	public int getAnneeNaissance() {
		return m_anneeNaissance;
	}
	
}
