
/**
 * @title   EIE3320 Lab 1: Object-Oriented Programming using Java
 * @author  CHAN Kai Ho 19057769D
 * @author  SZE Kin Sang 19062606D
 * @date    30 Sept 2022
 */

import java.awt.*;
import java.util.Scanner;
public class Rectangle extends Shape implements Drawable {
    private float length;
    private float width;

    /**
     * Create a Rectangle object.
     * Both length and width set to 0.
     */
    public Rectangle() {
        this.length = 0f;
        this.width = 0f;
    }

    /** 
     * Create a Rectangle object.
     * length and width set to l and w respectively.
     * @param l length of the Rectangle
     * @param w width of the Rectangle
     */
    public Rectangle(float l, float w) {
        this.length = l;
        this.width = w;
    }

    /** 
     * Read the length and width of the Rectangle from user.
     */
    public void readShape() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the length:");
        this.length = input.nextFloat();
        System.out.println("Please input the width:");
        this.width = input.nextFloat();
    }

    /** 
     * Compute the area of the Rectangle.
     */
    public void computeArea() {
        super.area = this.length * this.width;
    }

    /** 
     * Compute the perimeter of the Rectangle.
     */
    public void computePerimeter() {
        super.perimeter = 2.0f * (this.length + this.width);
    }

    /** 
     * Display the area and the perimeter of the Rectangle in the command prompt.
     */
    public void displayShape() {
        System.out.printf("Area of rectangle = %f%n", super.area);
        System.out.printf("Perimeter of rectangle = %f%n", super.perimeter);
    }
    
    /** 
     * Display the Rectangle in the Canvas.
     */
    public void draw() {
        Canvas.getCanvas().draw(this, "blue", new java.awt.geom.Rectangle2D.Float(0, 0, this.width, this.length));
    }
}
