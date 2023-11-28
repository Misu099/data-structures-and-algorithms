public class MyArrayList <T>{

    private Object[] baza;
    private int size;


    public MyArrayList(int size){
        baza = new Object[size];
    }

public void add(T item, int index){
        baza[index] = item;
}

public void printIt(){
    System.out.print("Baza are: ");
    for (Object o : baza) {
        System.out.print(o + ", ");
    }
}

}
