package com.monocept.test;

import com.monocept.model.PigDiceGame;

public class PigDiceGameTest {

	public static void main(String[] args) {
		PigDiceGame pigdicegame=new PigDiceGame();
		System.out.println("*See how many turn it take you to get to 20");
		System.out.println("Trun ends when you hold or roll a 1");
		System.out.println("If you roll a 1, you lose all points for the turn");
		System.out.println("If you hold, you save all the points for the turn");
		pigdicegame.startGame();

	}

}
