package shapes;

public class Square extends Rectangle {
    private double side;

    // Create a class named square that takes in one parameters named SIDE and constructs a square
    public Square(double side) {
        super(side, side);
        this.side = side;

    }

    public double getArea(){
        System.out.println("SQUARE AREA");
        return this.side*this.side;
    }

    public double getPerimeter(){
        System.out.println("SQUARE PERIMETER");
        return 4 * this.side;
    }

}
