
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

    public Circle() {
        this.radius = 0f;
    }

    public Circle(float r) {
        this.radius = r;
    }

    public void readShape() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the radius:");
        this.radius = input.nextFloat();
    }

    public void computeArea() {
        super.area = (float) (Math.PI * Math.pow(this.radius, 2));
    }

    public void computePerimeter() {
        super.perimeter = (float) (2 * Math.PI * this.radius);
    }

    public void displayShape() {
        System.out.printf("Area of circle = %f%n", super.area);
        System.out.printf("Perimeter of circle = %f%n", super.perimeter);
    }
    
    public void draw() {
        Canvas.getCanvas().draw(this, "yellow", new java.awt.geom.Ellipse2D.Float(100, 100, this.radius, this.radius));
    }
}
