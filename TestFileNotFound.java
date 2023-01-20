package Day2.exceptionhandling;

import java.io.FileNotFoundException;

public class TestFileNotFound {
	public static void main(String[] args) throws FileNotFoundException {
		FileNotFound file = new FileNotFound();
		file.open();
	}
	
}
