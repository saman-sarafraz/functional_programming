package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static stream._Stream.Gender.*;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Ali", MALE, 20),
                new Person("Ahmad", MALE, 25),
                new Person("Zahra", FEMALE, 22),
                new Person("Mohammad", MALE, 30),
                new Person("Fatemeh", FEMALE, 32)
        );

        Predicate<Person> ageGreaterThan25 = person -> person.getAge() > 25;
        people.stream()
                .filter(ageGreaterThan25)
                .forEach(System.out::println);

        System.out.println(
                people.stream()
                        .anyMatch(person -> person.getAge() == 20)
        );
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
