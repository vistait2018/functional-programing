package com.functional;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingPeople {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Wale","male",23),
                new Person("Kemi","female",12),
                new Person("Bode","male",23),
                new Person("pearl","female",13),
                new Person("kaizen","female",9)
        );

        System.out.println("Print sorted people");
        sortPeople(people);

        System.out.println("===============================");
        System.out.println("===============================");

        System.out.println("print people whose name starts with p");
        printWithCondion(people,(person)-> person.getName().startsWith("p"));
        System.out.println("===============================");
        System.out.println("===============================");


        System.out.println("print people whose name starts with k");
        printWithCondion(people,(person)-> person.getName().startsWith("p"));
        System.out.println("===============================");
        System.out.println("===============================");
    }

    private static void printWithCondion(List<Person> people, PrintCondition condition) {
        for(Person p :people){
            if(condition.test(p)) System.out.println(p);
        }
    }

    private static void sortPeople(List<Person> people) {
        Collections.sort(people,(person1,person2)->person1.getName().compareToIgnoreCase(person2.getName()));
        System.out.println(people);
    }

    public interface PrintCondition {
        boolean test(Person condition);
    }
}
