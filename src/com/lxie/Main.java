package com.lxie;

public class Main {

    public static void main(String[] args) {
        Shape s = ShapeFactory.createShape("Circle");
        s.draw();
    }
}
