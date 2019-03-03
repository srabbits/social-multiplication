package microservices.book.socialmultiplication.model;

public class ConstructorExample {
private String name;
private int dogYears;
private final int DOG_YEARS_PER_YEAR = 7;

    public ConstructorExample(String name, int age){
       this.name = name;
        this.dogYears = age * DOG_YEARS_PER_YEAR;
    }

    public ConstructorExample(String name){
        this(name, 5);
    }

    public ConstructorExample(){
        this("BigMac2");
    }

    @Override
    public String toString() {
        return "ConstructorExample{" +
                "name='" + name + '\'' +
                ", dogYears=" + dogYears +
                '}';
    }
}
