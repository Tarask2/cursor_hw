package hw5;


import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Number> {
    List<T> list = new ArrayList<T>();


    public void add(T addll) {
        list.add(addll);

    }

    public T max() {
        T value = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).longValue() > value.longValue()) {
                value = list.get(i);
            }

        }
        return value;
    }

    public T min() {
        T value = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).doubleValue() < value.doubleValue()) {
                value = list.get(i);
            }
        }
        return value;
    }


}
