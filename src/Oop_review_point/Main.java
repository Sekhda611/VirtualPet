package Oop_review_point;

import java.sql.SQLOutput;
//1452

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point((3, 4);
        Point p3 = new Point(6, 0);
        Point p4 = new Point(9,4);

        Circle c1 = new Circle(p1,5);
        Rectangle r1 = new Rectangle(p2, 4, 5 );
        Triangle t1 = new Triangle(p1,p3,p4);
        System.out.println("Circle");
        System.out.println(c1);

        System.out.println("Triangle ");
        System.out.println("Area: " + t1.getArea());
        System.out.println("Perimeter " + t1.getPerimeter());
    }
}
