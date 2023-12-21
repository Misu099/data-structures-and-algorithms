package pack.datastructures;

import java.util.ArrayList;

public class MySorting<T extends Comparable<T>> {

    //todo: this method may be static and the syntax for type of T will be a little more complicated
    public static <T extends Comparable<T>> void sort(ArrayList<T> list) {
        T temp;
        for (int k = 0; k < list.size() - 1; k++) {
            for (int i = 0; i < list.size() - 1; i++) {
                if ((list.get(i).compareTo(list.get(i + 1)) > 0)) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            }
        }
    }

    public static <T extends Comparable<T>> void sortMy(MyArrayList<T> list) {
        T temp;
        for (int k = 0; k < list.getSize() - 1; k++) {
            for (int i = 0; i < list.getSize() - 1; i++) {
                if ((list.get(i).compareTo(list.get(i + 1)) > 0)) {
                    temp = list.get(i);
                    list.add(list.get(i + 1), i);
                    list.add(temp, i + 1);
                }
            }
        }
    }

}
