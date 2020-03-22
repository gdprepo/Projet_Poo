package com.b2.mysql.tests; 

import com.b2.mysql.beans.Genre;
import com.b2.mysql.domain.Acteurs;

public class TestActeurs {


	public TestActeurs() {
		
		Acteurs resA = new Acteurs(true);
		System.out.println("*******************************");
		System.out.println("Affichage de tous les acteurs :");
		resA.toSystemout();		
		System.out.println("*******************************");
		System.out.println("Affichage d'un acteur de code existant :");
		System.out.println(resA.getActeur(1));
		System.out.println("\n");		
		System.out.println("*******************************");
		System.out.println("Affichage d'un acteur de code inexistant :");
		System.out.println(resA.getActeur(11));
	}
}