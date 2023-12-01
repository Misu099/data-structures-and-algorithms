public class Main {
    public static void main(String[] args) {


        MyArrayList<Integer> test = new MyArrayList<>(2);
        System.out.println(test.isEmpty());
        test.add(null);
        System.out.println(test);
        System.out.println(test.testmethod());
        test.add(6);
        System.out.println(test);
        System.out.println(test.testmethod());
        test.remove(0);
        System.out.println(test);
        System.out.println(test.testmethod());
        test.add(2);
        test.add(7);
        test.add(null);
        System.out.println(test);
        System.out.println(test.testmethod());
        test.add(null);
        test.add(34);
        System.out.println(test);
        System.out.println(test.testmethod());
        System.out.println(test.isFull());
        System.out.println(test.isEmpty());
    }
}