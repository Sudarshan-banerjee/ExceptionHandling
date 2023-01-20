package Day2.exceptionhandling;

public class TestVoter {

	public static void main(String[] args) {
		Voter voter = new Voter();
		voter.validateAge(10);
		System.out.println("Validation done");
		voter.justFun();
	}

}
