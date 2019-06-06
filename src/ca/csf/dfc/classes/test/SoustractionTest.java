package ca.csf.dfc.classes.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ca.csf.dfc.classes.Addition;
import ca.csf.dfc.classes.Entier;
import ca.csf.dfc.classes.Expression;
import ca.csf.dfc.classes.Soustraction;
import ca.csf.dfc.exception.DivisionParZeroException;

class SoustractionTest {

	@Test
	void ADDITION_DEUX_POSITIF() throws DivisionParZeroException {
		Expression valeur1= new Entier(2);
		Expression valeur2=new Entier(1);
		int ValeurVoulue=1;
		
		Soustraction valeurCalculee = new Soustraction(valeur1,valeur2);
		int leCalcul = valeurCalculee.calculer();
		
		assertEquals(ValeurVoulue, leCalcul);
	}
	
	@Test
	void SOUSTRACTION_DEUX_NEGATIF_0() throws DivisionParZeroException {
		Expression valeur1= new Entier(-1);
		Expression valeur2=new Entier(-1);
		int ValeurVoulue=0;
		
		Soustraction valeurCalculee = new Soustraction(valeur1,valeur2);
		int leCalcul = valeurCalculee.calculer();
		
		assertEquals(ValeurVoulue, leCalcul);
	}
	
	

}
