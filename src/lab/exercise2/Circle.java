package lab.exercise2;

/**
 *
 * @author jlombardo
 */
public class Circle extends Shape {

    public Circle() {
        shapeName = "Circle";
    }
    
   @Override
    public void draw() {
        System.out.println("Shape: " + this);
    }
}
