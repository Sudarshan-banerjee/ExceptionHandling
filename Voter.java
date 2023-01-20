package Day2.exceptionhandling;

public class Voter {
	public void validateAge(int age) {
		try {
		if(age >= 18) {
			System.out.println("valid age");
		}else {
			throw new AgeInvalidException("Invalid age exception is raised.");
		}
		}catch(AgeInvalidException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public void justFun() {
		System.out.println("It's fun time");
	}
}
