
public class Book extends Item{

	// ATTRIBUTES
	String author;
	String Genre;
	
	// CONSTRUCTOR
	public Book (String name, int ID, String author, String Genre) {
		super(name, ID);
		this.author = author;
		this.Genre = Genre;
	}
	
	// METHODS
	
}
