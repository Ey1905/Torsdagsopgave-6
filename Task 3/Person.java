//Person
public abstract class Person {
    private String name;

    //Konstruktør
    public Person(String name) {
        this.name = name;
    }

    //Getter for name
    public String getName() {
        return name;
    }

    //Setter for name
    public void setName (String name) {
        this.name = name;
    }

    //Abstract metode, som skal implementeres af subklasser
    public abstract boolean addCourse(String course);
}

