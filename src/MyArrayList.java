import java.util.Arrays;

public class MyArrayList<T> {

    private final int DEFAULT_SIZE = 10;
    private Object[] baza; //todo: only english
    private Object[] helper;
    private int size = 0;
    private int nextPos;


    public MyArrayList() {
        baza = new Object[DEFAULT_SIZE];
        size = DEFAULT_SIZE;
    }

    public MyArrayList(int size) {
        this.size = size;
        baza = new Object[size];
    }

    public void add(T obj) {
        if (nextPos >= baza.length - 1) {
            setSize(baza.length + 1);
        }
        while (true) {
            if (baza[nextPos] == null) {
                baza[nextPos] = obj;
                break;
            }
            nextPos++;
        }
    }

    public void add(T obj, int index) {
        if (index > -1 && index < baza.length) {
            baza[index] = obj; //Overwrites already existing obj, doesn't care if is empty or not.
        }

    }


    public boolean isEmpty() {
        for (Object o : baza) {
            if (o != null) {
                return false;
            }
        }
        return true;
    }

    public void remove(int index) {
        if (index > -1 && index < baza.length) {
            baza[index] = null;
        }
    }


    public void remove(T obj) {
        for (int i = 0; i < baza.length; i++) {
            if (baza[i] != null && baza[i].equals(obj)) {
                baza[i] = null;
                System.out.println("Removed item: " + obj.toString() + " at pos: " + i + "."); //obj.toString will not return what you probably expect
                break;
            }
            if (i == baza.length - 1) {
                System.out.println("Item: " + obj.toString() + " is not present!");
            }
        }

    }

    public int getSize() {
        return baza.length;
    }

    //todo: this method should be rather private and be used just to change the size of array when needed
    public void setSize(int size) {
        baza = Arrays.copyOf(baza, size);
        int losingItems = this.size - size; //bad naming
        if (losingItems > 0) {
            System.out.println("Lost: " + losingItems + " items");
        }
        this.size = size;
    }

    //todo: ugly naming(personal opinion). This may be a toString implementation(read about it or ask me).
    public void printIt() {
        System.out.print("Baza are: ");  //todo: english please
        for (int i = 0; i < baza.length; i++) {
            if (i == baza.length - 1) {
                System.out.print(baza[i] + ".");
                break;
            }
            System.out.print(baza[i] + ", ");
        }
        System.out.println();
    }

}
