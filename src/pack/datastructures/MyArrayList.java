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
            //You are already verifying if the index is out of bounds, so no ArrayIndexOutOfBoundsException can be thrown here
            //TODO: Remove try catch block and add an else block in witch you throw a new ArrayIndexOutOfBoundsException
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

    //TODO: Write a get(obj) method and a private search method to see if the array exist in the array and get its index. Use it inside of remove method too

    public boolean isEmpty() {
        return size == 0;
    }

    //This will be useless, as it will return true everytime after the initial capacity is reached
    public boolean isFull() {
        return size == theArray.length;
    }

    public void remove(int index) {
        if (index > -1 && index < size) {
            for (int i = index; i < size - 1; i++) { //TODO: extract this in a method because you are using it in 2 places
                theArray[i] = theArray[i + 1];
            }
            size--;
            theArray = Arrays.copyOf(theArray, size); //TODO: don't need to resize the array wen shrinking, maybe only the differences are big
        }
    }

    public void remove(T obj) {
        for (int i = 0; i < theArray.length; i++) {
            if (theArray[i] != null && theArray[i].equals(obj)) { //TODO: replace with theArray[i] == obj. You need to remove the object in case it is null too
                for (int j = i; j < theArray.length - 1; j++) {  //This is the second place
                    theArray[j] = theArray[j + 1];
                }
                size--;
                theArray = Arrays.copyOf(theArray, size); //TODO: don't need to resize the array wen shrinking, maybe only the differences are big
                break;
            }
        }
    }

    private void resize() {
        theArray = Arrays.copyOf(theArray, theArray.length + 1);
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
