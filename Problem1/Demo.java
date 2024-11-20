package Problem1;

public class Demo {
    public static void main(String[] args) {
        // Create instances of each class and print their details
        Person tim = new Person("Tim Burton", 66, "M");
        System.out.println(tim);

        Student helena = new Student("Helena Bonham Carter", 58, "F", "SD456", 3.0);
        System.out.println(helena);

        Teacher johnny = new Teacher("Johnny Depp", 61, "M", "Filmography", 45000);
        System.out.println(johnny);

        CollegeStudent millie = new CollegeStudent("Millie Bobby Brown", 20, "F", "SD123", 4.5, 3, "Stranger Things");
        System.out.println(millie);
    }
}
