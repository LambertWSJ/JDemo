package Geometry;

/**
 * Created by LambertWSJ on 2017/12/5.
 */

public class SimpleCircle {
    private double radius;


    public SimpleCircle(){
        radius = 1;
    }

    public SimpleCircle(double new_r){
        radius = new_r;
    }

    // Methods

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public double setRadius(double new_radius){
        return radius = new_radius;
    }


}
