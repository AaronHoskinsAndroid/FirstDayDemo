package examples.aaronhoskins.com.firstdaydemo;

public class Dog extends Animal {
    private String breed;
    private String size;
    //Parameterized Constructor for dog
    public Dog(String dietType, int weight, boolean isAlive, String breed, String size) {
        super(dietType, weight, isAlive);
        this.breed = breed;
        this.size = size;
    }
    //Default for Dog
    public Dog(String dietType, int weight, boolean isAlive) {
        super(dietType, weight, isAlive);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void speak() {
        System.out.println("BARK BARK");
    }
}
