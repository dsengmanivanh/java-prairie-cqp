package stream;


import stream.model.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {

    private List<Person> persons;

    public StreamOperations(List<Person> persons) {
        this.persons = persons;
    }

    public long countPersonsWithAge(int age) {
//        long count = 0;
//        for (Person person : persons) {
//            if (person.getAge() == age) {
//                count++;
//            }
//        }
//        return count;
        return persons.stream()
                .filter(person -> person.getAge() == age)
                .count();
    }

    public long countMarriedPeople() {
//        long count = 0;
//        for (Person person : persons) {
//            if (person.isMarried()) {
//                count++;
//            }
//        }
//        return count;
        return persons.stream()
                .filter(Person::isMarried)
                .count();
    }


    public List<Person> filterByLanguage(String language) {
//        ArrayList<Person> persons = new ArrayList<>();
//        for (Person person : this.persons) {
//            if (person.getLanguage().equals(language)) {
//                persons.add(person);
//            }
//        }
//        return persons;
        return persons.stream()
                .filter(person -> person.getLanguage().equals(language))
                .collect(Collectors.toList());
    }

    public List<Person> toUpperCaseAndSorted() {
//        ArrayList<Person> persons = new ArrayList<>();
//        for (Person person : this.persons) {
//            Person person1 = new Person();
//            person1.setLanguage(person.getLanguage().toUpperCase());
//            person1.setName(person.getName().toUpperCase());
//            person1.setSurname(person.getSurname().toUpperCase());
//            person1.setMarried(person.isMarried());
//            persons.add(person1);
//        }
//        return persons;
        return persons.stream()
                .map(person -> {
                    String surname = person.getSurname().toUpperCase();
                    String language = person.getLanguage().toUpperCase();
                    String name = person.getName().toUpperCase();
                    person.setSurname(surname);
                    person.setLanguage(language);
                    person.setName(name);
                    return person;
                })
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());

    }


}
