package some;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.*;
import java.util.stream.Collectors;

@WebService
public class Filter implements IFilter {
    public static List<Person> list = Person.generatePerson();

    @WebMethod
    @Override
    public List<Person> byLastName(String lastName) {
        return list.stream().filter(person -> person.getLastName().equals(lastName)).collect(Collectors.toList());
    }

    @WebMethod
    @Override
    public List<Person> byDate(Date date) {
        return list.stream().filter(person -> person.getDateOfBirth().getYear() > date.getYear()).collect(Collectors.toList());
    }
}
