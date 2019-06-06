package ca.csf.dfc.classes.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ca.csf.dfc.classes.Addition;
import ca.csf.dfc.classes.Division;
import ca.csf.dfc.classes.Entier;
import ca.csf.dfc.classes.Expression;
import ca.csf.dfc.exception.DivisionParZeroException;

class DivisionTest {

	@Test
	void DIVISION_DEUX_POSITIF() throws DivisionParZeroException {
		Expression valeur1= new Entier(1);
		Expression valeur2=new Entier(1);
		int ValeurVoulue=1;
		
		Division valeurCalculee = new Division(valeur1,valeur2);
		int leCalcul = valeurCalculee.calculer();
		
		assertEquals(ValeurVoulue, leCalcul);
	}
	
	void DIVISION_DEUX_NEGATIF() throws DivisionParZeroException {
		Expression valeur1= new Entier(-1);
		Expression valeur2=new Entier(-1);
		int ValeurVoulue=1;
		
		Division valeurCalculee = new Division(valeur1,valeur2);
		int leCalcul = valeurCalculee.calculer();
		
		assertEquals(ValeurVoulue, leCalcul);
	}
	
	void DIVISION_PAR_ZERO_ERREUR() throws DivisionParZeroException {
		Expression valeur1= new Entier(1);
		Expression valeur2=new Entier(0);
		int ValeurVoulue=1;
		
		Division valeurCalculee = new Division(valeur1,valeur2);
		int leCalcul = valeurCalculee.calculer();
		
	}

}
