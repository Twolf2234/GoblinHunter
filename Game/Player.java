//Zander Bacon
public class Player {
	
	String name;
	String role;
	int maxHP;
	int currentHP = maxHP;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getMaxHP() {
		return maxHP;
	}

	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}

	public int getCurrentHP() {
		return currentHP;
	}

	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}
	
	public Player(String name, String role, int maxHP, int currentHP) {
		this.name = name;
		this.role = role;
		this.maxHP = maxHP;
		this.currentHP = currentHP;
	}
	
	public void attack(Player c) {
		
	}
//	
//	public int useItem() {
//		
//	}
}