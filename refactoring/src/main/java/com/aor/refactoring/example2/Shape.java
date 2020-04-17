package com.aor.refactoring.example2;

public abstract class Shape {

    protected double x;
    protected double y;

    abstract double getArea() throws Exception;

    abstract double getPerimeter()throws Exception;

    abstract void  draw(GraphicFramework graphics);
}
