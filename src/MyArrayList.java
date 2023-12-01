import java.util.Arrays;

public class MyArrayList<T> {

    private final int DEFAULT_SIZE = 10;
    private Object[] theArray;
    private boolean[] isFilled;
    private int size;
    private int nextPos;


    public MyArrayList() {
        theArray = new Object[DEFAULT_SIZE];
        isFilled = new boolean[DEFAULT_SIZE];
        size = DEFAULT_SIZE;
    }

    public MyArrayList(int size) {
        this.size = size;
        theArray = new Object[size];
        isFilled = new boolean[size];
    }

    public void add(T obj) {
        if (isFull()) {
            setSize(theArray.length + 1);
        }
        for (int i = 0; i < isFilled.length; i++) {
            if (!isFilled[i]) {
                theArray[i] = obj;
                isFilled[i] = true;
                break;
            }
        }
    }

    public void add(T obj, int index) {
        if (index > -1 && index < theArray.length) {
            theArray[index] = obj;
            isFilled[index] = true;
        }
    }

    public Object get(int index) {
        if (index > -1 && index < theArray.length) {
            if (theArray[index] == null) {
                return null;
            }
        }
        return theArray[index];
    }

    public boolean isEmpty() {
        for (boolean aBoolean : isFilled) {
            if (aBoolean) {
                return false;
            }
        }
        return true;
    }

    public boolean isFull() {
        for (boolean aBoolean : isFilled) {
            if (!aBoolean) {
                return false;
            }
        }
        return true;
    }

    public void remove(int index) {
        if (index > -1 && index < theArray.length) {
            theArray[index] = null;
            isFilled[index] = false;
        }
    }

    public void remove(T obj) {
        for (int i = 0; i < theArray.length; i++) {
            if (theArray[i] != null && theArray[i].equals(obj)) {
                theArray[i] = null;
                isFilled[i] = false;
                return;
            }
        }
    }

    public int getSize() {
        return theArray.length;
    }

    //todo: this method should be rather private and be used just to change the size of array when needed
    private void setSize(int size) {
        theArray = Arrays.copyOf(theArray, size);
        isFilled = Arrays.copyOf(isFilled, size);
        this.size = size;
    }

    //todo: ugly naming(personal opinion). This may be a toString implementation(read about it or ask me).
    public String toString() {
        StringBuilder stringValue = new StringBuilder("The Array has: ");
        for (int i = 0; i < theArray.length; i++) {
            if (i == theArray.length - 1) {
                stringValue.append(theArray[i]).append(".");
                break;
            }
            stringValue.append(theArray[i]).append(", ");
        }

        return stringValue.toString();
    }

    public String testmethod() {
        StringBuilder testValue = new StringBuilder("Filled pos: ");
        for (int i = 0; i < isFilled.length; i++) {
            if (i == isFilled.length - 1) {
                testValue.append(isFilled[i]).append(".");
                break;
            }
            testValue.append(isFilled[i]).append(", ");
        }
        return testValue.toString();


    }
}
