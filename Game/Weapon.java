//Tobias Mark V Sy

/*Main hand weapon list: Rapier, BroadSword, LongSword (Uses both hands), Wand, Staff(two handed), or Empty
 * 
 * Off hand weapon list: Buckler, dagger, LongSword (Uses both hands maybe defaults to empty), MagicBook, Staff(twohanded defaults to empty), or Empty
 * 
 * Off hand weapons usually add defence and slight damage
 * 
 * I am not sure how the player would pick up the weapon so I just made it that if you call modifyAttacValue() or any of the other ones, it will give the combined damage/health/Mana boost value
 *  and maybe we can make that value the new damage/max health/mana value, still not sure how without the superclass, but yeah.
*/

public class Weapon{
	private String mainHand, offHand;
	
	
	
	public Weapon (String mainHand, String offHand) {
		this.mainHand = mainHand;
		this.offHand = offHand;
		
		
	}
	
	public void setMainHand(String mainHand) {
		this.mainHand = mainHand;
	}
	public void setOffHand(String offHand) {
		this.offHand = offHand;
	}
	
	
	public String getMainHand() {
		return mainHand;
	}
	public String getOffHand() {
		return offHand;
	}
	
	public int modifyAttackValue() {//increases damage depending on both main and off hand weapons
		int main = 0; // Base empty hand damage boost value of weapon
		int off = 0; //Base empty off-hand damage boost value of sidearm
		
		if (mainHand == "Rapier") {
			main = 5;
		}
		if (mainHand == "BroadSword") {
			main = 6;
		}
		if (mainHand == "LongSword") {
			main = 10;
		}
		if (mainHand == "Wand") {
			main = 5;
		}
		if (mainHand == "Staff") {
			main = 10;
		}
		if (mainHand == "Empty") {
			main = 0;
		}
		if (offHand == "dagger") {
			off = 4;
		}
		if (offHand == "magicbook") {
			off = 3;
		}
		if (offHand == "Empty") {
			off = 0;
		}
		return main + off;
	}
	public int modifyDefenceValue() {//increases max health depending on offhand weapon
		int main = 0;
		int off = 0;
		if (mainHand == "LongSword") {
			main = 3;
		}
		if(offHand == "Buckler") {
			off = 10;
		}
		if(offHand == "Dagger") {
			off = 1;
		}
		if (offHand == "MagicBook") {
			off = 7;
		}
		if (offHand == "Empty") {
			off = 0;
		}
		return main + off;
		
	}
	public int modifyMpValue() {//if Character is a mage and has a book or wand equipped
		int main = 0;
		int off = 0;
		if (mainHand == "MagicWand") {
			main = 2;
		}
		if (mainHand == "Staff") {
			main = 10;
		}
		if (offHand == "MagicBook") {
			off = 10;
		}
		if (offHand == "Empty") {
			off = 0;
		}
		return main + off;
	}
	
	
	
	
	
	
}
