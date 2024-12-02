package opgave01.application.model;

public class Customer {
    private String pronouns;
    private String fullName;
    private boolean status;

    public Customer(String pronouns, String fullName){
        this.pronouns = pronouns;
        this.fullName = fullName;
        this.status = true;
    }

    public String getPronouns() {
        return pronouns;
    }
    public String getFullName() {
        return fullName;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setPronouns(String pronouns) {
        this.pronouns = pronouns;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private String currentStatus(){
        if(status) {
            return "(active)";
        }
        return "(inactive)";
    }

    @Override
    public String toString(){
        return String.format("%s %s %s", pronouns, fullName, currentStatus());
    }
}
