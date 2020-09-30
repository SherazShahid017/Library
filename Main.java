
public class Main {

	public static void main(String[] args) {

		Item book1 = new Book("Harry Potter: Philosophers Stone", 1, true, "JK", "Fiction");
		Item book2 = new Book("Harry Potter: Prisoner of Azkaban", 2, false, "JK", "Fiction");
		Item news1 = new Newspaper("The Times", 3, false, true);
		Item mag1 = new Magazine("TheSun", 4, false, "Someone", "Vogue");
		
		Item.addItem(book1);
		Item.addItem(book2);
		Item.addItem(news1);
		Item.addItem(mag1);
		
		System.out.println("========================");
		
		Item.removeItem(2);
		
		Item.checkIn(1);
	}

}
