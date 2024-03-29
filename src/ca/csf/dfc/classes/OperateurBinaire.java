/**
 * 
 */
package ca.csf.dfc.classes;

import ca.csf.dfc.exception.DivisionParZeroException;

/**
 * @author DomLe
 *
 */
public abstract class OperateurBinaire implements Expression{
	/*
	 * Variables
	 */
	private Expression m_operande1;
	private Expression m_operande2;
	
	/*
	 * Constructeur
	 */
	public OperateurBinaire(Expression op1, Expression op2) {
		this.m_operande1 = op1;
		this.m_operande2 = op2;
	}
	
	/*
	 * Calculeur de variables (get)
	 */
	protected int calculerOperande1() throws DivisionParZeroException {
		
		return this.m_operande1.calculer();
	}
	
	protected int calculerOperande2() throws DivisionParZeroException {
		
		return this.m_operande2.calculer();
	}
	
	
	
}//fin OperateurBinaire
