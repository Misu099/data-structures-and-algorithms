public class Main {
    public static void main(String[] args) {


        MyArrayList<String> test = new MyArrayList<>(5);
        System.out.println(test.isEmpty());
        test.add("asd");
        System.out.println(test.isEmpty());
        test.add("a");
        test.add("5");

        test.printIt();
        test.remove("5");
        test.add("555");
        test.add("b");
        test.add("g");
        test.add("b");
        test.add("g");
        test.printIt();



    }
}