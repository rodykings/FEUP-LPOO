package com.aor.refactoring.example2;

public class Circle extends Shape{

    private double radius;

    public Circle(double x, double y, double radius) {
        super.x = x;
        super.y = y;
        this.radius = radius;
    }

    // public Rectangle(com.aor.refactoring.example2.Shape shape)	{		this.shape = shape;	}
    public double getArea() throws java.lang.Exception {
        return Math.PI * Math.pow(radius, 2);
    }


    public double getPerimeter() throws Exception {
        return 2 * Math.PI * radius;
    }

    public void draw(GraphicFramework graphics) {
        graphics.drawCircle(x, y, radius);
    }

}