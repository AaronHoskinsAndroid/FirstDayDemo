package examples.aaronhoskins.com.firstdaydemo;

public class Animal {
    //member variables
    private String dietType;
    private int weight;
    private boolean isAlive;

    //Default Constructors
    //control + enter (MAC) or alt + insert(WIN) select Constructor
//    public Animal() {
//    }

    //Parameterized Constructor
    public Animal(String dietType, int weight, boolean isAlive) {
        this.dietType = dietType;
        this.weight = weight;
        this.isAlive = isAlive;
    }

    //control + enter (MAC) or alt + insert(WIN) select Getters/Setters
    //Getters and Setters
    public String getDietType() {
        return dietType;
    }

    public void setDietType(String dietType) {
        this.dietType = dietType;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void speak() {
        //sout
        System.out.println("Animal Said Something");
    }
    //Overloading
    public void speak(String string) {
        System.out.println(string);
    }
}
