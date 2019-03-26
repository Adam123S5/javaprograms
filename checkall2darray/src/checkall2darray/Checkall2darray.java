/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkall2darray;

/**
 *
 * @author adamc
 */
public class Checkall2darray {

    public static void main(String[] args) {
       
        
        int[][] arry = new int[5][3];
        
        int[][] arry2 = new int[5][3];
        
        
        int[] list = new int[5];
        int[] list2 = new int[5];
        for(int i = 0; i<list.length; i++){
            list[i] = i;
            list2[i] = i;
        }
        
        list[0] = 9;
        list[4] = 0;
        
        list2[0] = 0;
        list2[4] = 9;
        
        list2[3] = 9;
        
        
        for(int i = 0; i<list.length; i++){
            System.out.print(list[i] + " ");
        }
        
        
        System.out.println();
        for(int i = 0; i<list2.length; i++){
           System.out.print(list2[i] + " ");
        }
        
       
        
        System.out.println();
        int temp = 0;
        int count = 0;
        
        for(int i = 0; i<list.length; i++){
            temp = list[i];
            
            for(int j = 0; j<list.length; j++){
               
                if(temp == list2[j]){
                    
                    count++;
                    break;
                }
            }
        }
        
      
        
        if(count == list.length){
            System.out.println(true);
        }
        else{
         System.out.println(false);
        }
               
        
        
        for(int i = 0; i<arry.length; i++){
            for(int j = 0; j<arry[0].length; j++){
                arry[i][j] = i * 2 + 5;
              //  System.out.print(arry[i][j] + " ");
            }
         //   System.out.println();
        }
        
        for(int ar[] : arry){
            for(int d : ar){
             //   System.out.println(d + " ");
            }
         //   System.out.println();
        }
    }
    
}
