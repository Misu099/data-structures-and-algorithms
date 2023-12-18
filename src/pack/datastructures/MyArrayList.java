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
        if (isFull()) {
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

        //You are already verifying if the index is out of bounds, so no ArrayIndexOutOfBoundsException can be thrown here
        //TODO: Remove try catch block and add an else block in witch you throw a new ArrayIndexOutOfBoundsException
        //done
        if (index > -1 && index < size) {
            theArray[index] = obj;
        } else {
            throw new ArrayIndexOutOfBoundsException("It can only override already filled positions.");
        }
    }


    public Object get(int index) {
        if (index > -1 && index < size) {
            return theArray[index];
        } else {
            throw new ArrayIndexOutOfBoundsException("It can iterate only over the elements you added.");
        }
    }

    //TODO: Write a get(obj) method and a private search method to see if the array exist in the array and get its index. Use it inside of remove method too;
    //done

    public Object get(T obj) {
        try {
            return theArray[search(obj)];
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Item not present");
        }
        throw new ArrayIndexOutOfBoundsException("Out of bounds");
    }

    private int search(T obj) {
        for (int i = 0; i < size; i++) {
            if (theArray[i] == obj) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    //This will be useless, as it will return true everytime after the initial capacity is reached;
    // but i need it on add()
    public boolean isFull() {
        return size == theArray.length;
    }

    public void remove(int index) {
        if (index > -1 && index < size) {
            for (int i = index; i < size - 1; i++) { //TODO: extract this in a method because you are using it in 2 places
                theArray[i] = theArray[i + 1];
            }
            size--;
            theArray = Arrays.copyOf(theArray, size); //TODO: don't need to resize the array when shrinking, maybe only the differences are big
            // but we discussed it and you said that will be ok to not have nulls at the tail, and so to have only user inserted nulls
        }
    }

    public void remove(T obj) {
        remove(search(obj));
    }


    private void resize() {
        theArray = Arrays.copyOf(theArray, theArray.length + 1); //not very efficient, but it will not have nulls at tail;
    }

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
