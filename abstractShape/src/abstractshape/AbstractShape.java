/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractshape;

/**
 *
 * @author adamc
 */
public class AbstractShape {

    
    public static void main(String[] args) {
       
        Square s = new Square(5.0);
        
        System.out.println(s.toString());
     
    }
    
}


abstract class Shape{
    private String color;
    private boolean filledIn;
    
    
    public Shape(){
        color = "green";
        filledIn = true;
        
        
    }
    
    public Shape(String c, boolean f){
        color = c;
        filledIn = f;
        
    }
   
    public String getColor(){
        return(color);
    }
    public boolean getfilledIn(){
        return(filledIn);
        
    }
    public abstract double getPerimeter();
    
    public abstract double getArea();
 
    
    public String toString(){
        return("a shape with the color off" + color + " and is " + filledIn);
    }
    
}

abstract class Circle extends Shape{
    double radius;
    
    public Circle(){
       // super();
        radius = 1.0;
    }
    
    public Circle(double r){
        super();
        radius = r;
    }
    
    public Circle(String c, boolean filled, double r){
        super(c, filled);
        radius = r;
    }
    
    public String getColor(){
        return(super.getColor());
    }
    
    public abstract void setShape();
    
    public abstract void setPerimeter();
    
}


class Rectangle extends Shape{
    double width;
    double length;
    
    public Rectangle(double w, double l){
        width = w;
        length = l;
    }
    
    public Rectangle(String color, boolean filled, double w, double l){
        super(color, filled);
        width = w;
        length = l;
        
        
    }
    
    public double getArea(){
        return(width*length);
        
    }
    
    public double getWidth(){
        return(width);
    }
    
    public double getPerimeter(){
        return(width+width+length+length);
    }
    
    public String toString(){
        return("A Rectangle with length = " + length + " and width = " + width + "  which is a subclass of a shape with color of " + super.getColor() + " and filledIn = " + super.getfilledIn());
    }
                
                

}

class Square extends Rectangle{
    
    public Square(double s){
        super(s, s);
    }
    
    public String toString(){
        return("A square with side=" + " " + getWidth() + "which is a subclass of" + " " + super.toString() );
    }

}


