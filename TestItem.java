package Day2.exceptionhandling;
import java.util.ArrayList;
import java.util.Scanner;

public class TestItem {

	public static void main(String[] args) {
		TestItem.CheckEmptyArrayList();
	}
	public static void CheckEmptyArrayList() {
		ArrayList<Item> list = new ArrayList<Item>();
		Scanner x = new Scanner(System.in);
		System.out.println("How many values?: ");
		int count = x.nextInt();
		for(int i = 0; i<count; i++) {
			Item item = new Item(x.nextInt(), x.next(), x.nextDouble());
			list.add(item);
		}
		x.close();
		
		try {
			if(list.size() > 0) {
				for(Item item: list) {
					System.out.println(item);
				}
			}else {
				throw new CartEmptyException("cart empty exception is raised.");
			}
		}catch(CartEmptyException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}finally {
			System.out.println("All done.");
		}
			
		
	}

}
