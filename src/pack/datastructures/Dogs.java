package pack.datastructures;

public class Dogs implements Comparable<Dogs> {
    private int size;
    private String name;


    public Dogs(String name, int size) {
        this.size = size;
        this.name = name;


    }

    public String toString() {
        return "Name: " + name + ", size: " + size;
    }

    @Override
    public int compareTo(Dogs dog) {
        return this.name.compareTo(dog.name);
        // return Integer.compare(this.size, dog.size);
    }


}
