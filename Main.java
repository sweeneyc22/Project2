package adventureGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean charIsAlive = true;

		// Create users character
		charStats currentPlayer = new charStats();

		System.out.println("Welcome adventurer, what is your name?");
		currentPlayer.charName = input.nextLine();
		System.out.println("I pity you " + currentPlayer.charName + ". What is your expertise? ");
		System.out.println("1: Attack\n" + "2: Strength\n" + "3: Defense");
		int choice = input.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Attack chosen");
			currentPlayer.skillAttack = currentPlayer.skillAttack + 6;
			currentPlayer.skillStrength = currentPlayer.skillStrength + 3;
			currentPlayer.skillDefense = currentPlayer.skillDefense + 3;
			currentPlayer.skillHealth = currentPlayer.skillHealth + 50;
			currentPlayer.currentHealth = currentPlayer.skillHealth;
			currentPlayer.displayStats();
			break;
		case 2:
			System.out.println("Strength chosen");
			currentPlayer.skillAttack = currentPlayer.skillAttack + 3;
			currentPlayer.skillStrength = currentPlayer.skillStrength + 6;
			currentPlayer.skillDefense = currentPlayer.skillDefense + 3;
			currentPlayer.skillHealth = currentPlayer.skillHealth + 75;
			currentPlayer.currentHealth = currentPlayer.skillHealth;
			currentPlayer.displayStats();
			break;
		case 3:
			System.out.println("Defense chosen");
			currentPlayer.skillAttack = currentPlayer.skillAttack + 3;
			currentPlayer.skillStrength = currentPlayer.skillStrength + 3;
			currentPlayer.skillDefense = currentPlayer.skillDefense + 6;
			currentPlayer.skillHealth = currentPlayer.skillHealth + 100;
			currentPlayer.currentHealth = currentPlayer.skillHealth;
			currentPlayer.displayStats();
			break;
		}

		while (charIsAlive = true) {
			System.out.println("What would you like to do? \n1: Train\n2: Rest\n3:Explore\n4: View shop");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("What skill would you like to train? \n 1: Attack \n 2:Strength \n 3:Defense");
				int skillChoice = input.nextInt();
				switch (skillChoice) {
				case 1:
					System.out.println("You train your Attack");
					currentPlayer.skillAttack = currentPlayer.skillAttack + (int) (Math.random() + 2);
					currentPlayer.displayStats();
					break;
				case 2:
					System.out.println("You train your Strength");
					currentPlayer.skillStrength = currentPlayer.skillStrength + (int) (Math.random() + 2);
					currentPlayer.displayStats();
					break;
				case 3:
					System.out.println("You train your attack");
					currentPlayer.skillDefense = currentPlayer.skillDefense + (int) (Math.random() + 2);
					currentPlayer.displayStats();
					break;
				}
			case 2:

				if (currentPlayer.currentHealth < currentPlayer.skillHealth) {
					System.out.println("-You get some rest, repleneshing some health.-");
					currentPlayer.currentHealth = currentPlayer.currentHealth + (currentPlayer.skillHealth * .5);
					currentPlayer.displayHealth();
				} else {
					System.out.println("You are fully rested.");
				}
			}
		}
	}

}
