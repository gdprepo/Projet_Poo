package com.b2.mysql.domain;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.b2.mysql.beans.Acteur;
import com.b2.mysql.beans.Film;
import com.b2.mysql.beans.Genre;
import com.b2.mysql.connecteurs.MySqlB2;

public class Films extends ArrayList<Film> {
	public Films(boolean rempli) {
		if(rempli) {
			try {
				MySqlB2 my=new MySqlB2("localhost", "films", "root", "");
				ResultSet rs=my.requete("films");
				while(rs.next()) {
					int code=rs.getInt("codeFilm");
					String prenom=rs.getString("titreFilm");
					int nom=rs.getInt("anneeFilm");
					this.add(new Film(code,prenom,nom));
				}
			} catch(Exception exc) {
				System.err.println("Constructeur Films : "+exc.getMessage());
			}
		}
	}
	
	
	public void toSystemout() {
		this.forEach((Film item)->System.out.println(item.toString()));

	}
	
	
	public Film getFilm(int nbr) {
		
		for(int i = 0;i<this.size(); i++ ) {
			if (this.get(i).getCode()==nbr) {
				return this.get(i);
			}
		}
		return null;
		
	}

}
