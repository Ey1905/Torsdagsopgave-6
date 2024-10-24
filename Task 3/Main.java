//Main
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> passedCourses1 = new ArrayList<>();
        passedCourses1.add("math 101");
        passedCourses1.add("Java 1.0");

        ArrayList<String> passedCourses2 = new ArrayList<>();
        passedCourses2.add("Physics 101");

        ArrayList<String> canTeach1 = new ArrayList<>();
        canTeach1.add("Math 101");

        ArrayList<String> canTeach2 = new ArrayList<>();
        canTeach2.add("Java 1.0");
        canTeach2.add("Physics 101");

        Student student1 = new Student("Marie", passedCourses1);
        Student student2 = new Student("Thomas", passedCourses2);
        Teacher teacher1 = new Teacher("Mr. Smith", canTeach1);
        Teacher teacher2 = new Teacher("Mrs. Johnson", canTeach2);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(student1);
        persons.add(student2);
        persons.add(teacher1);
        persons.add(teacher2);

        for (Person person : persons) {
            boolean success = person.addCourse("Java 1.0");

            if (!success) {
                System.out.print(person.getName() + ": ");

                if (person instanceof Student) {
                    System.out.println("Har allerede betået dette kursus.");
                } else if (person instanceof Teacher) {
                    System.out.println("Kan ikke undervise i dette fag.");
                }
            }
        }

    }
}

