package Day2.exceptionhandling;

public class Division {
	public void division(int num1, int num2) {
		try {
		int div = num1/num2;
		System.out.println("Division = "+ div);
		System.out.println("Division Done");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Sorry, Can't divide by zero.");
		}finally {
			System.out.println("it's finally");
		}
	}
	public void justFun() throws InterruptedException, ClassNotFoundException{
		
		Class.forName("");
		System.out.println("Enjoying the break!");
		Thread.sleep(1000);
		
	}
}
