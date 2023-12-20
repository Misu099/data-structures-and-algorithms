package pack.datastructures;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MyArrayList<Dogs> listOfDogs = new MyArrayList<>(5);
        listOfDogs.add(new Dogs("Gica", 23));
        listOfDogs.add(new Dogs("Fanel", 232));
        listOfDogs.add(new Dogs("Sandel", 5));
        listOfDogs.add(new Dogs("Costel", 7));
        listOfDogs.add(new Dogs("Ninel", 1));

        System.out.println(listOfDogs);
        MySerializer serIt = new MySerializer();
        serIt.mySerialize(listOfDogs, "test.ser");
        MyArrayList<Dogs> recoveredListOfDogs = serIt.myDeserialize("test.ser");
        System.out.println(recoveredListOfDogs);


        Dogs aDog = (Dogs) recoveredListOfDogs.get(0);
        aDog.eat(7);
        System.out.println(aDog);

        MySorting sorter = new MySorting<>();
        ArrayList<Dogs> anArrayList = new ArrayList<>();

        for (int i = 0; i < recoveredListOfDogs.getSize(); i++) {
            anArrayList.add((Dogs) recoveredListOfDogs.get(i));
        }
        System.out.println(anArrayList);
        anArrayList.get(0).eat(5);
        System.out.println(anArrayList);
        sorter.sort(anArrayList);
        System.out.println(anArrayList);
        anArrayList.get(0).eat(40);
        System.out.println(anArrayList);
        sorter.sort(anArrayList);
        System.out.println(anArrayList);
        anArrayList.get(0).eat(49);
        anArrayList.get(0).eat(49);
        anArrayList.get(0).eat(49);
        anArrayList.get(0).eat(49);
        anArrayList.get(0).eat(49);
        anArrayList.get(0).eat(49);
        sorter.sort(anArrayList);
        System.out.println(anArrayList);

    }


}



