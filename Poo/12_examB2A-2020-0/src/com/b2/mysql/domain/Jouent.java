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
	private Film resF;
	private Acteur resA;
	private int codef;
	private int codea;

	public Jouent(boolean rempli) {
		if(rempli) {
			try {
				MySqlB2 my=new MySqlB2("localhost", "films", "root", "");
				ResultSet rs=my.requete("films");
				while(rs.next()) {
					
					codef=rs.getInt("codeF");
					resF.getFilm(codef);
					codea=rs.getInt("codeA");
					resA.getActeur(codea);
					String castin=rs.getString("casting");
					
					this.add(new Joue(resF,resA,castin));
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
			if (this.resF.getCode()==codeF & this.resA.getCode()==codeA) {
				return this.get(i);
			}
		}
		return null;
		
		
		
	}
	
	
	
	
}