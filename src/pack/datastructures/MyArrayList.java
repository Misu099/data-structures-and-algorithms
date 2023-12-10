package pack.datastructures;

import java.util.Arrays;

public class MyArrayList<T> {

    private static final int DEFAULT_SIZE = 10;
    private Object[] theArray;

    private int size = 0;


    public MyArrayList() {
        theArray = new Object[DEFAULT_SIZE];
    }

    public MyArrayList(int s) {
        theArray = new Object[s];
    }

    public void add(T obj) {
        if (size >= theArray.length) {
            resize();
        }
        for (int i = size; i < theArray.length; i++) {
            if (theArray[i] == null) {
                theArray[i] = obj;
                size++;
                break;
            }
        }
    }

    public void add(T obj, int index) {
        try {
            if (index > -1 && index < size) {
                theArray[index] = obj;
                size++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("It can only override already filled positions.");
        }
    }

    public Object get(int index) {
        if (index > -1 && index < size) {
            return theArray[index];
        } else {
            throw new ArrayIndexOutOfBoundsException("It can iterate only over the elements you added.");
        }
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == theArray.length;
    }

    public void remove(int index) {
        if (index > -1 && index < size) {
            for (int i = index; i < size - 1; i++) {
                theArray[i] = theArray[i + 1];
            }
            size--;
            theArray = Arrays.copyOf(theArray, size);
        }
    }

    public void remove(T obj) {
        for (int i = 0; i < theArray.length; i++) {
            if (theArray[i] != null && theArray[i].equals(obj)) {
                for (int j = i; j < theArray.length - 1; j++) {
                    theArray[j] = theArray[j + 1];
                }
                size--;
                theArray = Arrays.copyOf(theArray, size);
                break;
            }
        }
    }


    //todo: this method should be rather private and be used just to change the size of array when needed
    private void resize() {
        theArray = Arrays.copyOf(theArray, theArray.length + 1);
    }

    //todo: ugly naming(personal opinion). This may be a toString implementation(read about it or ask me).
    public String toString() {
        StringBuilder stringValue = new StringBuilder("The Array has: ");
        String isFullValue = "It is full: " + isFull() + ". \n";
        String isEmptyValue = "It is empty: " + isEmpty() + ". \n";
        String numOfFilled = "Filled: " + size + "/" + (theArray.length) + ". \n";
        for (int i = 0; i < theArray.length; i++) {
            if (i == theArray.length - 1) {
                stringValue.append(theArray[i]).append(".\n");
                break;
            }
            stringValue.append(theArray[i]).append(", ");
        }
        return stringValue.toString() + isEmptyValue + isFullValue + numOfFilled;
    }


}
