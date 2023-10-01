package declarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Declarative {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Ali", Gender.MALE, 20),
                new Person("Ahmad", Gender.MALE, 25),
                new Person("Zahra", Gender.FEMALE, 22),
                new Person("Mohammad", Gender.MALE, 30),
                new Person("Fatemeh", Gender.FEMALE, 32)
        );

        // Imperative approach
        System.out.println("// Imperative approach");
        List<Person> males = new ArrayList<>();
        for (Person person : people) {
            if(person.getGender().equals(Gender.MALE)) {
                males.add(person);
            }
        }

        for (Person male : males) {
            System.out.println(male);
        }

        // Declarative approach
        System.out.println("// Declarative approach");
        Predicate<Person> personPredicate =
                person -> person.getGender().equals(Gender.MALE);
        people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    static class Person {

        private final String name;
        private final Gender gender;
        private final int age;

        Person(String name, Gender gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Gender getGender() {
            return gender;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    ", age=" + age +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
