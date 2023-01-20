package Day2.exceptionhandling;

public class Item {
	private int itemId;
	private String name;
	private double price;
	public Item(int itemId, String name, double price) {
		this.itemId = itemId;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", price=" + price + "]";
	}
}
