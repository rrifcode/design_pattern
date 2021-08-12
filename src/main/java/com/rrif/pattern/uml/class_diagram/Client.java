package com.rrif.pattern.uml.class_diagram;


import com.rrif.pattern.uml.intface.Graph;

public class Client {

    public void calculate(Graph graph){
        System.out.println("周长是：" + graph.getPerimeter());
        System.out.println("面积是：" + graph.getArea());
    }


    public static void main(String[] args) {

        Circular circular = new Circular();
        circular.setRadius(5);

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setWidth(7);

        Client client = new Client();
        client.calculate(circular);
        client.calculate(rectangle);

    }
}
