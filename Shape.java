
/**
 * @title   EIE3320 Lab 1: Object-Oriented Programming using Java
 * @author  CHAN Kai Ho 19057769D
 * @author  SZE Kin Sang 19062606D
 * @date    30 Sept 2022
 */

public abstract class Shape implements Drawable {
    protected float area;
    protected float perimeter;

    // To read the shape information from users
    abstract public void readShape();

    // To compute the shape’s area
    abstract public void computeArea();
    
    // To compute the shape’s perimeter
    abstract public void computePerimeter();
    
    // To display the area and perimeter of the shape
    abstract public void displayShape();
}