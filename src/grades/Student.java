package grades;//package grades;
import java.util.ArrayList;

public class Student {
        private String name;
        // We'll start by defining a hash map
        private ArrayList<Integer> grades;// = new ArrayList<>();


        // Constructor sets the name of student and initializes array.
        public Student(String name) {
            this.name = name;
            this.grades = new ArrayList<>();
        }

        //returns the student's name
        public  String getStudentNames() {
            return name;
        }

        // adds the given grade to the grades property
        public void addGrade(int grade) {
            this.grades.add(grade);
        }


        // returns the average of the students grades
        public double getGradeAverage() {
            double total = 0;
            for (double i : this.grades) {
                total += i;
            }
            return total / this.grades.size();
        }

        // Adding a main method and creating Student objects. Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.
        public static void main(String[] args) {

//            Student Jack = new Student("Jack");
//            Jack.addGrade(99);
//            Jack.addGrade(85);
//            System.out.println(Jack.grades);
//
//            Student Jill = new Student("Jill");
//            Jill.addGrade(100);
//            Jill.addGrade(95);
//            System.out.println(Jill.grades);


    }
}
