
public class Inventory{
	private String[] inventoryList;
	
	public Inventory() {
		inventoryList = new String[10];
		for(int i = 0; i < inventoryList.length; i++) {
			inventoryList[i] = "Empty.";
		}
	}
	
	public void modifyInventory(int slot, String string) {
		inventoryList[slot] = string;
	}
	
	public boolean inventorySlotEmpty(int slot) {
		if(inventoryList[slot] == "Empty."){
			return true;
		}
		else {
			return false;
		}
	}
	
	public void listInventory() {
		System.out.println("Returning inventory!");
		System.out.println("Slot 1: " + inventoryList[0]);
		System.out.println("Slot 2: " + inventoryList[1]);
		System.out.println("Slot 3: " + inventoryList[2]);
		System.out.println("Slot 4: " + inventoryList[3]);
		System.out.println("Slot 5: " + inventoryList[4]);
		System.out.println("Slot 6: " + inventoryList[5]);
		System.out.println("Slot 7: " + inventoryList[6]);
		System.out.println("Slot 8: " + inventoryList[7]);
		System.out.println("Slot 9: " + inventoryList[8]);
		System.out.println("Slot 10: " + inventoryList[9]);
		System.out.println("Current mainhand: " + Weapon.getMainHand());
		System.out.println("Current offhand: " + Weapon.getOffHand());
	}
	
	
}
