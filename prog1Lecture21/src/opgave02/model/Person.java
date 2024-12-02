package opgave02.model;

import java.util.ArrayList;

public class Person {
    private final String name;
    private final int age;

    private ArrayList<Gift> givesList = new ArrayList<>();
    private ArrayList<Gift> recievesList = new ArrayList<>();

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public double valueOfGivenGifts(){
        ArrayList<Gift> list = new ArrayList<>(givesList);
        double sum = 0;
        for(Gift gift : list) {
            sum += gift.getPrice();
        }
        return sum;
    }

    public void addRecievedGift(Gift gift){
        if(!recievesList.contains(gift)) {
            recievesList.add(gift);
        }
    }
    public void addGivenGift(Gift gift){
        if(!givesList.contains(gift)){
            givesList.add(gift);
        }
    }
    public ArrayList<Person> listOfGiftGivers(){
        ArrayList<Person> listOfPersons = new ArrayList<>();
        for(Gift gift : recievesList){
            listOfPersons.add(gift.getGiver());
        }
        return listOfPersons;
    }

    @Override
    public String toString(){
        return String.format("Name: %s%nAge: %s%nValue of given gifts: %f", this.name, this.age, valueOfGivenGifts());
    }
}
