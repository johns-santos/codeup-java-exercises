import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long add = addition(5, 6);
        long sub = subtraction(5, 6);
        long div = division(5, 6);
        long mult = multiplication(5, 6);
        long mod = modulus(72, 9);
        System.out.println(add);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(mult);
        System.out.println(mod);
        getInteger(1, 10, scan);
        factorial(getInteger(1, 10, scan));
        dice(scan);

        String bin1 = "10";
        String bin2 = "01";
    }

    private static long addition(long num1, long num2) {
        return (num1 + num2);
    }

    private static long subtraction(long num1, long num2) {
        return (num1 - num2);
    }

    private static long division(long num1, long num2) {
        return (num1 / num2);
    }

    private static long multiplication(long num1, long num2) {
        return (num1 * num2);
    }

    private static long modulus(long num1, long num2) {
        return (num1 % num2);
    }

    private static int getInteger(int min, int max, Scanner scan) {
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int intake = scan.nextInt();
        if ((intake < 1) || (intake > 10)) {
            System.out.print("Invalid Input: " + intake + "\n");
            return getInteger(min, max, scan);
        } else {
            System.out.print("Valid Input: " + intake + "\n");
            return intake;
        }
    }

    private static int factorial(int number) {

        int otherNum = 1;
        String concat = "";
        for (int i = 1; i <= number; i++) {
            concat += (i == 1) ? i : " x " + i;
            System.out.println(i + " ! = " + concat + " = " + (otherNum *= i));
        }

        return 0;

    }

    private static int dice(Scanner scan) {

        System.out.print("Press r to roll the dice! ");

        char input = scan.next().charAt(0);
        int num1 = roll();
        int num2 = roll();


        while (input != 'r') {
            System.out.print("Press r to roll the dice! ");
        }

        if (input == 'r') {

            System.out.print("You rolled " + num1 + " and " + num2 + ".\nWould you like to roll again? (y/n) ");
        }
        char cont = scan.next().charAt(0);

        if (cont == 'y') {
            return dice(scan);
        } else {
            return 0;
        }

    }

    public static int roll() {
        Random rand = new Random();
        int value = rand.nextInt(6) + 1;
        return value;

    }

//    public static String getAnswer(String bin1, String bin2) {
//        anwer = bin1 + bin2;
//        return answer;
//        System.out.println(answer);
//    }
}


