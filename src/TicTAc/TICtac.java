package TicTAc;

import java.util.Scanner;

public class TICtac {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
        char player = 'X';
        boolean gameover  = false;
        Scanner sc  = new Scanner(System.in);
        while (!gameover){
            printBoard(board);
            System.out.println("Player "+ player+" enter: ");
            int row = sc.nextInt();
            int col =  sc.nextInt();
            System.out.println();

            if (board[row][col]==' '){
                board[row][col] = player;//placing the element
                gameover = haveWon(board,player);
                if (gameover){
                    System.out.println("Player "+ player + " has won: ");
                }else {
                    if (player == 'X'){
                        player = 'O';
                    }else {
                        player = 'X';
                    }
                }

            }else {
                System.out.println("Invalid move, Try Again !!");
            }
        }
        printBoard(board);
    }
    public static boolean haveWon(char[][] board, char player){
        for (int row = 0; row < board.length; row++) {
            if ( board[row][0] == player && board[row][1] == player && board[row][2] == player){
                return true;
            }
        }
        //checking for col
        for (int col = 0; col < board.length; col++) {
            if (board[0][col]==player && board[1][col]==player && board[2][col]==player){
                return true;
            }
        }
        //checking the diagonals
        if (board[0][0]==player && board[1][1]==player && board[2][2]==player){
            return true;
        }
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }
        return false;
    }
    static void printBoard(char[][] board){
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length ; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }

    }
}
