/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adjacgame;


public class Adjacgame {


    public static void main(String[] args) {
        
        String[][] board = new String[8][8];
        
         for(int i = 0; i < board.length; i++) {
             for(int j = 0; j < board[0].length; j++) {
		board[i][j] = "|";
             }
         }


        
        board[7][0] = "X";
        board[7][1] = "X";
        
        board[6][0] = "X";
        board[6][1] = "X";
        //---------------
        
        board[0][7] = "O";
        board[0][6] = "O";
        board[1][7] = "O";
        board[1][6] = "O";
        //------------------
      //while(total != 64)  
        for(String [] s : board) {
            for(String k : s){
                System.out.print(k + " "); 
            }
            
            System.out.println(" ");
        }
        
        //takes player 1 input
        int x = 4;
        int y = 3;
        
        //player 1 - O
        board[x][y] = "O";
        board[x-1][y] = "O"; 
        board[x+1][y] = "O";
        board[x][y-1] = "O";
        board [x][y+1] = "O";
        
        //takes player 2 input
       
                
       // board[x][y] = "X";
        if(x-1 >= 0){
        //board[x-1][y] = "X";
        }
        if(x+2 <= 8){
       // board[x+2][y] = "x";
        }
        if (y-1 >= 0){
       // board[x][y-1] = "X";
        }
        
        if (y+1 <= 7){
       // board [x][y+1] = "X";
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        for(String [] s : board) {
            for(String k : s){
                System.out.print(k + " "); 
            }
            
            System.out.println(" ");
        }
        

    }
    
}
