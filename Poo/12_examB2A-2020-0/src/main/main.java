package main;

import com.b2.mysql.domain.Acteurs;

public class main {

	public static void main(String[] args){
	System.out.println("Hello World");
	Acteurs resA = new Acteurs(true);
	
	//resA.toSystemout();
	
	System.out.println(resA.getActeur(2));

}
}