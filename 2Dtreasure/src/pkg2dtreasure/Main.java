
package pkg2dtreasure;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adamc
 */
public class Main {

 
    public static void main(String[] args) {
        

       
       ArrayList<ArrayList<Pair>> map = new ArrayList();
       //three new ArrayLists for each row 
       map.add(new ArrayList<Pair>());
       map.add(new ArrayList<Pair>());
       map.add(new ArrayList<Pair>());
       //coords
        
        
        
      
    }
    
}

class Pair{
    
    private int a,b;
    
    public Pair(int A, int B){
        a = A;
        b = B;
    }
    
    public int getA(){
        return(a);
    }
    
    public int getB(){
        return(b);
    }
    
    public String toString(){
        return(" " + a + ", " + b + "");
    }
    
}
