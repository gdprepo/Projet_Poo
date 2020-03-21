package com.b2.mysql.domain;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.b2.mysql.beans.Acteur;
import com.b2.mysql.beans.Genre;
import com.b2.mysql.connecteurs.MySqlB2;

public class Acteurs extends ArrayList<Acteur> {
	public Acteurs(boolean rempli) {
		if(rempli) {
			try {
				MySqlB2 my=new MySqlB2("localhost", "films", "root", "");
				ResultSet rs=my.requete("acteurs");
				while(rs.next()) {
					int code=rs.getInt("codeActeur");
					String prenom=rs.getString("prenomActeur");
					String nom=rs.getString("nomActeur");
					Genre sexe=rs.getInt("sexeActeur")==1?Genre.Feminin:Genre.Masculin;
					int annee=rs.getInt("anneeNaissanceActeur");
					this.add(new Acteur(code,prenom,nom,sexe,annee));
				}
			} catch(Exception exc) {
				System.err.println("Constructeur Acteurs : "+exc.getMessage());
			}
		}
	}

	
	public void toSystemout() {
		this.forEach((Acteur item)->item.toString());

	}
	
	public Acteur getActeur(int code) {
		this.forEach(Acteur item)->{
			if (item.codeActeur==code)
					return item;
		});
	}
	
}
