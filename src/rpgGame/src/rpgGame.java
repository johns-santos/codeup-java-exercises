// https://www.youtube.com/watch?v=L4eqsWCvoB0&list=PLiuAYTl0L-gHgqyWtUKAAhtrTymOLHd28&index=2


import java.util.Scanner;

public class rpgGame {

    static Scanner scanner = new Scanner(System.in);

    //method to get user input from console
    public static int readInt(String prompt, int userChoices) {
        int input;

        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.next());

            } catch (Exception e) {
                input = -1;
                System.out.println("Please enter an integer!!");
            }
        } while (input < 1 || input > userChoices);
        return input;
    }

    // method to simulate clearing out the console
    // print 100 lines
    public static void clearConsole() {
        for (int i = 0; i < 100; i++)
            System.out.println();
    }

    //method to print a seperator with length n
    public static void printSeperator(int n) {
        for (int i = 0; i < n; i++)
            System.out.println();
    }

    //method to print a heading
    public static void printHeading(String title) {
        printSeperator(30);
        System.out.println(title);
        printSeperator(30);
    }

    // method to stop the game until user enters something
    public static void anythingToContinue(){
        System.out.println("\nEnter anything to continue....");
        scanner.next();
    }
}

