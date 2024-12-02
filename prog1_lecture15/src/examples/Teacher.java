package examples;

public class Teacher extends Person {
    private String title;

    public Teacher(String firstName, String lastName, String title) {
        super(firstName, lastName);
        this.title = title;
    }

    @Override
    public String getFullName() {
        return title + " " + super.getFullName();
    }

    @Override
    public String toString() {
        return getFullName();
    }
}
