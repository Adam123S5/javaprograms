
package luckynumbers;
import java.util.ArrayList;

public class Luckynumbers {

    public static void main(String[] args) {
        
        ArrayList siv = new ArrayList();
        int n = 24;
        
        for(int i = 1; i<=n; i++){
            siv.add(i);
        }
       
        System.out.println(siv);
        
      
      
        
        
        int start = 0;
        for(int i = 0; i<siv.size(); i++){
            start = (int)siv.get(1);
            siv.remove(i+1);
            
            
        }
        System.out.println(siv);
        
        int odd = 0;
        int k = 0;
        odd = (int)(siv.get(1));
        
        for(int i = 0; i<siv.size(); i++){
            
            k = siv.indexOf(odd);
           
            if((int)(siv.indexOf(i)) == k+odd){
                
                siv.remove(i);
            }
            
        }
        System.out.println(siv);
    }
}
            
            
    
