package cat.ilg.m3.uf3.ejercico1;

public class Student {
    public String name = "";
    public int age;
    public int amountOfEnrolledSubjects;

    @Override
    public String toString() {
        return "Name: " + name + "\t\t" +
                "Age: " + age + "\t\t" +
                "Subjects: " + amountOfEnrolledSubjects;
    }
}
