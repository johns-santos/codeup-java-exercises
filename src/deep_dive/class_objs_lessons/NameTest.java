import java.awt.*;

public class NameTest {

    public static void main(String[] args)
    {
        // **************************
        // instantiation  -  create instance(s) of Name class
        // **************************
        Name myName = new Name("John", "Anthony", "Santos");
        Name yourName = new Name("Raymond", "Williams");
        Name aName = new Name("Duff");
        Name someName = new Name(); // No parameters are passed


        System.out.println("myName: " + myName.toString());
        System.out.println("yourName: " + yourName.toString());
        System.out.println("A Name: " + aName.toString());


        // USING GETTER and SETTER;
        System.out.println("myName first name: " + myName.getFirst());
        yourName.setLast("Brown");
        System.out.println("yourName: " + yourName.toString());

        someName.setName("John", "Quincy", "Adams");
        System.out.println("someName: " + someName.toString());
    }
}
