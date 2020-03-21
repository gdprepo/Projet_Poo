package main;

import com.b2.mysql.domain.Acteurs;
import com.b2.mysql.tests.TestActeurs;

public class main {

	public static void main(String[] args){
		System.out.println("Hello World");
		Acteurs resA = new Acteurs(true);
		
		resA.toSystemout();
		System.out.println("\n");

		new TestActeurs();
	

	}
}