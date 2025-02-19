The Tic-Tac-Toe game should be played on a 3x3 grid.
Two players take turns marking their symbols (X or O) on the grid.
The first player to get three of their symbols in a row (horizontally, vertically, or diagonally) wins the game.
If all the cells on the grid are filled and no player has won, the game ends in a draw.
The game should have a user interface to display the grid and allow players to make their moves.
The game should handle player turns and validate moves to ensure they are legal.
The game should detect and announce the winner or a draw at the end of the game.



Thinking structure:


class Main {


    Player p1 = new Player("name");
    Player p2 = new Player("name");

    TicTacToe game = new TicTacToe(size of board, player1, player2);
    
    game.chooseSymbol(p1, "X");


    p1.makeMove("X", pos);
    p2.makeMove("O", pos);
    p1.makeMove("X", pos);
    p2.makeMove("O", pos);
    p1.makeMove("X", pos);
    p2.makeMove("O", pos);
    p1.makeMove("X", pos);
    p2.makeMove("O", pos);
    p1.makeMove("X", pos);
    p2.makeMove("O", pos);
    p1.makeMove("X", pos);
    p2.makeMove("O", pos);





}

3x3 grid

initially player 1 will choose a symbol -> make a move -> 
player 1 -> makes a move -> will choose a symbol -> 
player 2 makes a move