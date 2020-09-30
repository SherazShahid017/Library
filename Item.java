import java.util.ArrayList;
import java.util.List;

public abstract class Item {
	
	// ATTRIBUTES
	String name;
	static int ID;
	static boolean taken;
	private static List<Item> itemList = new ArrayList<>();
	
	
	// CONSTRUCTOR
	public Item (String name, int ID, boolean taken) {
		super();
		this.name = name;
		Item.ID = ID;
		Item.taken = taken;
	}
	
	// METHODS
	public void checkOut(int ID) {
		if (taken /*&& itemList.contains(Item.ID(ID))*/) {
			removeItem(ID);
			System.out.println("Item has been checked out");
		}
		else {
			System.out.println("Item is still in library");
		}
		
	}
	
	public static void checkIn(int ID) {
		if (!taken) {
			System.out.println("Item is still in library");
		}
		else {
			System.out.println("Sorry, this item has been checked out");
		}
	}
	
	
	public static boolean addItem(Item item) {
		
		for (Item i : itemList) {
			System.out.println(i);
		}
		return itemList.add(item);
	}
	
	
	public static List<Item> removeItem(int removeID) {
		
		List<Item> toRemove = new ArrayList<>();
		
		for (Item i : itemList) {
			if (i.getID() == removeID) {
				toRemove.add(i);
			}
		}
		
		itemList.removeAll(toRemove);
		
		for (Item i : itemList) {
			System.out.println("Hello");
		}
		
		return toRemove;
		
		/*
		itemList.removeIf(i -> (i.getID() == (removeID)));
		
		for (Item i : itemList) {
			System.out.println(i);
		} */
		
		
	}
	
	public void updateItem(int ID, Item name) {
		int x = ID + 1;
		itemList.set(x, name);
		
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

	public void setID(int ID) {
		this.ID = ID;
	}
	
}
