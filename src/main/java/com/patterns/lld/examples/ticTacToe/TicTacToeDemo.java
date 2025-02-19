package com.patterns.lld.examples.ticTacToe;
import java.util.Scanner;


public class TicTacToeDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the board: ");
        int size = scanner.nextInt();
        System.out.println("Enter the name of player 1: ");
        String player1Name = scanner.next();
        System.out.println("Enter the symbol of player 1: ");
        char player1Symbol = scanner.next().charAt(0);
        System.out.println("Enter the name of player 2: ");
        String player2Name = scanner.next();
        System.out.println("Enter the symbol of player 2: ");
        char player2Symbol = scanner.next().charAt(0);

        Player player1 = new Player(player1Name, player1Symbol);
        Player player2 = new Player(player2Name, player2Symbol);

        TicTacToe ticTacToe = new TicTacToe(size, player1, player2);
        ticTacToe.play();
    }
    
}
