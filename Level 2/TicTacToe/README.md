Tic-Tac-Toe Game Project
Description
This Java program implements a two-player console-based Tic-Tac-Toe game. Players take turns placing 'X' or 'O' on a 3x3 board by entering row and column numbers. The program validates moves, checks for a win or draw after each move, and displays the result. Players can choose to play multiple rounds. The game uses a simple text-based interface.
How to Run

Ensure you have Java installed (JDK 8 or later).
Place TicTacToe.java in the src directory.
Compile the program:javac src/TicTacToe.java -d bin


Run the program:java -cp bin TicTacToe



Example Usage
Tic-Tac-Toe Game
  0 1 2
0 - - -
1 - - -
2 - - -
Player X's turn. Enter row (0-2) and column (0-2): 
0 0
  0 1 2
0 X - -
1 - - -
2 - - -
Player O's turn. Enter row (0-2) and column (0-2): 
1 1
  0 1 2
0 X - -
1 - O -
2 - - -
[...]
Player X wins!
Do you want to play again? (y/n):
n
Thanks for playing!

Skills Demonstrated

Arrays for representing the 3x3 game board
Loops for game flow and board iteration
Conditional statements for move validation and win/draw checks
Input/output operations using Scanner
Modular programming with methods for game logic

Notes

The board is displayed with row and column indices (0-2) for easy input.
Invalid moves (e.g., occupied cells or out-of-bounds) prompt the player to try again.
The game checks for wins in rows, columns, and diagonals, and detects draws when the board is full.
Players can replay by entering 'y' after a game ends.

