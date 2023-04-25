package Oop_review_point;

public class Triangle {
    private Point vertex1;
    private Point vertex2;
    private Point vertex3;
    public Triangle(Point v1, Point v2, Point v3){
        this.vertex1 = v1;
        this.vertex2 = v2;
        this.vertex3 = v3;
    }
    public double getArea(){
       double a =  vertex1.distanceTo(vertex2);
       double b = vertex2.distanceTo(vertex3);
        double c = vertex3.distanceTo(vertex1);
        double s= (a + b +c)/ 2;
        return Math.sqrt( s * (s-a) *(s-b) *(s-c));
    }
    public double getPerimeter(){
        return  vertex1.distanceTo(vertex2) + ;
    }
    public  String  toString(){
        return "Triangle: vertex1 = " + vertex1 + "Triangle vertex2 = " + vertex2 + "vertex3 " + vertex3;
    }

}
