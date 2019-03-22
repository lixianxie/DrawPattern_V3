package com.lxie;

public class ShapeFactory {

    public static Shape createShape(String type) {
        Shape shape = null;

        if(type.equals("Circle")) {
            shape = new Circle();
        }
        else if(type.equals("Square")) {
            shape = new Square();
        }
        //.....
        return shape;
    }

}
