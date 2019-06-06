/**
 * 
 */
package ca.csf.dfc.classes;

import ca.csf.dfc.exception.DivisionParZeroException;

/**
 * @author DomLe
 *
 */
public interface Expression {
	
	/*
	 * Methode pour calculer une expression, retourne un int.
	 */
	public abstract int calculer() throws DivisionParZeroException;
	
}//fin Expression
