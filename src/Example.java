//  Imports go here

public class Example { //  Opening class. Name should match file name.

    public class Name {   // Define two parts - 1) Data and 2) Method

        // ******** 1) Data First
        private String first;
        private String middle;
        private String last;

        // ******** 2) Method Second
        public String displayName() { // Definition of method
            return first + " " + middle + " " + last;
        }

        public String getInitials() // adding another method
        {
            return first.substring(0, 1) + middle.substring(0, 1) + last.substring(0, 1);
        }
    }


    public static void main(String[] args) {
    }

}

