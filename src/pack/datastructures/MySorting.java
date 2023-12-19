package pack.datastructures;

import java.util.ArrayList;

public class MySorting<T extends Comparable<T>> {
    ArrayList<T> output;
    T temp;

    public MySorting() {

    }


    public ArrayList<T> sort(ArrayList<T> input) {
        output = input;
        for (int k = 0; k < output.size() - 1; k++) {
            for (int i = 0; i < output.size() - 1; i++) {
                if ((output.get(i).compareTo(output.get(i + 1)) > 0)) {
                    temp = output.get(i);
                    output.set(i, output.get(i + 1));
                    output.set(i + 1, temp);
                }
            }
        }

        return output;
    }

}
