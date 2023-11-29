public class Main {
    public static void main(String[] args) {


        MyArrayList<Integer> test = new MyArrayList<>(5);
        System.out.println(test.isEmpty());
        test.add(1);
        test.add(2,1);
        test.printIt();
        test.remove(3);
        test.remove(Integer.valueOf(1));
        test.printIt();


    }
}