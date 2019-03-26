/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examleaving;
import java.util.*;
/**
 *
 * @author adamc
 */
public class Examleaving {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n = 200;
        int d = 0;
        
        int d2 = n;
        
        char[][] arry = new char[n][n];
        
       int row = 0;
       int col = 0;
       
       for(int i = 0; i<arry.length; i++){
           for(int j = 0; j<arry[0].length; j++){
               arry[i][j] =  'X';
           }
       }
       
        for(int i = 0; i<arry.length; i++){
           for(int j = 0; j<arry[0].length; j++){
               System.out.print(arry[i][j]+ " ");
           }
           System.out.println();
       }
       
       boolean full = true;
       boolean break1 = false;
       int count = 0;
       
       
       ArrayList rr = new ArrayList();
       ArrayList cc = new ArrayList();
       
       for(int i = 0; i<n; i++){
        //   rr.add(i);
        //   cc.add(i);
       }
     //  System.out.println(rr);
     //  System.out.println(cc);
       
     int num = n*n;
       while(full){
           d++;
           
         
           
           for(int i = 0; i<arry.length; i++){
               for(int j = 0; j<arry[0].length; j++){
                   if(arry[i][j] == '"'){
                        
                       count++;
               }
                   if(arry[i][j] == 'X'){
                          row = (int)(Math.random()*n);
       
                   col = (int)(Math.random()*n);
                        arry[row][col] = '"';
                        arry[row][col] = '"';
                   }
                  // if(arry[i][j] == 'X'){
                  //     arry[row][col] = '"';
                 //  }
                   
                  
           }
       
           }
          
 
           if(count == num){
               full = false;
           }
           
       count = 0;
       
       
       row = (int)(Math.random()*n);
       
       col = (int)(Math.random()*n);
       
       cc.add(col);
       
       if (cc.contains(col)) {
           col = (int)(Math.random()*n);
           cc.add(col);
          
       }
       
      // arry[row][col] = '"';
       
       
      // if(arry[row][col]!= '"'){
         //  arry[row][col] = '"';
    //   }
       
        
        
    }
       
       System.out.println(d);
       
        for(int i = 0; i<arry.length; i++){
           for(int j = 0; j<arry[0].length; j++){
               System.out.print(arry[i][j]+ " ");
           }
           System.out.println();
       }
    
    }
}
