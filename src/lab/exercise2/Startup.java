package lab.exercise2;

/**
 *
 * @author jlombardo
 */
public class Startup {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        Shape rectangle = new Rectangle();
        System.out.println("\nRectangle with normal border");
        rectangle.draw();

        // do output for decorated shapes here...
        Shape redCircle = new Circle();
        System.out.println("\nCircle with red border");
        redCircle = new RedShapeDecorator(redCircle);
        redCircle.draw();
        
        Shape redRectangle = new Rectangle();
        System.out.println("\nRectangle with red border");
        redRectangle = new RedShapeDecorator(redRectangle);
        redRectangle.draw();
    }
}
