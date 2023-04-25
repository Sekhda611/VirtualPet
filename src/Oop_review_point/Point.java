package Oop_review_point;

public class Point {
    //field
    private double x;
    private double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceTo(Point p2){
        double dx = x - p2.x;
        double dy = y - p2.y;
      // double distance=  Math.pow(dx,2) + Math.pow(dy,2);
        //return distance;
        return Math.pow(dx,2) + Math.pow(dy,2);
    }
    public String toString(){
        return
    }
}
