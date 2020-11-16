package adventureGame;

public class charStats {
	String charName = "";
	String charNickName = "";

	int skillAttack = 0;
	int skillStrength = 0;
	int skillDefense = 0;
	double skillHealth = (0 + skillDefense / 10 + skillStrength / 10);
	double currentHealth = 0;

	double maxWeight = (skillStrength * .10 + 50);
	double minDamage = (skillAttack * .2 + skillStrength * .5);
	double maxDamage = (skillAttack * .5 + skillStrength * .8);

	void displayHealth() {
		System.out.println("Your health is " + currentHealth);
	}
	
	void displayStats() {
		System.out.println("Your level in Attack is: " + skillAttack);
		System.out.println("Your level in Strength is: " + skillStrength);
		System.out.println("Your level in Defense is: " + skillDefense);
		System.out.println("Your level in Health is: " + skillHealth);
		System.out.println("You can carry a maxiumum weight of:  " + maxWeight);
		System.out.println("Current health: " + currentHealth);
	}
}
