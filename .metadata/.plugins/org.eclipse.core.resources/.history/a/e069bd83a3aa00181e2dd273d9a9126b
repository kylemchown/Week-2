package library;
import java.util.ArrayList;

public class Library {
	private ArrayList<Item> itemList;
	
	Library(ArrayList<Item> itemList){
		this.itemList = itemList;
	}
	
	
	
	public ArrayList<Item> getItemList() {
		return itemList;
	}



	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}



	public void checkout(Person person, String itemname) {
		for (Item i : itemList) {
			if (i.getName() == itemname) {
				i.setCheckedOut(true);
				i.setCurrentOwner(person.getId());
			}
		}
	}
	
	public void checkin(String itemname) {
		for (Item i : itemList) {
			if (i.getName() == itemname) {
				i.setCheckedOut(false);
				i.setCurrentOwner(0);
			}
		}
	}
	
	public void addItem(Item item) {
		itemList.add(item);
	}
	/*public void removeItem(String name) {
		for (Item i : itemList) {
			if (i.getName() == name) {
				itemList.remove(i);
			}
		}
	}*/
	public void removeItem(String name) {
		for (int i = 0; i<itemList.size(); i++) {
			if (itemList.get(i).getName() == name) {
				itemList.remove(itemList.get(i));
			}
		}
	}
	
}
