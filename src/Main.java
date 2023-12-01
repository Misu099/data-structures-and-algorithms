public class Main {
    public static void main(String[] args) {


        MyArrayList<Integer> test = new MyArrayList<>(2);
        System.out.println(test.isEmpty());
        test.add(null);
        System.out.println(test);

        test.add(6);
        System.out.println(test);

        test.remove(0);
        System.out.println(test);

        test.add(2);
        test.add(7);
        test.add(null);
        System.out.println(test);

        test.add(null);
        test.add(34);
        test.remove(3);

        System.out.println(test);
        System.out.println(test.isFull());
        System.out.println(test.isEmpty());

        System.out.println((int)test.get(2)+5);
        System.out.println((int)test.get(2)-5);
        System.out.println((int)test.get(3)+5);
    }
}