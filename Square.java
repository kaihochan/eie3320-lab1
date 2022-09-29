
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

    public Square() {
        this.length = 0f;
    }

    public Square(float l) {
        this.length = l;
    }

    public void readShape() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the length:");
        this.length = input.nextFloat();
    }

    public void computeArea() {
        super.area = this.length * this.length;
    }

    public void computePerimeter() {
        super.perimeter = 4.0f * this.length;
    }

    public void displayShape() {
        System.out.printf("Area of square = %f%n", super.area);
        System.out.printf("Perimeter of square = %f%n", super.perimeter);
    }
    
    public void draw() {
        Canvas.getCanvas().draw(this, "red", new java.awt.geom.Rectangle2D.Float(150, 150, this.length, this.length));
    }
}
