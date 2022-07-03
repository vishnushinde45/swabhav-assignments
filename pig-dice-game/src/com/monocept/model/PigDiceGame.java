package com.monocept.model;

import java.util.Random;
import java.util.Scanner;

public class PigDiceGame {

	private int totalScore = 0;
	private static int turns = 0;

	public void startGame() {

		while (true) {
			int tempScore = diceRoll();
			this.totalScore += tempScore;
			System.out.println("-----------------------------------------------------");
			System.out.println("Your Turn Score is :" + tempScore + " and Your Total Score is :" + this.totalScore);
			System.out.println("-----------------------------------------------------");
			if (this.totalScore >= 20)
				break;

		}
		System.out.println("You Win !!You finished in " + this.turns + " turns!\nGame Over");
	}

	private int diceRoll() {
		int tempScore = 0;
		this.turns += 1;
		while (true) {
			System.out.println("\nTurn :" + this.turns);
			Random rand = new Random();
			Scanner sc = new Scanner(System.in);
			int dice = rand.nextInt(6) + 1;
			System.out.println("Roll or Hold (r/h)");
			char choice = sc.next().charAt(0);
			if (choice == 'h' || choice == 'H')
				return tempScore;
			if (choice == 'r' || choice == 'R') {
				System.out.println("Your rolled :" + dice);
				tempScore += dice;
				System.out.println("Your Turn Score is " + tempScore + " and Total Score is " + this.totalScore);
				if (dice == 1)
					return 0;
				if (this.totalScore + tempScore >= 20)
					return tempScore;
			}else {
				System.out.println("Please enter correct choice...");
				continue;
			}

		}

	}

}
