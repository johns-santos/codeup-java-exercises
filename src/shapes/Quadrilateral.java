package shapes;

public abstract class Quadrilateral extends shapes implements Measurable{
//    TODO : protected properties for length and width.
    protected double length;
    protected double width;

    // TODO: a constructor that accepts two numbers for the length and width and sets those properties.
    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

    // TODO: methods for getting the length and width.
    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }


    // TODO: Abstract methods for setting the length and width.
    // void = used as no confirmation is expected for setting a parameter;
    public abstract void setLength(double length);
    public abstract void setWidth(double width);



}
