class CarShowroom {
    int numberOfCars = 0;

    synchronized void addCar() {
        numberOfCars++;
        System.out.println("Manufacturer added 1 car. Available cars: " + numberOfCars);
        notifyAll();
    }

    synchronized void buyCar(String consumerName) {
        while (numberOfCars == 0) {
            try {
                System.out.println(consumerName + " is waiting for a car");
                wait();
            } catch (InterruptedException e) {
            }
        }

        numberOfCars--;
        System.out.println(consumerName + " bought 1 car. Available cars: " + numberOfCars);
    }
}

class Manufacturer extends Thread {
    CarShowroom showroom;

    Manufacturer(CarShowroom showroom) {
        this.showroom = showroom;
    }

    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                Thread.sleep(2000);
                showroom.addCar();
            }
        } catch (InterruptedException e) {
        }
    }
}

class Consumer extends Thread {
    CarShowroom showroom;
    String name;

    Consumer(CarShowroom showroom, String name) {
        this.showroom = showroom;
        this.name = name;
    }

    public void run() {
        showroom.buyCar(name);
    }
}

public class Assignment9Qn7 {
    public static void main(String[] args) {
        CarShowroom showroom = new CarShowroom();

        Manufacturer m = new Manufacturer(showroom);
        Consumer c1 = new Consumer(showroom, "Consumer 1");
        Consumer c2 = new Consumer(showroom, "Consumer 2");
        Consumer c3 = new Consumer(showroom, "Consumer 3");

        c1.start();
        c2.start();
        c3.start();
        m.start();
    }
}