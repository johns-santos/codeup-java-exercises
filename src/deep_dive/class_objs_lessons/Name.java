public class Name {
    private String first;
    private String middle;
    private String last;


    // **********************************************
    // CONSTRUCTOR  methods - Methods to access class
    // **********************************************

    // 3 parameters constructor *********
    public Name(String f, String m, String l) {
        first = f;
        middle = m;
        last = l;
    }

    // 2 parameters  constructor ******************
    public Name(String f, String l) {
        first = f;
        middle = "";
        last = l;
    }

    // 1 parameter constructor *****************************
    public Name(String l) {
        first = "";
        middle = "";
        last = l;
    }

    public Name() {
        first = "";
        middle = "";
        last = "";
    }


    // Create Method to create a string from constructors above
    public String toString() {
        return first + " " + middle + " " + last;
    }
    // SEE FILE NameTest.java and run NameTest

    // ***********************************************************
    // TODO: Accessor Methods - GETTER and SETTER methods ********
    // ***********************************************************
    public String getFirst() {
        return first;
    }

    public String getMiddle() {
        return middle;
    }

    public String getLast() {
        return last;
    }

    public void setFirst(String fname) {
        first = fname;
    }

    public void setMiddle(String mname) {
        middle = mname;
    }


    public void setLast(String lname) {
        last = lname;
    }

    public void setName(String f, String m, String l) {
        first = f;
        middle = m;
        last = l;

    }

}
