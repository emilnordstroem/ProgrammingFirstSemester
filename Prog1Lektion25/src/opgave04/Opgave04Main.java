package opgave04;

import opgave04.models.Person;
import opgave04.testdata.TestDataGenerator;

import javax.swing.*;
import java.util.ArrayList;

public class Opgave04Main {

    public static void main(String[] args) {
        ArrayList<Person> people1 = TestDataGenerator.generatePeople();
        System.out.println(people1);
        ArrayList<Person> people2 = TestDataGenerator.generatePeople();
        System.out.println(people2);
        System.out.println("-------------------------------------------");
        System.out.println(merge(people1, people2));
    }

    public static ArrayList<Person> merge(ArrayList<Person> people1, ArrayList<Person> people2) {
        ArrayList<Person> result = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;

        while(index1 < people1.size() & index2 < people2.size()){
            String person1Lastname = people1.get(index1).getLastname();
            String person2Lastname = people2.get(index2).getLastname();

            if(person1Lastname.compareTo(person2Lastname) > 0){
                result.add(people1.get(index1));
                index2++;
            } else if ((person1Lastname.compareTo(person2Lastname)) < 0) {
                result.add(people2.get(index2));
                index1++;
            } else {
                String person1Firstname = people1.get(index1).getFirstname();
                String person2Firstname = people2.get(index2).getFirstname();

                if(person1Firstname.compareTo(person2Firstname) > 0){
                    result.add(people1.get(index1));
                    index2++;
                } else {
                    result.add(people2.get(index2));
                    index1++;
                }
            }
        }
        return result;
    }
}
