package com.rrif.pattern.uml.class_diagram;


import com.rrif.pattern.uml.intface.Graph;

/**
 * 长方型
 * @author bai
 */
public class Rectangle implements Graph {

    /** 长 */
    private double length;
    /** 宽 */
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }
}
