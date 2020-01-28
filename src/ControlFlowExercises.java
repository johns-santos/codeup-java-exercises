
import java.util.Scanner;
import java.util.*;

public class ControlFlowExercises {
    public static void main(String[] args) {

        /////////////////// TODO: START AT 5 and count to 15. Print on one line
//        int i = 5;
//        while(i <= 15 ){
//            System.out.printf("%d ", i);
//            i++;
//        }
//        System.out.print("\n");
//    }

        ///////////////////TODO: START AT 0 and count by 2 to 100
//        int a = 0;
//        do {
//            System.out.println(a);
//            a+=2;
//        }while (a <= 100);
//    }

        ///////////////////TODO: START AT 100 and subtract 5 till 0
//        int a = 100;
//        do {
//            System.out.println(a);
//            a-=5;
//        }while (a >= 0);
//    }

        ///////////////////TODO: START AT 100 and subtract 5 till 0
//        int a = 2;
//        do {
//            System.out.println(a);
//            a*=Math.pow(a,1);
//        } while (a <= 1000000);

        ///////////////////TODO: REDO in FOR LOOPS ///////////////////

        for (int i = 100; i > 0; i -= 5) {
            System.out.println(i);
        }
        {

            System.out.println("\n\n\n");

        }
        for(int a = 2; a <= 1000000; a*=Math.pow(a,1)) {
            System.out.println(a);
        }
        ///////////////////TODO: FIZZ BIZZ  ///////////////////


    }
}

