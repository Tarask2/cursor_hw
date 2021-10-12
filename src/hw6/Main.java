package hw6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(3);
        arrayList.add(9);
        arrayList.add(11);
        arrayList.add(18);
        arrayList.add(20);
        arrayList.add(22);
        System.out.println(arrayList);
        arrayList.removeIf(integer -> integer % 3 == 0);
        System.out.println(arrayList);

        System.out.println("Task 2");

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Kiwi");
        fruits.add("Cherry");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapefruit");
        fruits.add("Apple");
        System.out.println("Array with orange : " + fruits);
        if (fruits.contains("Orange")) {
            int i = fruits.indexOf("Orange");
            fruits.set(i, "Grepefruit");

        }
        System.out.println("New array with grapefruit: " + fruits);


        System.out.println("Task 3");

        List<String> list1 = new ArrayList<>();
        list1.add("Ferrari");
        list1.add("BMW");
        list1.add("Audi");
        list1.add("Mercedes");

        List<String> list2 = new ArrayList<>();

        list2.add("Fiat");
        list2.add("Tesla");
        list2.add("Ford");
        list2.add("BMW");

        System.out.println("Check list: " + checkList(list1, list2));
    }

    public static boolean checkList(List<String> newList, List<String> newList2) {
        for (String element : newList) {
            if (newList2.contains(element)) {
                return true;
            }
        }
        return false;
    }

}






