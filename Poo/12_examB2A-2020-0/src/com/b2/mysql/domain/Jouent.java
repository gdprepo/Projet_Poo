package com.b2.mysql.domain;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.b2.mysql.beans.Joue;
import com.b2.mysql.domain.Films;
import com.b2.mysql.beans.Acteur;
import com.b2.mysql.beans.Film;
import com.b2.mysql.beans.Genre;
import com.b2.mysql.domain.Acteurs;

import com.b2.mysql.connecteurs.MySqlB2;

public class Jouent extends ArrayList<Joue> {
	private Acteurs resA;
	private Films resF;
	
	public Jouent(boolean rempli, Acteurs resA, Films resF) {
		this.resA = resA;
		this.resF = resF;
		if(rempli) {
			try {
				MySqlB2 my=new MySqlB2("localhost", "films", "root", "");
				ResultSet rs=my.requete("joue");
				while(rs.next()) {

					int codeA=rs.getInt("codeA");
					int codeF=rs.getInt("codeF");
					
					String role = rs.getString("casting");
					this.add(new Joue(resF.getFilm(codeF), resA.getActeur(codeA), role));
				}
			} catch(Exception exc) {
				System.err.println("Constructeur Jouent : "+exc.getMessage());
			}
		}
	}
	
	
	public void toSystemout() {
		this.forEach((Joue item)->System.out.println(item.toString()));

	}
	
	public Joue getJoue(int codeF, int codeA) {
		
		for(int i = 0;i<this.size(); i++ ) {
			Joue obj = this.get(i);
			if (obj.getFilm().getCode()==codeF & obj.getActeur().getCode()==codeA) {
				return obj;
			}
		}
		return null;
		
		
		
	}
	
	public boolean hasRole(Acteur acteurA) {
		
		for (int i=0; i<this.size(); i++) {
			Joue joueJ = this.get(i);
			
			if (acteurA.getCode() == joueJ.getActeur().getCode()) {
				return true;
			}
			
		}
		
		
		return false;
	}
	
	public Acteurs Ou() {
		Acteurs resultat = new Acteurs(false);

		for(int i = 0; i<this.resA.size(); i++) {
			Acteur acteurA = this.resA.get(i);
			
			if (!this.hasRole(acteurA)) {
				resultat.add(acteurA);
			}
		}

		return resultat;
	}
	
	
	
	
}