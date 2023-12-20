package pack.datastructures;

import java.io.Serializable;

public class Dogs implements Comparable<Dogs>, Serializable {
    private int size;
    private String name;


    public Dogs(String name, int size) {
        this.size = size;
        this.name = name;
    }


    public void eat(int quantity) {
        if (quantity > 0 && quantity < 50) {
            this.size += quantity;
        }
    }


    public String toString() {
        return "Name: " + name + ", size: " + size;
    }


    @Override
    public int compareTo(Dogs dog) {
        // return this.name.compareTo(dog.name);
        return Integer.compare(this.size, dog.size);
    }
}
