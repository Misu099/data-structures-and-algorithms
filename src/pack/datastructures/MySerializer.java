package pack.datastructures;

import java.io.*;

public class MySerializer {


    public <T> void mySerialize(MyArrayList<T> aList, String fileName) {
        try {
            ObjectOutputStream outputStreamSer = new ObjectOutputStream(new FileOutputStream(fileName));
            outputStreamSer.writeObject(aList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public <T> MyArrayList<T> myDeserialize(String fileName) {
        MyArrayList<T> recoveredList = new MyArrayList<>();
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
            recoveredList = (MyArrayList<T>) inputStream.readObject();

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        return recoveredList;
    }
}
