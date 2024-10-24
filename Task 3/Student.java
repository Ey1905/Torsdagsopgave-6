//Student
import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<String> passedCourses;
    private ArrayList<String> currentCourses;

    //Konstruktør
    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = new ArrayList<>();
    }

    //Override af addCourse
    @Override
    public boolean addCourse(String course) {
        if (!passedCourses.contains(course)) {
            currentCourses.add(course);
            return true;
        }
        return false;
    }
}

