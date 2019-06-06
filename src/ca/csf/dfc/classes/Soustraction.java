/**
 * 
 */
package ca.csf.dfc.classes;

import ca.csf.dfc.exception.DivisionParZeroException;

/**
 * @author DomLe
 *
 */
public class Soustraction extends OperateurBinaire implements Expression {

	public Soustraction(Expression p_op1, Expression p_op2) {
		super(p_op1, p_op2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculer() throws DivisionParZeroException {
		int valeur1 = this.calculerOperande1();
		int valeur2 = this.calculerOperande2();
		return valeur1 - valeur2;
	}

}
