public class Europa {
    public static void something(String[] args) {
        System.out.println("Yada Yada!");
    }

    public static void main(String[] arags) {
        //        System.out.println(num4);

        Student trant = new Student("Trant");
        trant.program = "Web Development";
        trant.cohort = "Deimos";
        trant.location = "San Antonio";
//        trant.startDate = new Date();
        trant.drinksCoffee = false;
//        trant.report();
        System.out.println(trant.report());


        Student john = new Student("John", "Europa");
        System.out.println(john.report());


        Car tesla = new Car("Tesla", "Model S", 2019);
        System.out.println(tesla.startYourEngine("correct"));
        for (int i = 0; i < 5; i++)
            System.out.println(tesla.drive());
        System.out.println(tesla.mileage);


    }
}
