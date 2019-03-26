
package frugalnumbers;
import java.util.ArrayList;

public class Frugalnumbers {


    public static void main(String[] args) {
        
        int n = 1029;
        int num = 0;
        boolean prime = false;
        
        int temp = 0;
      
        
        ArrayList primes = new ArrayList();
        ArrayList digits = new ArrayList();
        
       
        
        for(int i = 1; i<=n; i++){
            num = i; //3
            if(n%num == 0){
                if(num == 2){
                    primes.add(num);
                }
                for(int j = 2; j<num; j++){
                    if(num%j != 0){
                        prime = true;
                    }
                    else{
                        prime = false;
                        break;
                    }
                }
                if(prime == true){
                    primes.add(num);
                }
            }
            
        }
        System.out.println(primes);

        while(n!=0){
            temp = n%10;
            if(!(digits.contains(temp))){
                digits.add(temp);
                
            }
            n = n/10;
        }
        System.out.println(digits);

    }
    
}
