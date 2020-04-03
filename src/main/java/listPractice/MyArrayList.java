package listPractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MyArrayList {
    private Object[] array;
    private int realSize;
    public final static int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        for (int i = 0; i < realSize; i++) {
            if (array[i] == null) {
                System.out.println(i);
                break;
            }
        }
        return true;
    }

    public boolean contains(Object o) {
        if (o == null) {
            return false;
        }
        for (int i = 0; i < realSize; i++) {
            if (o.equals(array[i])) {
                System.out.println(i);
                return true;
            }
        }
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[realSize];
    }

    public boolean add(Object o) {
        increaseArray(realSize, array);
        array[realSize] = o;
        realSize++;
        return true;
    }

    public boolean remove(Object o) {
        int count = -1;
        for (int i = 0; i < realSize; i++) {
            count++;
            if (o.equals(array[i])) {
                array[i] = null;
                break;
            }
        }
        for (int i = count; i < realSize - 1; i++) {
            array[i] = array[i + 1];
        }
        array[realSize - 1] = null;
        realSize--;
        return true;
    }


    public boolean addAll(Collection collection) {
        Object[] objArray;
        objArray = collection.toArray();
        Object inc = new Object();
        int newRealSize = collection.size() + realSize;
        array[newRealSize] = inc;
        inc = increaseArray(newRealSize, array);
        int count = 0;
        for (int i = realSize; i < newRealSize; i++) {
            array[i] = objArray[count];
            count++;
        }
        realSize = newRealSize;
        return true;
    }


    public void clear() {
        for (int i = 0; i < realSize; i++) {
            array[i] = null;
        }
        realSize = 1;
    }


    public Object get(int i) {
        indexOutOfRange(i);
        return array[i];
    }

    public Object set(int index, Object o) {
        indexOutOfRange(index);
        increaseArray(realSize, array);
        array[index] = null;
        return array[index] = o;
    }

    public void add(int index, Object o) {
        indexOutOfRange(index);
        increaseArray(realSize, array);
        realSize++;
        for (int i = realSize - 1; i >= index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = o;
    }

    public Object remove(int index) {
        indexOutOfRange(index);
        Object removeElem = array[index];
        for (int j = index; j < realSize - 1; j++) {
            array[j] = array[j + 1];
        }
        array[realSize - 1] = null;
        realSize--;
        return removeElem;
    }

    private void indexOutOfRange(int index) {
        if (index >= realSize || index < 0) {
            throw new RuntimeException("Out of bound array real size");
        }
    }

    public int indexOf(Object o) {
        int index = -1;
        for (int j = 0; j <= realSize; j++) {
            if (array[j].equals(o)) {
                index = j;
                return index;
            }
        }
        return index;
    }

    public boolean containsAll(Collection collection) {
        Object[] objArray = new Object[collection.size()];
        objArray = collection.toArray();
        int count = 0;
        for (int j = 0; j < objArray.length; j++) {
            for (int i = 0; i < realSize; i++) {
                if (array[i].equals(objArray[j])) {
                    System.out.println(objArray[j] + " in " + i + " position");
                    count++;
                    break;
                }
            }
        }
        if (count == objArray.length) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                ", realSize=" + realSize +
                '}';
    }

    public Object[] increaseArray(int realSize, Object[] array) {
        if (realSize == array.length) {
            return Arrays.copyOf(array, 3 * array.length / 2 + 1);
        }
        return array;
    }
}
