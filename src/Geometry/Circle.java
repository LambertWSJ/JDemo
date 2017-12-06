package Geometry;

/**
 * Created by styleine9527 on 2017/12/5.
 */
public class Circle {

    private String title = "Package's name "+this.getClass();

    private double radius = 10;
    public static int call_obj_times = 0;



    public Circle(){
        call_obj_times++;
    }
    public Circle(double radius){
        call_obj_times++;
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
