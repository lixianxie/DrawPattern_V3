package com.lxie;

public abstract class Shape {

    private void preprocessing() {
        System.out.println("preprocessing...");
    }

    private void postprocessing() {
        System.out.println("postprocessing...");
    }

    abstract void startDrawing();

    public final void draw() {
        preprocessing();
        startDrawing();
        postprocessing();
    }
}
