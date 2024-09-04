//Tobias Sy
import java.util.*;
public class Main {

	
	public static void main(String[] args) {
		String name;
		String role = "";
		int maxHP = 0;
		int currentHP = 0;
		int valid = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Please type your name");
		name = s.nextLine();
		while (valid == 0) {// The problem I am facing right now
			System.out.println("Please type your role in the console");
			role = s.nextLine();
			if (role == "Fighter") {
				maxHP = 200; 
				currentHP = maxHP;
				valid += 1;
			}
			if (role == "Mage") {
				maxHP = 150;
				currentHP = maxHP;
				valid += 1;
			}
			else {
				System.out.println(role + " is not a proper role fool! Write your role properly this time!");
				System.out.println("");
			}
			
		}
		Player adventurer = new Player(name, role, maxHP, currentHP);
		adventurer.name = name;
		adventurer.role = role;
		adventurer.maxHP = maxHP;
		adventurer.currentHP = currentHP;
		System.out.println("Welcome adventurer! So your name is " + adventurer.name + "? Nice to meet you!");
		System.out.println("You seem to be a " + adventurer.role + " good! We needed more of you in this guild.");
	}
	
}
