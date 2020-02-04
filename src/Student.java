
// TODO: A CLASS is used to define a custom type in Java. A class as a template, or a blueprint, for objects that will be created based on it.

// TODO: A FIELD is a variable or method that belongs to an object or a class. Fields are accessed with the . operator. By default, fields belong to objects, but can be defined as belonging to a class with the static keyword. Fields are either properties (variables) or methods (functions).

// TODO: A OBjECT is an instance of a class


import java.util.Date;


public class Student {  // Public Class
    static int numberOfStudents = 0;
    String name;
    String cohort;
    Date startDate;
    String program;
    String location;
    boolean drinksCoffee;

    public Student() { // Object constructor with no parameters
        numberOfStudents++;
    }

    public Student(String inputName) {  // Object constructor with 1 parameter
        numberOfStudents++;
        this.name = inputName;
    }

    public Student(String inputName, String inputCohort) {  // Object constructor with 2 parameter
        numberOfStudents++;
        this.name = inputName;
        this.cohort = inputCohort;
    }

    public static void main(String[] args) { // Method to construct a object
        Student daniel = new Student("Daniel");
        daniel.cohort = "Europa";
        daniel.startDate = new Date("06/11/2018");
        daniel.program = "Web Development";
        daniel.location = "San Antonio";
        daniel.drinksCoffee = true;

        Student zach = new Student("Zach");
        zach.cohort = "Bayes";
        zach.startDate = new Date("February 11, 2017");
        zach.program = "Data Science";
        zach.location = "San Antonio";
        zach.drinksCoffee = false;

        Student ryan = new Student();

        System.out.println(daniel.report());
        System.out.println(zach.report());
        System.out.println(reportOnAllStudents());

    }

    public String report() {
        String output = "";
        output += "My name is " + this.name + ".\n";
        output += "I started learning " + this.program + " with " + this.cohort + " on " + this.startDate + ".\n";
        if(this.drinksCoffee) {
            output += "I drink coffee in " + this.location + ".\n";
        } else {
            output += "I don't drink coffee in " + this.location + ".\n";
        }
        return output;
    }

    public static String reportOnAllStudents() {
        return "There are " + numberOfStudents + " students at Codeup.";
    }

}


