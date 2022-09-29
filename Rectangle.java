
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

    public Rectangle() {
        this.length = 0f;
        this.width = 0f;
    }

    public Rectangle(float l, float w) {
        this.length = l;
        this.width = w;
    }

    public void readShape() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the length:");
        this.length = input.nextFloat();
        System.out.println("Please input the width:");
        this.width = input.nextFloat();
    }

    public void computeArea() {
        super.area = this.length * this.width;
    }

    public void computePerimeter() {
        super.perimeter = 2.0f * (this.length + this.width);
    }

    public void displayShape() {
        System.out.printf("Area of square = %f%n", super.area);
        System.out.printf("Perimeter of square = %f%n", super.perimeter);
    }
    
    public void draw() {
        Canvas.getCanvas().draw(this, "blue", new java.awt.geom.Rectangle2D.Float(0, 0, this.width, this.length));
    }
}
