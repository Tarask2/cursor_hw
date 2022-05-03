package hw10;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of(
                        new Person("Olena", 19, Gender.FEMALE, Country.UKRAINE),
                        new Person("Marek", 50, Gender.MALE, Country.POLAND),
                        new Person("Rasine", 65, Gender.FEMALE, Country.POLAND),
                        new Person("Cherina", 42, Gender.FEMALE, Country.FRANCE),
                        new Person("Bridgett", 18, Gender.FEMALE, Country.FRANCE),
                        new Person("Jaron", 42, Gender.MALE, Country.ISRAEL),
                        new Person("Namir", 18, Gender.MALE, Country.ISRAEL),
                        new Person("John", 10, Gender.MALE, Country.USA),
                        new Person("Jane", 78, Gender.FEMALE, Country.USA),
                        new Person("Alonzo", 12, Gender.MALE, Country.ARGENTINA),
                        new Person("Azael", 43, Gender.FEMALE, Country.ARGENTINA),
                        new Person("Thomas", 12, Gender.MALE, Country.AUSTRALIA),
                        new Person("Brittney", 43, Gender.FEMALE, Country.AUSTRALIA)
                )
                .filter(person -> person.getAge() >= 18 && person.getAge() < 60)
                .map(person -> person.getName() + " - " + person.getGender())
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    public static class Person {
        private final String name;
        private final int age;
        private final Gender gender;
        private final Country country;

        public Person(String name, int age, Gender gender, Country country) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.country = country;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        public Country getCountry() {
            return country;
        }

        @Override
        public String toString() {
            return name + '(' + age + ')';
        }
    }

    public enum Gender {
        MALE, FEMALE
    }

    public enum Country {
        UKRAINE("Ukraine", Continent.EUROPE),
        POLAND("Poland", Continent.EUROPE),
        FRANCE("France", Continent.EUROPE),
        CHINA("China", Continent.ASIA),
        INDIA("India", Continent.ASIA),
        ISRAEL("Israel", Continent.ASIA),
        EGYPT("Egypt", Continent.AFRICA),
        ALGERIA("Algeria", Continent.AFRICA),
        ANGOLA("Angola", Continent.AFRICA),
        USA("USA", Continent.NORTH_AMERICA),
        CANADA("Canada", Continent.NORTH_AMERICA),
        MEXICO("Mexico", Continent.NORTH_AMERICA),
        BRAZIL("Brazil", Continent.SOUTH_AMERICA),
        ARGENTINA("Argentina", Continent.SOUTH_AMERICA),
        BOLIVIA("Bolivia", Continent.SOUTH_AMERICA),
        AUSTRALIA("Australia", Continent.OCEANIA),
        FIJI("Fiji", Continent.OCEANIA),
        NEW_ZEALAND("New Zealand", Continent.OCEANIA),
        ;

        private final String country;
        private final Continent continent;

        Country(String country, Continent continent) {
            this.country = country;
            this.continent = continent;
        }

        public String getCountry() {
            return country;
        }

        public Continent getContinent() {
            return continent;
        }
    }

    public enum Continent {
        EUROPE, ASIA, AFRICA, OCEANIA, NORTH_AMERICA, SOUTH_AMERICA, ANTARCTICA
    }
}

