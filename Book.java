
public class Book extends Item{

	// ATTRIBUTES
	String author;
	String Genre;
	
	// CONSTRUCTOR
	public Book (String name, int ID, boolean taken, String author, String Genre) {
		super(name, ID, taken);
		this.author = author;
		this.Genre = Genre;
	}
	
	// METHODS
	
}
