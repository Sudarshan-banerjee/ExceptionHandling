package Day2.exceptionhandling;

public class MultipleCatchBlocks {
	public static void main(String[] args) {
		try {
			int a = 30/0;
		}catch(ArithmeticException e){
			System.out.println("Arithmetic exception occurs.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bounds.");
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("have a good day :)");
		}
	}
}
