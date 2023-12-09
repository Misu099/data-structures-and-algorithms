package pack.datastructures;


public class Main {
    public static void main(String[] args) {

MyArrayList<String> test = new MyArrayList<>(2);
test.add("asd");
test.add("cal");
        System.out.println(test.toString());
for (int i = 2; i< 6; i++){
    test.add("a" + i);

}
        System.out.println(test.toString());
test.remove("a5");
test.remove("cal");
        System.out.println(test.toString());


    }




}



