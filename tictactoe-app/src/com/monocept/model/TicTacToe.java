package com.monocept.model;

import java.util.Scanner;

public class TicTacToe {

	Scanner sc = new Scanner(System.in);
	char player1 = 'X';
	char player2 = 'O';

	public void startGame() {

		char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		printBoard(board);

		while (true) {
			playerTurn(board, player1);
			if (isGameOver(board)) {
				break;
			}
			printBoard(board);

			playerTurn(board, player2);
			if (isGameOver(board)) {
				break;
			}
			printBoard(board);
		}

	}

	private void printBoard(char[][] board) {
		System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		System.out.println("----------");
		System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		System.out.println("----------");
		System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);

	}

	private void playerTurn(char[][] board, char player) {
		String playerInput;
		while (true) {
			System.out.println("Player '" + player + "',enter your move (row[1-3] column[1-3]) :");
			playerInput = sc.nextLine();
			if (isValidMove(board, playerInput)) {
				addMove(board, playerInput, player);
				break;
			} else {
				System.out.println(playerInput + " is not a valid move.");
			}
		}

	}

	private boolean isValidMove(char[][] board, String playerInput) {
		String[] rowsCols=playerInput.split(" ");
		int row=Integer.parseInt(rowsCols[0]);
		int col=Integer.parseInt(rowsCols[1]);
		
		if (board[row-1][col-1] == ' ')
			return true;
		return false;
	}

	private void addMove(char[][] board, String playerInput, char playerSymbol) {
		String[] rowsCols=playerInput.split(" ");
		int row=Integer.parseInt(rowsCols[0]);
		int col=Integer.parseInt(rowsCols[1]);

		board[row-1][col-1] =playerSymbol;
	}

	private boolean isGameOver(char[][] board) {

		if (checkWinner(board, player1)) {
			printBoard(board);
			System.out.println("Player '"+player1+"' won!");
			return true;
		}

		if (checkWinner(board, player2)) {
			printBoard(board);
			System.out.println("Player '"+player2+"' won!");
			return true;
		}

		for (int i = 0;i<board.length; i++) {
			for (int j = 0; j<board[i].length; j++) {
				if (board[i][j] == ' ') {
					return false;
				}
			}
		}
		printBoard(board);
		System.out.println("The game ended in a tie!");
		return true;
	}
	
	private boolean checkWinner(char[][] board, char symbol) {
		if ((board[0][0] == symbol && board [0][1] == symbol && board [0][2] == symbol) ||
			(board[1][0] == symbol && board [1][1] == symbol && board [1][2] == symbol) ||
			(board[2][0] == symbol && board [2][1] == symbol && board [2][2] == symbol) ||
			
			(board[0][0] == symbol && board [1][0] == symbol && board [2][0] == symbol) ||
			(board[0][1] == symbol && board [1][1] == symbol && board [2][1] == symbol) ||
			(board[0][2] == symbol && board [1][2] == symbol && board [2][2] == symbol) ||
			
			(board[0][0] == symbol && board [1][1] == symbol && board [2][2] == symbol) ||
			(board[0][2] == symbol && board [1][1] == symbol && board [2][0] == symbol) ){
			                return true;
		}
		return false;
	}

}
