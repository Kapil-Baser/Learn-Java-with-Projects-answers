public class Dinosaur {
    private String name;
    private int age;
    private double weight;

    // Constructor
    public Dinosaur(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
