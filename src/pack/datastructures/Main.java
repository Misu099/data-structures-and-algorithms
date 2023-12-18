package pack.datastructures;


public class Main {
    public static void main(String[] args) {

        MyArrayList<String> test = new MyArrayList<>(2);
        test.add("a");
        test.add("b");
        test.add("B", 1);
        System.out.println(test.toString());
        test.add("c");
        test.add("d");
        System.out.println(test.toString());
        test.remove("a");
        test.remove(2);
        System.out.println(test.toString());

    }


}



