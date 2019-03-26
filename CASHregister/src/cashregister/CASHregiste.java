
package cashregister;


public class CASHregiste {


    public static void main(String[] args) {
        
        Money five = new Money(5);
        Money ten = new Money(10);
        Money twnety = new Money(20);
        Money hundred = new Money(100);
        
        CashRegister reg1 = new CashRegister();
        
        reg1.addMoney(five);
        
        System.out.println(reg1.getBalance());
        System.out.println(reg1.toString());
        
    }
    
}
class CashRegister{
    
    private int balance;
    private String material = "aluminium";
    
    public CashRegister(int b){
        balance = b;
    }
    
    public CashRegister(){
        balance = 0;
    }
    
    public void addMoney(Money m){  
        balance = balance + m.getValue();
    }
    
    public int getBalance(){
        return(balance);
    }
    public String toString(){
        return("balance=" + balance);
    }
    
    public static boolean isMadeOfMetal(){
        return(false);
    }
    public static void turnIntoPlastic(){
      
    }
}

class Money{
    private int value;
    
    public Money(int v){
        value = v;
    }
    
    public int getValue(){
        return(value);
    }
}
