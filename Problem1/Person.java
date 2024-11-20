package Problem1;

public class Person {
    protected String myName;   // Name
    protected int myAge;       // Age
    protected String myGender; // Female/Male/etc

    // Constructor
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    // Getters
    public String getName() {
        return myName;
    }

    public int getAge() {
        return myAge;
    }

    public String getGender() {
        return myGender;
    }

    // Setters
    public void setName(String name) {
        myName = name;
    }

    public void setAge(int age) {
        myAge = age;
    }

    public void setGender(String gender) {
        myGender = gender;
    }

    // toString method
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}
