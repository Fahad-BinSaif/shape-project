

import com.Shape;
import com.two_dim.TwoDimensionalShape;
import com.three_dim.ThreeDimensionalShape;
import com.two_dim.Square;
import com.two_dim.Triangle;
import com.three_dim.Tetrahedron;
import com.three_dim.Sphere;
import com.three_dim.Cube;
import com.two_dim.Circle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Abdullah
 */
public class Main {

    public static boolean sameArea(Shape shape1, Shape shape2) {
        if (shape1 instanceof TwoDimensionalShape && shape2 instanceof TwoDimensionalShape) {
            TwoDimensionalShape twoDShape1 = (TwoDimensionalShape) shape1;
            TwoDimensionalShape twoDShape2 = (TwoDimensionalShape) shape2;
            return twoDShape1.getArea() == twoDShape2.getArea();
        } else if (shape1 instanceof ThreeDimensionalShape && shape2 instanceof ThreeDimensionalShape) {
            ThreeDimensionalShape threeDShape1 = (ThreeDimensionalShape) shape1;
            ThreeDimensionalShape threeDShape2 = (ThreeDimensionalShape) shape2;
            return threeDShape1.getArea() == threeDShape2.getArea();
        }
        return false;
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle("Red", "2023-01-01", "Dotted", 5);
        shapes[1] = new Square("Blue", "2023-02-01", "Solid", 4);
        shapes[2] = new Triangle("Green", "2023-03-01", "Dashed", 6, 3);
        shapes[3] = new Sphere("Yellow", "2023-04-01", "Dotted", 4);
        shapes[4] = new Cube("Purple", "2023-05-01", "Solid", 3);
        shapes[5] = new Tetrahedron("Orange", "2023-06-01", "Dashed", 5);

        for (Shape shape : shapes) {
            System.out.println("=====================================================================");
            System.out.println(shape.getDescription());
            System.out.println("------------------------------");
            if (shape instanceof TwoDimensionalShape) {
                TwoDimensionalShape twoDShape = (TwoDimensionalShape) shape;
                System.out.println("Area: " + twoDShape.getArea());
            } else if (shape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape threeDShape = (ThreeDimensionalShape) shape;
                System.out.println("Area: " + threeDShape.getArea());
                System.out.println("Volume: " + threeDShape.getVolume());
            }
            System.out.println("==============================");
            System.out.println();
        }

        System.out.println("==============================");
        System.out.println("Same area? " + sameArea(shapes[0], shapes[2])); // Compare Circle and Square
        System.out.println("Same area? " + sameArea(shapes[3], shapes[4])); // Compare Sphere and Cube
        System.out.println("Same area? " + sameArea(shapes[1], shapes[5])); // Compare Square and Tetrahedron
        System.out.println("==============================");
    }
}

