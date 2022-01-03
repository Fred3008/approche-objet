
public class noMoneyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public noMoneyException() {
	super("Attention la balance ne peut pas etre négative");	
	}

}
