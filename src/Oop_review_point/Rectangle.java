package Oop_review_point;
//hello

public class Rectangle {
     private Point start;
     private double width;
     private double height;
     public Rectangle(Point newStart, double newWidth, double newHeight){
         this.start = newStart;
         this.width = newWidth;
         this.height = newHeight;
     }
     public double getArea(){
         return height*width;
     }
     public double gerPerimeter(){
         return 2*width + 2*height;
     }
     public String toString
}
