package opgave02.test;

import opgave02.model.Gift;
import opgave02.model.Person;

public class Test {
    public static void main(String[] args) {
        Person emil = new Person("Emil", 21);
        Person maria = new Person("Maria", 22);

        Gift jewerly = new Gift("Jewerly", 595.95, emil);
        jewerly.setReciever(maria);

        System.out.println(emil.toString());
        maria.listOfGiftGivers();
    }
}
