package Day2.exceptionhandling;
import java.io.*;


public class NestedTry {
	public static void main(String[] args) {
		try {
			
			try {
				FileReader f1 = new FileReader("file.txt");
			}catch(FileNotFoundException e2) {
				System.out.println("file not found Exception is raised.");
			}
			int a[] = {1,2,3,4,5};
			System.out.println(a[5]);
		}catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("Array index is out of bounds");
		}finally {
			System.out.println("have a good day :)");
		}
	}
}
