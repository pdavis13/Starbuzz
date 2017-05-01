package lab.exercise2;

/**
 *
 * @author jlombardo
 */
public class Rectangle extends Shape {

    public Rectangle() {
        shapeName = "Rectangle";
    }
    
   @Override
    public void draw() {
        System.out.println("Shape: " + this);
    }
}
