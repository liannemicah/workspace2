package TutorialPackage;

public class tut4 {//TicTacToe

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] grid = new String[3];//single dimension array
		grid[0] = "-";
		grid[1] = "-";
		grid[2] = "-";
		
		String[][] board = new String[3][3];//create 2D array
		board[0][0] = "-";
		board[0][1] = "-";
		board[0][2] = "-";

		for(int i = 0; i < grid.length; i++) {
			System.out.println(grid[i]);
		}
		
		//fill and print 2D array
		System.out.println("fill and 2D array");
		for(int row = 0; row < board.length; row++) {
			//prints each column
			for(int col = 0; col < board[row].length; col++) {
				board[row][col] = " - ";
				System.out.println(board[row][col]);
			}
			
			System.out.println();//prints a new line after the row

		}//end for loop to print rows
		
		board[1][1] = " X ";
		
		for(int row = 0; row < board.length; row++) {
			//prints each column
			for(int col = 0; col < board[row].length; col++) {
//			board[row][col] = "-";
				System.out.print(board[row][col]);
			}
	
			System.out.println();

		}//end for

	}//end main
	
//int player = 1;
//take input player
//player = 2;

}//end class
