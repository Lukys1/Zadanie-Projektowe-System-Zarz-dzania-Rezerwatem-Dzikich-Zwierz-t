import java.util.ArrayList;

public class Enclosure {
private String name;
private int capacity;
//private List<Animal> animals = new ArrayList<>();

    public Enclosure(String name,int capacity){
        setName(name);
        setCapacity(capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if(capacity<1){
            throw new IllegalArgumentException("Pojemnosc musi byc większa od 1");
        }
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){
            throw new IllegalArgumentException("Imie nie może być puste");
        }
        this.name = name;
    }



}