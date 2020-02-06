package grades;

import util.Input;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class GradesApplication {

    static HashMap<String, Student> collectionx;

    static void init(){

        collectionx = new HashMap<>();
        // and putting some data into it
        Student Jack = new Student("Jack");
        collectionx.put("SrDevMaster", Jack);
        collectionx.get("SrDevMaster").addGrade(76);
        collectionx.get("SrDevMaster").addGrade(86);
        collectionx.get("SrDevMaster").addGrade(95);
    
        Student Jill = new Student("Jill");
        collectionx.put("DoctorJ", Jill);
        collectionx.get("DoctorJ").addGrade(76);
        collectionx.get("DoctorJ").addGrade(86);
        collectionx.get("DoctorJ").addGrade(95);
    
        Student Ryan = new Student("Ryan");
        collectionx.put("roboRyan", Ryan);
        collectionx.get("roboRyan").addGrade(76);
        collectionx.get("roboRyan").addGrade(86);
        collectionx.get("roboRyan").addGrade(95);
    
        }
    
        public static void main(String[] args) {
            init();
            for (String codeup : collectionx.keySet())
                System.out.print(" |" + codeup + "| ");
            System.out.println();
    
            Input input = new Input();
            String codeup;
            String answer = "yes";
            do {
                System.out.println("Here are the github usernames of our collection:\n");
                codeup = input.getString();
    
    
                if (collectionx.containsKey(codeup)) {
                    Student student = collectionx.get(codeup);
                    System.out.println(student);
                } else {
                    System.out.println("Sorry, no student found with the github username of \"" + codeup + "\".");
                }
                System.out.print("Would you like to see another record:\n>");
                answer = input.getString();
            } while (!answer.toLowerCase().contains("n"));
        }
}
