package com.b2.mysql.tests; 

import com.b2.mysql.domain.Jouent;
import com.b2.mysql.domain.Acteurs;
import com.b2.mysql.domain.Films;

public class TestJouent{


	public TestJouent() {
		Films  resF = new Films(true);
		Acteurs resA = new Acteurs(true);
 		Jouent resJ = new Jouent(true, resA, resF);
		System.out.println("*******************************");
		System.out.println("Affichage de tous jeux d'acteurs :");
		resJ.toSystemout();		
		System.out.println("*******************************");
		System.out.println("Affichage d'un acteur de code existant :");
		System.out.println(resJ.getJoue(1, 1));
		System.out.println("\n");		
		System.out.println("*******************************");
		System.out.println("Affichage d'un acteur de code inexistant :");
		System.out.println(resJ.getJoue(3, 1));
		System.out.println("*******************************");
		System.out.println("Affichage des acteurs au chômage :");
		resJ.Ou().toSystemout();
		
	}
}