package lab.exercise2;

/**
 *
 * @author jlombardo
 */
public abstract class Shape {
    String shapeName;
    
    public abstract void draw();
    
    @Override
    public String toString(){
        return shapeName;
    }
}
