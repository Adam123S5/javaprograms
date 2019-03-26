
package goldbackpart2;


public class Goldbackpart2 {


    public static void main(String[] args) {
        
        
        int[] arry = {3, 5, 7, 11, 13, 17, 19, 23, 29,33,37,41,43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};
        
        int x = 0;
        int y = 0;
        int q = 0;
        int num =97;
        
          
        
        //number that adds up to 13
        
        while(arry[x]+arry[y]+arry[q] != num){
            
            if(arry[x] + arry[y] + arry[q] != num){
                q = q + 1;
            }
            if(q == arry.length){
                q = x + 1;
                y = y + 1;
            }
            if(y == arry.length){
                y = x + 1;
                x = x + 1;
            }
            
            
        }
        System.out.println(arry[x] + " " + arry[y] + " " + arry[q]);
        
    }
}
     
     
     
            
           
            
   
