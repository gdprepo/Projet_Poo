package com.b2.mysql.beans;

public class Film {
	private int m_code;
	private String m_titre;
	private int m_annee;

	public Film(int code, String nom, int annee) {
		m_code = code;
		m_titre = nom;
		m_annee = annee;

	}
	
	public int getCode() {
		return m_code;
	}
	
	public String getTitre() {
		return m_titre;
	}
	
	public int getAnnee() {
		return m_annee;
	}

	public String toString() {
		String titre=m_titre;
		return "["+m_code+"]"+" "+m_titre+" "+""+m_annee+"";
	}
	
}