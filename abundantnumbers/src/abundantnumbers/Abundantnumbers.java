
package abundantnumbers;


public class Abundantnumbers {

    
    public static void main(String[] args) {
       
        
        int n = 1;
        int num_a = 0;
        int count = 1000;
        while(n<count){
        
        
        boolean abundant = false;
        
        int sum = 0;
        for(int i = 1; i<=n; i++){
            if(n%i == 0){
                sum = sum + i;
            }
        }
        
      
        if(sum>n*2){
            abundant = true;
            num_a++;
        }
        
        //System.out.println(abundant);

        n = n + 1;
        }
        double d = 0.0;
        
        System.out.println(num_a + " "  + count);
        d = num_a/count;
        System.out.println(d);
    }
    
}
