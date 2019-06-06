/**
 * 
 */
package ca.csf.dfc.exception;

/**
 * @author DomLe
 *
 */
public class DivisionParZeroException extends Exception {

	public DivisionParZeroException() {
		super("Division par Zero!");
	}//fin division
	
	public DivisionParZeroException(String p_Message) {
		super("Division par Zero: " + p_Message);
	}
	
	
}//fin DivisionParZero
