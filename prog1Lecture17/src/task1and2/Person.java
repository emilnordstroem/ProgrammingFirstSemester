package task1and2;

public class Person {
    private String name;
    private String title;
    private boolean senior;

    public Person(String name, String title, boolean senior){
        this.name = name;
        this.title = title;
        this.senior = senior;
    }

    @Override
    public String toString(){
        String string = String.format("%s %s", title, name);
        if(senior){
            string += " (senior)";
        }
        return string;
    }
}
