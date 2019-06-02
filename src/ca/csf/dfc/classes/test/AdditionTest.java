package ca.csf.dfc.classes.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ca.csf.dfc.classes.Addition;
import ca.csf.dfc.classes.Entier;
import ca.csf.dfc.classes.Expression;

class AdditionTest {

	@Test
	void ADDITION_DEUX_POSITIF() {
		Expression valeur1= new Entier(1);
		Expression valeur2=new Entier(1);
		int ValeurVoulue=2;
		
		Addition valeurCalculee = new Addition(valeur1,valeur2);
		int leCalcul = valeurCalculee.calculer();
		
		assertEquals(ValeurVoulue, leCalcul);
	}
	
	@Test
	void ADDITION_DEUX_NEGATIF() {
		Expression valeur1= new Entier(-1);
		Expression valeur2=new Entier(-1);
		int ValeurVoulue=-2;
		
		Addition valeurCalculee = new Addition(valeur1,valeur2);
		int leCalcul = valeurCalculee.calculer();
		
		assertEquals(ValeurVoulue, leCalcul);
	}
	
	@Test
	void ADDITION_1_NEG_1_POSITIF() {
		Expression valeur1= new Entier(-1);
		Expression valeur2=new Entier(1);
		int ValeurVoulue=0;
		
		Addition valeurCalculee = new Addition(valeur1,valeur2);
		int leCalcul = valeurCalculee.calculer();
		
		assertEquals(ValeurVoulue, leCalcul);
	}

}
