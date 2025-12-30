package models;

public abstract class Person implements Payable, Comparable<Person> {
    protected int id;
    protected String name;
    protected String surname;

    private static int nextId = 1;
    public Person() {
        this.id = nextId++;
    }
    public Person(String name, String surname){
        this();
        this.name = name;
        this.surname = surname;
    }
    public int getId() {
        return id;
    }
    public abstract String getPosition();

    public abstract double getPaymentAmoun();

    @Override
    public String toString(){
        return id + ". " + name + " " + surname;
    }

    @Override
    public int compareTo(Person o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount()) ;
    }
}
