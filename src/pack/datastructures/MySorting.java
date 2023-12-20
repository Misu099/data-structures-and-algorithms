package pack.datastructures;

import java.util.ArrayList;

public class MySorting<T extends Comparable<T>> {
    public MySorting() {
        // This constructor is made automatically by compiler
    }

    //todo: this method may be static and the syntax for type of T will be a little more complicated
    public void sort(ArrayList<T> list) {
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
}
