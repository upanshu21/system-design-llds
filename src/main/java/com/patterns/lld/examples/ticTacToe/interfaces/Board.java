package com.patterns.lld.examples.ticTacToe.interfaces;

public interface Board {

    void initializeBoard();

    void makeMove(int move, char symbol);

    boolean hasWinner();

    void displayBoard();

}
