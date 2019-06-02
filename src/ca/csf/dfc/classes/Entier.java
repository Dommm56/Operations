/**
 * 
 */
package ca.csf.dfc.classes;

/**
 * @author DomLe
 *
 */
public class Entier implements Expression {
	/*
	 * Variables
	 */
	private int m_valeur;
	
	
	/*
	 * Constructeur par initialisation
	 */
	public Entier(int p_valeur) {
		this.m_valeur = p_valeur;	
	}//end Entier
	
	/*
	 * Redefinitition de calculer()
	 */
	@Override
	public int calculer() {	
		return this.m_valeur;
	}//fin calculer()
	
	
	
	
}//Fin Entier
