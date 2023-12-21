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

       MySorting.sortMy(listOfDogs);
        System.out.println(listOfDogs);
        listOfDogs.get(0).eat(100);
        listOfDogs.get(1).eat(200);
        MySorting.sortMy(listOfDogs);
        System.out.println(listOfDogs);




    }


}



