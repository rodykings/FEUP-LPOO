public class Rectangle implements AreaShape{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public String draw() {
        return "Rectangle";
    }
}
