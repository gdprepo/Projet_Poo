package com.b2.mysql.tests; 

import com.b2.mysql.beans.Genre;
import com.b2.mysql.domain.Films;

public class TestFilms{


	public TestFilms() {
		
		Films resA = new Films(true);
		System.out.println("*******************************");
		System.out.println("Affichage de tous les acteurs :");
		resA.toSystemout();		
		System.out.println("*******************************");
		System.out.println("Affichage d'un acteur de code existant :");
		System.out.println(resA.getFilm(1));
		System.out.println("\n");		
		System.out.println("*******************************");
		System.out.println("Affichage d'un acteur de code inexistant :");
		System.out.println(resA.getFilm(11));
	}
}