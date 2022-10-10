
/**
 * @title   EIE3320 Lab 1: Object-Oriented Programming using Java
 * @author  CHAN Kai Ho 19057769D
 * @author  SZE Kin Sang 19062606D
 * @date    30 Sept 2022
 */

import java.awt.*;
import java.util.Scanner;
public class Square extends Shape implements Drawable {
    private float length;

    /**
     * Create a Square object.
     * length set to 0.
     */
    public Square() {
        this.length = 0f;
    }

    /** 
     * Create a Square object.
     * length set to be l.
     * @param l length of the Square
     */
    public Square(float l) {
        this.length = l;
    }

    /** 
     * Read the length of the Square from user.
     */
    public void readShape() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the length:");
        this.length = input.nextFloat();
    }

    /** 
     * Compute the area of the Square.
     */
    public void computeArea() {
        super.area = this.length * this.length;
    }

    /** 
     * Compute the perimeter of the Square.
     */
    public void computePerimeter() {
        super.perimeter = 4.0f * this.length;
    }

    /** 
     * Display the area and the perimeter of the Square in the command prompt.
     */
    public void displayShape() {
        System.out.printf("Area of square = %f%n", super.area);
        System.out.printf("Perimeter of square = %f%n", super.perimeter);
    }
    
    /** 
     * Display the Square in the Canvas.
     */
    public void draw() {
        Canvas.getCanvas().draw(this, "red", new java.awt.geom.Rectangle2D.Float(150, 150, this.length, this.length));
    }
}
