package main;

import com.b2.mysql.domain.Acteurs;
import com.b2.mysql.tests.TestActeurs;
import com.b2.mysql.domain.Films;
import com.b2.mysql.tests.TestFilms;
import com.b2.mysql.tests.TestJouent;

public class main {

	public static void main(String[] args){
		
		new TestActeurs();
		new TestFilms();		
		new TestJouent();
	}
}