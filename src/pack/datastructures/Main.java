package pack.datastructures;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MySorting<Dogs> test = new MySorting<>();
        ArrayList<Dogs> list = new ArrayList<>(5);
        list.add(new Dogs("Gica", 23));
        list.add(new Dogs("Fanel", 232));
        list.add(new Dogs("Sandel", 5));
        list.add(new Dogs("Costel", 7));
        list.add(new Dogs("Ninel", 1));

        System.out.println(list);
        test.sort(list);
        System.out.println(list);


    }


}



