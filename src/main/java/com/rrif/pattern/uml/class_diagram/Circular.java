package com.rrif.pattern.uml.class_diagram;


import com.rrif.pattern.uml.intface.Graph;

/**
 * 圆形
 * @author bai
 */
public class Circular implements Graph {

    /** 半径 */
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
