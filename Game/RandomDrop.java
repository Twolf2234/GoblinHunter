import java.lang.Math;

public class RandomDrop {

	public static void main(String[] args) {
		int slot = 0;
		for(int i = 0; i < 10; i++) {
			if(inventorySlotEmpty(i)) {
				slot = i;
				break;
			}
		}
		
			
		int drop = (int)(Math.random()*(8-1+1)+1);
		if(drop == 1) {
			modifyInventory(slot, "Rapier");
		}
		else if(drop == 2) {
			modifyInventory(slot, "BroadSword");
		}
		else if(drop == 3) {
			modifyInventory(slot, "LongSword");
		}
		else if(drop == 4) {
			modifyInventory(slot, "Wand");
		}
		else if(drop == 5) {
			modifyInventory(slot, "Staff");
		}
		else if(drop == 6) {
			modifyInventory(slot, "Dagger");
		}
		else if(drop == 7) {
			modifyInventory(slot, "MagicBook");
		}
		else if(drop == 8) {
			modifyInventory(slot, "Buckler");
		}
		
		//insert potions method after seeing syntax, ask about drop rate
	}

}
