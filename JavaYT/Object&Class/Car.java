public class Car{
    int noOfWeeles;
    String color;
    float maxSpeed;
    float currentFuleInLitetrs;
    int noOfSeats;

    Car (String color){
        noOfWeeles = 4;
        this.color= color;
        maxSpeed = 177;
        currentFuleInLitetrs = 2;
        noOfSeats = 5;
    }

    Car (){
        noOfWeeles = 4;
        this.color= "Red";
        maxSpeed = 177;
        currentFuleInLitetrs = 2;
        noOfSeats = 5;
    }
    
    public Car start(){
        if (currentFuleInLitetrs == 0) {
            System.out.println("Car is out of fule");
        }
        else if (currentFuleInLitetrs < 5) {
            System.out.println("Car is in Reserved Mode, Please Refule");
        }
        else{
            System.out.println("Car is Start.");
            currentFuleInLitetrs--;
        }
        return this;
    }

    public void drive(){
        currentFuleInLitetrs--;
        System.out.println("Car is Driving.");
    }
    public void AddFule(float currentFuleInLitetrs){
        this.currentFuleInLitetrs += currentFuleInLitetrs;
    }
    public float getCurrentfulelevel(){
        return currentFuleInLitetrs;
    }
}