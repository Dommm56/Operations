package ca.csf.dfc.classes.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ca.csf.dfc.classes.Entier;

class EntierTest {

	@Test
	void ENTIER_CONSTRUCTEUR_DEFAULT_CALCUL_POSITIF() {
		//Arrange
		int valeurVoulueEntier =42;
		//Agir
		Entier unEntier = new Entier(42);
		int laValeur = unEntier.calculer();
		//Audier
		assertEquals(valeurVoulueEntier, laValeur);

	}
	@Test
	void ENTIER_CONSTRUCTEUR_DEFAULT_CALCUL_NEGATIF() {
		//Arrange
		int valeurVoulueEntier =-7;
		//Agir
		Entier unEntier = new Entier(-7);
		int laValeur = unEntier.calculer();
		//Audier
		assertEquals(valeurVoulueEntier, laValeur);

	}
	
	@Test
	void ENTIER_CONSTRUCTEUR_DEFAULT_CALCUL_ZERO() {
		//Arrange
		int valeurVoulueEntier =0;
		//Agir
		Entier unEntier = new Entier(0);
		int laValeur = unEntier.calculer();
		//Audier
		assertEquals(valeurVoulueEntier, laValeur);

	}

}
