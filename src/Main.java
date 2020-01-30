import java.util.Scanner;
import java.util.*;

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
        myNumber = 21L; // capital L creates a long.
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

        System.out.println("====================");
        System.out.println("====================");

        String theNumberThree = "three";
        Object o = theNumberThree;
        // int three = (int) o;  //Will not run as string cannot be cast to Int
        // int three = (int) "three"; // String cannot be converted to int
        System.out.println("====================");

        String theNumberFive = "Five";
        Object s = theNumberFive;
        System.out.println(s);

        String six = (String) "theNumberFive";
        System.out.println(six);
        System.out.println("====================");

        System.out.println("====================");

        int r = 4;
//        r = r + 5;
        r += 5;
        System.out.println(r);


        int i = 3;
        int w = 4;
//        w = w * i;
        w *= i;
        System.out.println(w);

        int q = 10;
        int z = 2;
        q = q / z; //  q = 10 /2
        System.out.println(q);
        z = z - q;  // z = 2 - 5
        System.out.println(z);


        // (1) ******************************************
        double pi = 3.14159;
        System.out.println("The value of pi is approx " + pi + ".\n");

        {

            Scanner input = new Scanner(System.in);

            // (2) ******************************************
            System.out.print("Enter an integer: ");
            int number = input.nextInt();
            System.out.println("You entered " + number + "\n");
            // 1) If user submits anything other than a integer a EXCEPTION error will be generated

        }

        {
            Scanner input = new Scanner(System.in);


//            System.out.print("Enter first word: ");
//            String word1 = input.nextLine();
//            System.out.print("Enter second word: ");
//            String word2 = input.nextLine();
//            System.out.print("Enter third word: ");
//            String word3 = input.nextLine();


            // (3) ******************************************
            System.out.print("Enter first word: ");
            String word1 = input.nextLine();
            System.out.print("Enter second word: ");
            String word2 = input.nextLine();
            System.out.print("Enter third word: ");
            String word3 = input.nextLine();
//            System.out.println("All the text entered: " + "\n" + word1 + "\n" + word2 + "\n" + word3 + "\n");
            System.out.printf("All the text entered: " + "\n" + "%s" + "\n" + "%s" + "\n" + "%s" + "\n", word1, word2, word3);
//            scanner.nextLine();

            // (3) - 1 Yes - more than 3 words can be entered.
        }

        {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a sentence: ");
            String sentence1 = input.nextLine();
            System.out.printf("%s \n", sentence1);

        }


        {


            int length, width, area, perimeter;

            Scanner in = new Scanner(System.in);
            System.out.println("Enter length of Rectangle");
            length = in.nextInt();
            System.out.println("Enter width of Rectangle");
            width = in.nextInt();
            // Area of rectangle = length X width
            area = length * width;
            // Perimeter of rectangle = 2 X (length X width)
            perimeter = 2 * (length + width);
            System.out.println("Area of Rectangle : " + area);
            System.out.println("Rectangle of Rectangle : " + perimeter);

        }
    }
};