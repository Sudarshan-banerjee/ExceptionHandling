package Day2.exceptionhandling;

public class CartEmptyException extends Exception{
	public CartEmptyException(String message) {
		super(message);
	}
}
