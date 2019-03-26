
package nthorder;
import java.util.*;

public class Nthorder {


    public static void main(String[] args) {
        
        int n = 5;
        int[] arry = {36,95,9,8,5,24};
        
        int small = 0;
        int smallest = 99;
        
        for(int i = 0; i<arry.length; i++){
            small = arry[i];
            
            if(small<smallest){
                smallest = small;
            }
            
        }
        System.out.println(smallest);
        
        
        
        
    }
    
}
