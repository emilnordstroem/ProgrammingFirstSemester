package opgave02.model;

public class Gift {
    private final String description;
    private double price;

    private Person giver;
    private Person reciever;

    public Gift(String description, double price, Person giver){
        this.description = description;
        this.price = price;
        this.giver = giver;
        giver.addGivenGift(this);
    }

    public void setReciever(Person person){
        if(reciever == null){
            this.reciever = person;
            person.addRecievedGift(this);
        }
    }

    public Person getGiver() {
        return giver;
    }

    public double getPrice() {
        return price;
    }
}
