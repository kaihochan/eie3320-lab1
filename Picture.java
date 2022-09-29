
/**
 * @title   EIE3320 Lab 1: Object-Oriented Programming using Java
 * @author  CHAN Kai Ho 19057769D
 * @author  SZE Kin Sang 19062606D
 * @date    30 Sept 2022
 */

import java.util.ArrayList;
public class Picture {
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addShape(Shape s) {
        shapes.add(s);
    }

    public void computeShape() {
        shapes.forEach(shape -> {
            shape.computeArea();
            shape.computePerimeter();
        });
    }

    public void listAllShapeTypes() {
        shapes.forEach(shape -> shape.displayShape());
    }

    public void listSingleShapeType(String className) {
        shapes.forEach(shape -> {
            if (shape.getClass().getName().equals(className))
                shape.displayShape();
        });
    }
}
