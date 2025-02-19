package com.patterns.lld.examples.ticTacToe;

import com.patterns.lld.examples.ticTacToe.interfaces.Board;
import com.patterns.lld.examples.ticTacToe.interfaces.Play;
import java.util.Scanner;

public class TicTacToe implements Play {
    
    private final Player player1;
    private final Player player2;
    private Player currentPlayer;
    private final Board board;
    private final Scanner scanner;

    public TicTacToe(int size, Player player1, Player player2) {
        this.board = new BoardImpl(size);
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
        this.scanner = new Scanner(System.in);
    }

    

    @Override
    public void play() {
        board.initializeBoard();
        board.displayBoard();

        while (!board.hasWinner()) {

            System.out.println(currentPlayer.getName() + "'s turn.");
            System.out.println("Enter the block number: ");

            int move = scanner.nextInt();
            board.makeMove(move, currentPlayer.getSymbol());
            board.displayBoard();
            board.hasWinner();
            currentPlayer = currentPlayer == player1 ? player2 : player1;
            
        }
    }

}
