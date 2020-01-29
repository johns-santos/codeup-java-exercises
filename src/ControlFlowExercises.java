
import java.util.Scanner;
import java.util.*;

public class ControlFlowExercises {
    public static void main(String[] args) {

        /////////////////// TODO: START AT 5 and count to 15. Print on one line
        System.out.println("\n*************** START AT 5 and count to 15. Print on one line ***************");
        {

            int i = 5;
            while (i <= 15) {
                System.out.printf("%d ", i);
                i++;
            }
        }

        ///////////////////TODO: START AT 0 and count by 2 to 100
        System.out.println("\n ***************START AT 0 and count by 2 to 100 ***************");

        {
            int a = 0;
            do {
                System.out.println(a);
                a += 2;
            } while (a <= 100);
        }


        ///////////////////TODO: START AT 100 and subtract 5 till 0
        System.out.println("\n*************** START AT 100 and subtract 5 till 0 ***************");

        {
            int a = 100;
            do {
                System.out.println(a);
                a -= 5;
            } while (a >= -10);
        }

        {

            ///////////////////TODO: START AT 100 and subtract 5 till 0
            System.out.println(" \n*************** START AT 100 and subtract 5 till 0 ***************");

            {
                int a = 2;
                do {
                    System.out.println(a);
                    a *= Math.pow(a, 1);
                } while (a <= 1000000);
            }

            ///////////////////TODO: REDO in FOR LOOPS ///////////////////
            System.out.println(" \n*************** REDO in FOR LOOPS ***************");

            for (int i = 100; i > 0; i -= 5) {
                System.out.println(i);
            }
            {

                System.out.println("\n ***************");

            }
            for (int a = 2; a <= 1000000; a *= Math.pow(a, 1)) {
                System.out.println(a);
            }


            ///////////////////TODO: FIZZ BUZZ  ///////////////////
            System.out.println("\n *************** FIZZ BUZZ ***************");
            for (int q = 1; q <= 100; q++)
                if (q % 15 == 0) {
                    System.out.println(q + " FizzBuzz");
                } else if (q % 3 == 0) {
                    System.out.println(q + " Fizz");
                } else if (q % 5 == 0) {
                    System.out.println(q + " Buzz");
                } else {
                    System.out.println(q);
                }
            System.out.println("\n\n\n");


            ///////////////////TODO: DISPLAY TABLE OF POWERS  ///////////////////
            System.out.println("\n *************** TABLE OF POWERS ***************");
            {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter an integer: ");
                int userInput = input.nextInt();
                System.out.print("number |   squared  | cubed \n");
                System.out.print("------ | ---------  | ----- \n");

                {

                    for (int row = 0; row < 4; row++) {
                        int y = 1;
                        for (int col = userInput; col < userInput + 3; col++) {
                            y = y * userInput;
                            System.out.print(y + "   |     ");
                        }
                        System.out.println();
                        userInput++;
                    }
                }
            }

            {
                ///////////////////TODO: GRADE RANGE  ///////////////////
                System.out.println("\n *************** GRADE RANGE ***************");

                Scanner input = new Scanner(System.in);

                System.out.print("Enter a number 0 - 100: ");
                int userInput = input.nextInt();

                if (userInput <= 100 && userInput >= 88) {
                    System.out.println("Letter grade is: A" + "+");
                } else if (userInput <= 87 && userInput >= 80) {
                    System.out.println("Letter grade is: B ");
                } else if (userInput <= 79 && userInput >= 67) {
                    System.out.println("Letter grade is: C ");
                } else if (userInput <= 66 && userInput >= 60) {
                    System.out.println("Letter grade is: D ");
                } else {
                    System.out.println("Letter grade is: F - EPIC FAIL.");
                }

            }

            // ************************* EXTRA ***********************8
//            {
//                Scanner input = new Scanner(System.in);
//
//                System.out.print("Enter a number 0 - 100: ");
//                int userInput = input.nextInt( int, num)
//                ;
//                long sum = 0;
//
//                int num2 = num;
//                boolean negative = false;
//                if (num2 < 0) {
//                    num2 *= -1;
//                    negative = true;
//                }
//                // Loop to sum
//                for (int i = 1; i <= num; i++) {
//                    sum += i;
//                }
//                if (negative) sum *= -1;
//                return sum;
//            }
            }
        }
    }
