public abstract class Animal implements Feedable, MedicalCare {
    private String name;
    private int age;
    private int health;
    private int hunger;
    private boolean vaccinated;


    public Animal(String name, int age, int health, int hunger, boolean vaccinated) {
        setAge(age);
        setName(name);
        setHealth(health);
        setHunger(hunger);
        this.vaccinated = vaccinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Imie nie może być puste");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 200) {
            throw new IllegalArgumentException("Wiek musi byc wiekszy od 0 i mniejszy od 200");
        }
        this.age = age;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        if (hunger < 0 || hunger > 100) {
            throw new IllegalArgumentException("Głód musi byc w przedziale od 0 do 100");
        }
        this.hunger = hunger;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0 || health > 100) {
            throw new IllegalArgumentException("Zdrowie musi byc w przedziale od 0 do 100");
        }
        this.health = health;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public abstract void makeSound();

    public abstract void getDietType();


}


void main() {


}
