/**
 * 
 */
package ca.csf.dfc.classes;

import ca.csf.dfc.exception.DivisionParZeroException;

/**
 * @author DomLe
 *
 */
public class Addition extends OperateurBinaire implements Expression{

	public Addition(Expression p_op1, Expression p_op2) {
		super(p_op1, p_op2);
		
	}

	@Override
	public int calculer() throws DivisionParZeroException {
		int valeur1 = this.calculerOperande1();
		int valeur2 = this.calculerOperande2();
		return valeur1 + valeur2;
	}

}
