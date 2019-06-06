/**
 * 
 */
package ca.csf.dfc.classes;

import ca.csf.dfc.exception.DivisionParZeroException;

/**
 * @author DomLe
 *
 */
public class Division extends OperateurBinaire implements Expression{

	public Division(Expression p_op1, Expression p_op2) {
	
		super(p_op1, p_op2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculer() throws DivisionParZeroException {
		int valeur1 = this.calculerOperande1();
		int valeur2 = this.calculerOperande2();
		
		if (valeur2==0) {
			throw new DivisionParZeroException();
		}
		
		return valeur1 / valeur2;
	}

}
