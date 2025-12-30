package models;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Employee("John", "Lennon", "Manager", 27045.78));
        people.add(new Student("Ringo", "Starr", 2.0));
        people.add(new Student("Paul", "McCartney", 3.2));
        people.add(new Employee("George", "Harrison", "Developer", 50000.00));

        Collections.sort(people);


        PrintData(people);
    }
    public static void PrintData(Iterable<Person> people){
        for (Person p : people) {
            System.out.printf(
                    "%s earns %.2f tenge%n",
                    p.toString(),
                    p.getPaymentAmount()
            );
        }
      }
    }



