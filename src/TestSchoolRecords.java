// Eddie Hart
// April 12th, 2024
// Exam 3
// CSC 1060

import java.util.ArrayList;
import java.util.Arrays;

public class TestSchoolRecords {
    public static ArrayList<Person> isSubClassOfEmployee(ArrayList<Person> people) {
        ArrayList<Person> employees = new ArrayList<>();
        for (Person person : people) {
            if (person instanceof Employee) {
                employees.add(person);
            }
        }
        return employees;
    }

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>(Arrays.asList(
                new Student("Herberdinger", "18064 Poopville St, Greeley, CO", "(970) 983-1920", "herb.the.ding@yahoo.com", 0),
                new Student("Euclid", "241 Xipolitakis Ave, Athens, OH", "(970) 584-4012", "hellyeah@gmail.com", 2),
                new Staff("Jose", "7777 US Highway 34, Loveland, CO", "(720) 221-1256", "jose@jose.jose", "Maintenance and Janitors", 1000, "July 7th, 1972", "Head Janitor"),
                new Staff("Eugene", "1 Face Ave, Denver, CO", "(970) 563-1635", "eugene@school.org", "Administration", 4000, "June 17th, 2009", "Principal"),
                new Faculty("John", "1234 5th St, Fort Collins, CO", "(123) 456-7890", "john@doe.com", "Language Arts", 3500, "January 1st, 2024", "No Available Office Hours", 1),
                new Faculty("Pepe", "Homeless", "Doesn't like phones", "pepe@aol.com", "Social Studies", 2000, "February 5th, 2005", "Mon & Fri, 2pm-3pm", 0)));
        for (int i = 0; i < 6; i++) {
            System.out.println(people.get(i));
        }
        System.out.println("-----------------------------------------");
        System.out.println((isSubClassOfEmployee(people)));
    }
}
