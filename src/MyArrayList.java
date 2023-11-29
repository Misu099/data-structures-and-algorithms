import java.util.Arrays;

public class MyArrayList<T> {


    private final int DEFAULT_SIZE = 10;
    private Object[] baza;
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
    if(index > -1 && index < baza.length){
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
        if(index > -1 && index < baza.length) {
            baza[index] = null;
        }
    }


    public void remove(T obj) {
        for (int i = 0; i < baza.length; i++) {
            if (baza[i] != null && baza[i].equals(obj)) {
                baza[i] = null;
                System.out.println("Removed item: " + obj.toString() + " at pos: " + i + ".");
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

    public void setSize(int size) {
        baza = Arrays.copyOf(baza, size);
        int losingItems = this.size - size;
        if (losingItems > 0) {
            System.out.println("Lost: " + losingItems + " items");
        }
        this.size = size;
    }


    public void printIt() {
        System.out.print("Baza are: ");
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
