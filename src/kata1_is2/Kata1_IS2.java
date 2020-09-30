package kata1_is2;

import java.time.LocalDate;
import java.time.Month;

public class Kata1_IS2 {
    public static void main(String[] args) {
        Person person = new Person("Pepe", LocalDate.of(1999, Month.FEBRUARY, 10));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }
    
}
