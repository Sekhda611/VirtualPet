package Oop_review_point;

public class Circle {
    private double radius;
   // private double y;
   // private double x;
    Point center;
    public Circle(Point centr, double radius){
        this.center = center;
        radius =radius;

    }
    public double getCircumference(){
        return  Math.PI * Math.pow(radius, 2);
    }

}
