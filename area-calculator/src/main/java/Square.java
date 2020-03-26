public class Square implements AreaShape{
    public double side;

    public Square(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public String draw() {
        return "Square";
    }
}
