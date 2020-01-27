public class Main {


    public static void main(String[] args) {
        System.out.print("\n");
        int myFavoriteNumber = 13;
        System.out.println(myFavoriteNumber);

        System.out.print("\n");
        String MyString = "test123";
        System.out.println(MyString);

        // MyString = 3.14159; // Double cannot be converted to a String
        System.out.print("\n");
        long myNumber;
        // System.out.println(myNumber); //variable myNumber might not have been initialized
        myNumber = 21;
        System.out.println(myNumber);

        myNumber = 123;
        System.out.println(myNumber); // this can be done as the TYPE is the same and the value fits.

        int x = 5;
        System.out.println(x++); // This says print x then add 1
        System.out.println(x);

        System.out.println("====================");

        int y = 5;
        System.out.println(++y); // This says add 1 then print y
        System.out.println(y);

        System.out.println("====================");

        //String = class; //Main.java:35: error: illegal start of exp


        String theNumberThree = "three";
        Object o = theNumberThree;
        // int three = (int) o;  //Will not run as string cannot be cast to Int
        // int three = (int) "three"; // String cannot be converted to int

        int r = 4;
//        x = x + 5;
        r += 5;
        System.out.println(6);



        int i = 3;
        int w = 4;
        w = w * i;
        System.out.println(w);
    }
};