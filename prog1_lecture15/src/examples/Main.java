package examples;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Teacher("Benn", "Christensen", "Adjunkt"));
        people.add(new Student("Alex", "Sander"));
        for (Person person : people) {
            if (person instanceof Student) {
                System.out.println(person.getFullName());
            } else {
                System.out.println(person);
            }
        }
    }
}
