package com.ccp;

import java.util.Scanner;

public class TicTacToe {
    private char[][] board;
    private char currentPlayer;
    private Scanner scanner;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        scanner = new Scanner(System.in);
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    private void printBoard() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkWin() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }
        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != '-' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return true;
            }
        }
        // Check diagonals
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }
        return false;
    }

    private boolean makeMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != '-') {
            return false;
        }
        board[row][col] = currentPlayer;
        return true;
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    private void playGame() {
        System.out.println("Tic-Tac-Toe Game");
        while (true) {
            printBoard();
            System.out.printf("Player %s's turn. Enter row (0-2) and column (0-2): ", currentPlayer);
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (!makeMove(row, col)) {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            if (checkWin()) {
                printBoard();
                System.out.printf("Player %s wins!%n", currentPlayer);
                break;
            }

            if (isBoardFull()) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }

            switchPlayer();
        }
    }

    private boolean playAgain() {
        System.out.println("Do you want to play again? (y/n):");
        return scanner.next().toLowerCase().equals("y");
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        do {
            game.initializeBoard();
            game.currentPlayer = 'X';
            game.playGame();
        } while (game.playAgain());
        game.scanner.close();
        System.out.println("Thanks for playing!");
    }
}