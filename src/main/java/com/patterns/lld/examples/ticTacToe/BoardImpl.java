package com.patterns.lld.examples.ticTacToe;

import java.util.Arrays;
import java.util.HashMap;

import com.patterns.lld.examples.ticTacToe.interfaces.Board;

public class BoardImpl implements Board {

    private char[][] board;
    private int movesCount;
    private int size;
    private HashMap<Integer, String> blockMap;

    public BoardImpl(int size) {
        blockMap = new HashMap<>();
        this.size = size;
        board = new char[size][size];
        initializeBoard();
    }

    @Override
    public void initializeBoard() {
        int key = 1;
        for (int i =0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                blockMap.put(key, i + "," + j);
                board[i][j] = '_';
                key++;
            }
        }
        movesCount = 0;
        System.out.println(Arrays.deepToString(board));
    }

    @Override
    public synchronized void makeMove(int num, char symbol) {
        String cord = blockMap.get(num);
        System.out.println(cord);
        int i = Character.getNumericValue(cord.charAt(0));
        int j = Character.getNumericValue(cord.charAt(2));
        if (num < 0 || num > size*size || board[i][j] != '_') 
        {
            throw new IllegalArgumentException("Invalid move!");
        }
        board[i][j] = symbol;
        movesCount++;
    }

    @Override
    public boolean hasWinner() {
        if (movesCount < size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                System.out.println("winner!");
                return true;
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                System.out.println("winner!");
                return true;
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            System.out.println("winner!");
            return true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            System.out.println("winner!");

                return true;
            }
        return false;
    }
    

    @Override
    public void displayBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    // public static void main(String[] args) {
    //     BoardImpl a = new BoardImpl(3);
    //     a.initializeBoard();
    //     a.makeMove(1, 'X');
    //     a.makeMove(4, 'X');
    //     a.makeMove(2, 'O');
    //     a.makeMove(7, 'X');

    //     a.displayBoard();
    //     a.hasWinner();

    // }

}
