package com.aor.refactoring.example2;

public class Rectangle extends Shape{

    private double width;  // ONLY FOR RECTANGLES
    private double height;


    public Rectangle(double x, double y, double width, double height) {
        super.x = x;
        super.y = y;
        this.width = width;
        this.height = height;
    }



    public double getArea() throws java.lang.Exception {
        return width * height;
    }


    public double getPerimeter() throws Exception {
        return 2 * (width + height);
    }

    public void draw(GraphicFramework graphics) {
        graphics.drawLine(x, y, x + width, y);
        graphics.drawLine(x + width, y, x + width, y + height);
        graphics.drawLine(x + width, y + height, x, y + height);
        graphics.drawLine(x, y + height, x, y);
    }



}