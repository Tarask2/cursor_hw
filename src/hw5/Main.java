package hw5;

public class Main {


    public static void main(String[] args) {
        MyList<Number> myList = new MyList();
        myList.add(-1);
        myList.add(1);
        myList.add(0);
        myList.add(7);
        myList.add(4);
        myList.add(9);

        System.out.println("Largest Number is: " + myList.max());
        System.out.println("Smallest Number is: " + myList.min());


    }
}