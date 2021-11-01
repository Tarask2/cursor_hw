package hw9;

public class Main {
    public static void main(String[] args) {

        MyArrayList<String> myArrayList = new MyArrayList();
        //Додаю 2 елемента
        myArrayList.add("a");
        myArrayList.add("b");
        System.out.println(myArrayList);
        // Додаю елемент з індексом 3
        myArrayList.add("c", 2);
        System.out.println(myArrayList);
        //Перевіряю розмір масиву
        System.out.println(myArrayList.size());
        //Удаляю перший елемент
        myArrayList.remove(0);
        System.out.println(myArrayList);
        //Змінюю 2 елемент на 1
        myArrayList.set("1", 1);
        System.out.println(myArrayList);
        //Удаляю Обєкт 1
        myArrayList.remove("1");
        System.out.println(myArrayList);
        //Удаляю весь список
        myArrayList.clear();
        System.out.println(myArrayList);
        //Перевіряю список чи він пустий
        System.out.println(myArrayList.isEmpty());

    }

}

