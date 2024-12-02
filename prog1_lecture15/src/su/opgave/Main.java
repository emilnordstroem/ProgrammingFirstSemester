package su.opgave;

import su.opgave.models.Person;
import su.opgave.models.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("model.Person:");
        Person person = new Person("Hanne", "Sydbakken 27", "Datalog");
        Student student = new Student("Margrethe", "Ringvej 7", "STX", 9.5, "DMU01");
        person.udskrivPerson();
        System.out.println();
        System.out.println("model.Student:");
        student.udskrivPerson();// kalder overrided metode
        System.out.println();
        student.udskrivAdresse(); // kalder egen metode
        System.out.println(student.getName()); // kalder nedarvet metode
    }
}