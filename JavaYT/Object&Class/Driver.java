public class Driver {

    static int minAge = 18;
    String name;
    String dateOflicence;
    public static void main(String[] args) {
        // Car NewCar = new Car();
        // NewCar.AddFule(6);
        // NewCar.drive();
        // NewCar.drive();
        // NewCar.drive();
        // NewCar.AddFule(6);
        // System.out.println(NewCar.currentFuleInLitetrs);
        Car swift = new Car("white");
        swift.AddFule(6);
        // Car startedCar = swift.start();
        swift.start().drive();
        swift.drive();
        System.out.println(swift.currentFuleInLitetrs);

        Driver myDriver = new Driver();
        myDriver.dateOflicence = "07/02/2029";
        System.out.println(minAge);
        System.out.println(swift.color);


        Car thar = new Car();
    }   
}