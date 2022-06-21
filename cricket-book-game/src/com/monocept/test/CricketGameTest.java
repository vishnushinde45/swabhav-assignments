package com.monocept.test;

import java.util.Random;
import java.util.Scanner;

public class CricketGameTest {

	public static void main(String[] args) {
		game();

	}
	
	public static void game() {
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		String playerName1;
		String playerName2;
		int playerScore1=0,playerScore2=0, playerRounds1=0, playerRounds2=0;
		
		boolean play=true;
		System.out.println("************************************************************************************");
		System.out.println("Welcome To Book Cricket Game.");
		System.out.println("************************************************************************************");
		System.out.println("\nPlayer 1 opens the book to read a page number (Randomly generated)");
		System.out.println("Total score of a player = page number % 7 (number % 7 will always be between 0 - 6)");
		System.out.println("Player 1 continues and keeps adding to the score untill page number results in a 0 score");
		System.out.println("Player 2 starts the game and tries to beat the score of player 1");
		System.out.println("In case of a tie, check the number of turns(player with lesser turns is winner)");
		System.out.println("Show the winner of the game.\n");
		
		while(play) {
			System.out.println("Enter 1 to Start Game and 0 for Exit :");
			int ch=sc.nextInt();
			
			
			if(ch==1) {
				System.out.println("Enter Name of Player 1 :");
				playerName1=sc.next();
				System.out.println("Enter Name of Player 2 :");
				playerName2=sc.next();
				
				System.out.println("Player :"+playerName1);
				
				while(true) {
					
					System.out.println("Enter 1 to Open Book");
					int openBookChoice=sc.nextInt();
					int points;
					if(openBookChoice==1) {
						
						int pageNumber=rand.nextInt(300);
						points=pageNumber%7;
						playerScore1+=points;
						playerRounds1++;
						System.out.println("Page Number :"+pageNumber+"\tPoints :"+points+" Score :"+playerScore1);
						if(points==0) {
							break;
						}
				
					}
					
					
					
					
				}
				System.out.println("\n"+playerName1+" Total Score :"+playerScore1+"\n"+playerName1+" Takes "+playerRounds1);
				System.out.println(playerName2+" Needs "+(playerScore1+1)+" Score in "+playerRounds1+" Rounds");
				
				int tempPlayer1Rounds=playerRounds1;
				System.out.println("\nPlayer :"+playerName2);
				while(tempPlayer1Rounds!=0) {
					System.out.println("Enter 1 to Open Book");
					int openBookChoice=sc.nextInt();
					int points;
                    if(openBookChoice==1) {
						
						int pageNumber=rand.nextInt(300);
						points=pageNumber%7;
						playerScore2+=points;
						playerRounds2++;
						System.out.println("Page Number :"+pageNumber+"\tPoints :"+points+"\tScore :"+playerScore2+"\t Rounds Left :"+(tempPlayer1Rounds-1));
						if(playerScore2>playerScore1) {
							System.out.println(playerName2+" is Winner in "+playerRounds2+" Rounds");
							play=false;
							break;
						}
						if(points==0) {
							System.out.println(playerName1+" is a Winner in "+playerRounds1+" Rounds");
							play=false;
							break;
						}
				
					}
                    tempPlayer1Rounds--;
					
				}
				if(tempPlayer1Rounds==0) {
					System.out.println(playerName1+" is a Winner in "+playerRounds1+" Rounds");
					play=false;
					break;
					
				}else if(playerScore1==playerScore2) {
					if(playerRounds1<playerRounds2) {
						System.out.println(playerName1+" is a Winner in "+playerRounds1+" Rounds");
						play=false;
						break;
					}else {
						System.out.println(playerName2+" is a Winner in "+playerRounds2+" Rounds");
						play=false;
						break;
						
					}
				}
				
				
				
			}else {
				break;
			}
			
		}
		
		
	}

}
