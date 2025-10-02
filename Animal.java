import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
    // Static variable to keep track of number of animals created
    private static int numOfAnimals = 0;

    // Attributes of the animal
    private String sex;
    private int age;
    private int weight;
    private String animalName;
    private String animalID;
    private String animalBirthDate;
    private String animalColor;
    private String animalOrigin;
    private String animalArrivalDate;

    // Default constructor - increments counter and sets arrival date to today
    public Animal() {
        numOfAnimals++;
        this.animalArrivalDate = getCurrentDate();
    }

    // Constructor that accepts all fields except arrival date (set automatically)
    public Animal(String sex, int age, int weight, String animalName,
                  String animalID, String animalBirthDate, String animalColor,
                  String animalOrigin) {
        numOfAnimals++;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.animalName = animalName;
        this.animalID = animalID;
        this.animalBirthDate = animalBirthDate;
        this.animalColor = animalColor;
        this.animalOrigin = animalOrigin;
        this.animalArrivalDate = getCurrentDate();
    }

    // Helper method to get current date as yyyy-MM-dd
    private String getCurrentDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(new Date());
    }

    // Getters and setters for each field
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalID() {
        return animalID;
    }

    public void setAnimalID(String animalID) {
        this.animalID = animalID;
    }

    public String getAnimalBirthDate() {
        return animalBirthDate;
    }

    public void setAnimalBirthDate(String animalBirthDate) {
        this.animalBirthDate = animalBirthDate;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }

    public String getAnimalOrigin() {
        return animalOrigin;
    }

    public void setAnimalOrigin(String animalOrigin) {
        this.animalOrigin = animalOrigin;
    }

    public String getAnimalArrivalDate() {
        return animalArrivalDate;
    }

    // No setter for arrivalDate because it is set automatically on creation

    // Static method to get total number of animals
    public static int getNumOfAnimals() {
        return numOfAnimals;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "ID='" + animalID + '\'' +
                ", Name='" + animalName + '\'' +
                ", Sex='" + sex + '\'' +
                ", Age=" + age +
                ", Weight=" + weight +
                ", BirthDate='" + animalBirthDate + '\'' +
                ", Color='" + animalColor + '\'' +
                ", Origin='" + animalOrigin + '\'' +
                ", ArrivalDate='" + animalArrivalDate + '\'' +
                '}';
    }
}