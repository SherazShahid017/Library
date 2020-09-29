
public abstract class Item {
	
	// ATTRIBUTES
	String name;
	static int ID;
	
	
	// CONSTRUCTOR
	public Item (String name, int ID) {
		super();
		this.name = name;
		Item.ID = ID;
	}
	
	// METHODS
	public void checkOut() {
		
	}
	
	public void checkIn() {
		
	}
	
	public void addItem() {
		
	}
	
	public void removeItem() {
		
	}
	
	public void updateItem() {
		
	}

	
	// GETTERS SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
}
