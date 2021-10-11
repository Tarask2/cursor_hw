package hw3;

public class Car {
    private boolean engine = false;
    private double speed = 0;

    public void toStart() {
        engine = true;
        System.out.println("The car started");
    }

    public void stop() {
        engine = false;
        System.out.println("The car stop");
    }

    public void dry(double value) {
        speed = value;
        if (engine = !false && speed > 0)
            System.out.println("The car is dry");
    }

    public void accelerate(double value) {
        speed = value;
        if (engine = !false && speed > 60)
            System.out.println("The car accelerated from " + speed + " mph");
    }
}
