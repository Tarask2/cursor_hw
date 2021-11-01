package hw9;

import java.util.Arrays;

public class MyArrayList<E> {

    private Object[] values;
    private int size;
    private final static int DEFAULT_SIZE = 10;
    private int arraySize = DEFAULT_SIZE;

    public MyArrayList() {
        values = new Object[DEFAULT_SIZE];
    }


    public MyArrayList(int capacity) {
        values = new Object[capacity];
    }


    public int size() {
        return size;
    }


    public void add(E object) {
        change();
        values[size] = object;
        size++;
    }


    public void add(E object, int index) {
        change();
        System.arraycopy(values, index, values, index + 1, size - index);
        values[index] = object;
        ++size;
    }


    public void clear() {
        for (int i = 0; i < size; i++) {
            values[i] = null;
        }
        size = 0;
    }

    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }


    public Object get(int index) {
        if (index < size && index >= 0) {
            return values[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }


    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (values[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = size - 1; i >= 0; i--) {
                if (values[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = size - 1; i >= 0; i--) {
                if (o.equals(values[i])) {
                    return i;
                }
            }
        }
        return -1;
    }


    public void remove(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(values, index + 1, values, index, size - index - 1);
        values[--size] = null;
        change();
    }

    public void remove(Object o) {
        int index = indexOf(o);
        if (index >= 0) {
            System.arraycopy(values, index + 1, values, index, size - index - 1);
            size--;
            values[size] = null;
        }
    }


    public Object set(Object o, int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Object oldObject = values[index];
        values[index] = o;
        return oldObject;
    }


    public Object[] toArray() {
        Object[] newArray = new Object[size];
        System.arraycopy(values, 0, newArray, 0, size);
        return newArray;
    }


    private void change() {
        if (size >= arraySize) {
            Object[] newValues = new Object[size * 3 / 2 + 1];
            System.arraycopy(values, 0, newValues, 0, size);
            values = newValues;
        }
        if (size >= DEFAULT_SIZE && size < arraySize / 4) {
            Object[] newValues = new Object[size * 3 / 2 + 1];
            System.arraycopy(values, 0, newValues, 0, size);
            values = newValues;
        }
    }

    @Override
    public String toString() {
        return
                "values=" + Arrays.toString(values) +
                        '}';
    }
}