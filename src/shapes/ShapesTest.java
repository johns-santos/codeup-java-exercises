package shapes;

public class ShapesTest {
    public static void main(String[] args) {


        Rectangle box1 = new Rectangle(5, 4);
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());



        // Quadrilateral myShape; - This can be used to access getLength method.
        Measurable myShape; // this variable declares "myShape" as a "Measurable" type.

        myShape = new Square(4);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        // myShape.getLength();


        myShape = new Rectangle(10, 2);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

    }

}
