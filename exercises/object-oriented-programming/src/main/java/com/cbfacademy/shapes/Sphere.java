package com.cbfacademy.shapes
 import java.lang.Math;
public class Sphere extends Shape {
    private double radius;
    public sphere(double newRadius) {
        this.radius = newRadius;
        this.shapeName = "sphere";
    }
    public double area() {
        return 4 * Math.PI * (radius * radius);
    }
}