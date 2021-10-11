package hw3;

public class Main {

    public static void main(String[] args) {


        System.out.println("Task 1");
        Circle circle = new Circle();
        System.out.println("Area of the Circle is " + circle.area());

        System.out.println("Task 2");
        Car car = new Car();
        car.toStart();
        car.stop();
        car.dry(10);
        car.accelerate(100);

        System.out.println("Task 3");
        Money amount1 = new Money(80, (byte) 75);
        Money amount2 = new Money(20, (byte) 25);
        System.out.println("Value 1 : " + amount1);
        System.out.println("Value 2 : " + amount2);
        System.out.println("Add : " + Money.add(amount1, amount2));
        System.out.println("Substract : " + Money.substract(amount1, amount2));
        System.out.println("Multiply : " + Money.multiply(amount1, amount2));
        System.out.println("Divide : " + Money.divide(amount1, amount2));
        System.out.println("More : " + Money.more(amount1, amount2));
        System.out.println("Less : " + Money.less(amount1, amount2));
        System.out.println("Equal : " + Money.equal(amount1, amount2));

    }

}
