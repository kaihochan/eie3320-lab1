
/**
 * @title   EIE3320 Lab 1: Object-Oriented Programming using Java
 * @author  CHAN Kai Ho 19057769D
 * @author  SZE Kin Sang 19062606D
 * @date    30 Sept 2022
 */

import java.util.Scanner;
public class ShapeTester {
    public static void main(String args[]) {
        boolean exit = false;
        while (!exit) {
            Scanner input = new Scanner(System.in);
            System.out.println("*****************************************");
            System.out.println("* Please choose one of the followings:  *");
            System.out.println("* Press 'c' - Circle                    *");
            System.out.println("* Press 's' - Square                    *");
            System.out.println("* Press 'r' - Rectangle                 *");
            System.out.println("* Press 'x' - EXIT                      *");
            System.out.println("*****************************************");
            String option = input.nextLine();
            switch(option) {
                case "c":
                    Circle c = new Circle();
                    c.readShape();
                    c.computeArea();
                    c.computePerimeter();
                    c.displayShape();
                    c.draw();
                    break;
                case "s":
                    Square s = new Square();
                    s.readShape();
                    s.computeArea();
                    s.computePerimeter();
                    s.displayShape();
                    s.draw();
                    break;
                case "r":
                    Rectangle r = new Rectangle();
                    r.readShape();
                    r.computeArea();
                    r.computePerimeter();
                    r.displayShape();
                    r.draw();
                    break;
                case "x":
                    exit = true;
                    break;
                default: 
                    System.out.println("Invalid command!");
            }
        }
    }
}
