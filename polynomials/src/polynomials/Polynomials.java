/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polynomials;
import java.util.*;
/**
 *
 * @author adamc
 */
public class Polynomials {

    
    public static void main(String[] args) {
        
        ArrayList poly = new ArrayList();
        poly.add(5); //x3
        poly.add(-3); //x2
        poly.add(6); //x
        poly.add(1); //constant
        
        ArrayList poly2 = new ArrayList();
        //0
        poly2.add(5);
       
        poly2.add(0);
        
        poly2.add(4);
        
        Polynomial p1 = new Polynomial(poly);
        
        Polynomial p2 = new Polynomial(poly2);
        
    //    p1.toString();
      //  p2.toString();
        
        System.out.println(p1.multiply(p2));
        
      //  System.out.println(p1.getDegree()); //GET DEGREE
       // System.out.println(p2.getDegree());
        
      //  System.out.println(p1.evaluate(0)); //EVALUATE USING K
      //  System.out.println(p2.evaluate(0)); //EVALUATE USING K
        
        
      //  System.out.println(p1.add(p2)); //ADD POLYNOMIALS 
        
      //  System.out.println(p1.toString()); //TO STRING POLYNOMIAL
     //   System.out.println(p2.toString()); //TO STRING POLYNOMIAL
        
    }
    
}

class Polynomial{
    
    private ArrayList list = new ArrayList();
    
    public Polynomial(ArrayList l){
        list = l;
        
    }
    
    public int getDegree(){
        
       int degree = 0;
       
       for(int i = 0; i<list.size(); i++){
           if((int)list.get(i) == 0){
               degree = degree - 1;
           }
           else{
               break;
           }
       }
       return(list.size()-degree-1);
    }
    
    public boolean equals(Polynomial p){
        //p2.equals(p);
        //p2 has list valuable
        
        if(list.size() != p.list.size()){
            return(false);
        }
        for(int i = 0; i<list.size(); i++){
            
            int k = (int)list.get(i);
            int c = (int)p.list.get(i);
            if(k != c){
                return(false);
            }
            
            
        }
        return(true);
    }
    
    public String toString(){
        
       String x = "";
       
       for(int i = 0; i<list.size(); i++){
           int b = (int)list.get(i);
           if(b!= 0){
               x = x + Integer.toString(b) + " ";
           }
       }
       return(x);
        
    }
    
    public Polynomial add(Polynomial p){
        //p2.add(p);
        ArrayList temp = new ArrayList();
       
        
        
        
        if(list == p.list){
            for(int i = 0; i<list.size(); i++){
            temp.add((int)p.list.get(i)+(int)list.get(i));
            }
        }
        
        if(p.list.size() < list.size()){
            while(p.list.size() != list.size()){
                p.list.add(0,0);
            }
        }
        
        if(list != p.list){
            for(int i = 0; i<list.size(); i++){
            temp.add((int)p.list.get(i)+(int)list.get(i));
        }
        }
        
        
        
        
        Polynomial newp = new Polynomial(temp);
        return(newp);
    }
    
    public int evaluate(int k){
        double sum = 0;
        int finalsum = 0;
        int deg = list.size()-1;
        
        int cof = 0;
        for(int i = 0; i<list.size(); i++){
            cof = (int)(list.get(i));
            sum = sum +(Math.pow(k, deg)) * cof; 
            deg = deg -1;
            
            
        }
        finalsum = (int)sum;
        return(finalsum);
    }
    
    public Polynomial multiply(Polynomial p){
          ArrayList temp = new ArrayList();
          
          for(int i = 0; i<p.list.size(); i++){
              int k = (int)(p.list.get(i));
              if(k == 0){
                  p.list.remove(i);
                  
              }
          }
    
          System.out.println(p.list);
          
        for(int i = 0; i<list.size(); i++){
            temp.add((int)p.list.get(0)*(int)list.get(i) + (int)p.list.get(1)*(int)list.get(i));
            System.out.println(temp);
        }

        
        Polynomial newp = new Polynomial(temp);
        return(newp);
    }
}
           
                
     