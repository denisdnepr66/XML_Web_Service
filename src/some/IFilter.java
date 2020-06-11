package some;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Date;
import java.util.List;

@WebService(targetNamespace = "http:/filter", name = "IFilter")
public interface IFilter {
    @WebMethod
    List<Person> byLastName(String lastName);
    @WebMethod
    List<Person> byDate(Date date);
}