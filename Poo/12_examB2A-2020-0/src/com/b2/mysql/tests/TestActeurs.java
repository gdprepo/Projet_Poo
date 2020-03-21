package com.b2.mysql.tests; 

import com.b2.mysql.beans.Genre;
import com.b2.mysql.domain.Acteurs;

public class TestActeurs {


	public TestActeurs() {
		Acteurs resA = new Acteurs(true);
		System.out.println(resA.getActeur(1));
		System.out.println(resA.getActeur(11));
	}
}