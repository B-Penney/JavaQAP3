package Problem1;

public class CollegeStudent extends Student {
    private String major; // Major - field of study
    private int year; // Current level (1 = Freshman, 2 = Sophomore, 3 = Senior, etc.)

    // Constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.year = year;
        this.major = major;
    }

    // Getters
    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    // Setters
    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString method
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}

