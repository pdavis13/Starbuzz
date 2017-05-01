/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.exercise2;

/**
 *
 * @author pdavis13
 */
public class RedShapeDecorator extends ShapeDecorator {
    private Shape shapeToBeDecorated;
    
    public RedShapeDecorator(Shape shapeToBeDecorated) {
        super(shapeToBeDecorated);
    }
    
    @Override
    public void draw(){
        super.draw();
        System.out.println("Border Color: Red");
    }
}
