
package jumpingchampion;
import java.util.*;

public class Jumpingchampion {

   
    public static void main(String[] args) {
        
        
       int[] arry = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397};
       
       ArrayList diffs = new ArrayList();
       
       
       int x = 0;
       int y = 1;
       
       int temp = 0;
       
       for(int i = 0; i<arry.length; i++){
         if(x<arry.length && y<arry.length){
         
             temp = arry[y] - arry[x];
              diffs.add(temp);
         }
        temp = 0;
         y = y + 1;
         x = x + 1;
       }
       System.out.println(diffs);
       
       int count = 0;
       int maxcount = 0;
   
       int highest = 0;
       for(int i = 0; i<diffs.size(); i++){
           temp = (int)diffs.get(i);
           for(int j = 0; j<diffs.size(); j++){
               if(temp == (int)(diffs.get(j))){
                   count = count + 1;
               }
               
           }
           if(count>maxcount){
               maxcount = count;
               highest = temp;
           }
           count = 0;
       }
      
       System.out.println(highest);
       
       
      
    }
    
    
    
}
