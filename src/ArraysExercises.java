
import java.util.Arrays;

public class ArraysExercises {


    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//
//
//        // 1.A) Arrays.toString(array) is required to convert the array to a string
//        System.out.println(Arrays.toString(numbers));

        // 1.B) Create an array that holds 3 Person objects.
        Person[] personArray = new Person[3];
        Person aPerson = new Person();
        aPerson.setFirstName("John");
        aPerson.setLastName("Santos");
        personArray[0] = aPerson;

        aPerson = new Person();
        aPerson.setFirstName("Bella");
        aPerson.setLastName("Santos");
        personArray[1] = aPerson;

        aPerson = new Person();
        aPerson.setFirstName("Alfred");
        aPerson.setLastName("Santos");
        personArray[2] = aPerson;

        System.out.println();
        System.out.println("Names from the person array:");
        for (Person person : personArray) {
            System.out.printf("\t%s %s\n", person.getFirstName(), person.getLastName());
        }
        System.out.println();
//
//        // add an element
        aPerson = new Person();
        aPerson.setFirstName("Yvette");
        aPerson.setLastName("Santos");
        personArray = addPerson(personArray, aPerson);
        System.out.println("\nThe copies array data:\n" + Arrays.toString(personArray));

    }

    /**
     * Method to copy array and add a new person
     * @param inputArray    Array to be copied
     * @param aPerson       Element to be added
     * @return              A copy of the array with the element added to the end.
     */
    public static Person[] addPerson(Person[] inputArray, Person aPerson) {
        int length = 0;
        Person[] newPersonList = null;
        if (inputArray == null) length = 0;
        else length = inputArray.length;

        // copy using Arrays
        newPersonList = Arrays.copyOf(inputArray, length+1);


//        // add new entry
        newPersonList[length] = aPerson;

        return newPersonList;
    }
}
