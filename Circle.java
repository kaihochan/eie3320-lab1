
/**
 * @title   EIE3320 Lab 1: Object-Oriented Programming using Java
 * @author  CHAN Kai Ho 19057769D
 * @author  SZE Kin Sang 19062606D
 * @date    30 Sept 2022
 */

import java.awt.*;
import java.util.Scanner;
public class Circle extends Shape implements Drawable {
    private float radius;

    /**
     * Create a Circle object.
     * radius set to 0.
     */
    public Circle() {
        this.radius = 0f;
    }

    /** 
     * Create a Circle object.
     * radius set to be r.
     * @param r radius of the Circle
     */
    public Circle(float r) {
        this.radius = r;
    }

    /** 
     * Read the radius of the Circle from user.
     */
    public void readShape() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the radius:");
        this.radius = input.nextFloat();
    }

    /** 
     * Compute the area of the Circle.
     */
    public void computeArea() {
        super.area = (float) (Math.PI * Math.pow(this.radius, 2));
    }

    /** 
     * Compute the perimeter of the Circle.
     */
    public void computePerimeter() {
        super.perimeter = (float) (2 * Math.PI * this.radius);
    }

    /** 
     * Display the area and the perimeter of the Circle in the command prompt.
     */
    public void displayShape() {
        System.out.printf("Area of circle = %f%n", super.area);
        System.out.printf("Perimeter of circle = %f%n", super.perimeter);
    }
    
    /** 
     * Display the Circle in the Canvas.
     */
    public void draw() {
        Canvas.getCanvas().draw(this, "yellow", new java.awt.geom.Ellipse2D.Float(100, 100, this.radius, this.radius));
    }
}
