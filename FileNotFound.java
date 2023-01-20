package Day2.exceptionhandling;
import java.io.*;
import java.util.*;

public class FileNotFound {
	public void open() throws FileNotFoundException{
		try {
			FileReader f1 = new FileReader("file.txt");
			BufferedReader b1 = new BufferedReader(f1);
		}catch(FileNotFoundException e) {
			e.getStackTrace();
			System.out.println("Sorry the file does not exist.");
			System.out.println(e);
		}finally {
			System.out.println("We will try to open this anyways :)");
		}
		
	}
}
