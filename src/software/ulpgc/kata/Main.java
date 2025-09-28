package software.ulpgc.kata;

import java.time.LocalDate;

public class Main {
    static void main(String[] args) {
        Person person = new Person("Paco", LocalDate.of(2007, 3, 13));
        System.out.println(person);
    }
}
