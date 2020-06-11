package some;
import java.util.ArrayList;
import java.util.Date;

public class Person {
    public String firstName;
    public String lastName;
    public Date dateOfBirth;

    Person(String fn, String ln, Date d){
        firstName = fn;
        lastName = ln;
        dateOfBirth = d;
    }

    public static ArrayList<Person> generatePerson(){
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Denys","Shyshliannykov", new Date(2001,11,23)));
        list.add(new Person("Irena","Kurganova", new Date(2000,9,13)));
        list.add(new Person("Maksym","Lyskov", new Date(2002,7,12)));
        return list;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

}
