package some;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import client.FilterService;
import client.Filter;
import client.Person;

import javax.print.DocFlavor;

public class FilterTest {

    private  final URL url;
    private  final FilterService SERVICE;
    private  final Filter I_FILTER;

    public FilterTest() throws MalformedURLException {

        url = new URL("http://localhost:8090/filter?wsdl");
        SERVICE = new FilterService(url);
        I_FILTER = SERVICE.getFilterPort();
    }

    @Test
    public void testByDate(){

        List<Person> res = I_FILTER.byDate(
                new XMLGregorianCalendarImpl(
                        new GregorianCalendar(1999, Calendar.JULY,11)));
        Assert.assertEquals(2, res.size());
    }

    @Test
    public void testBySurname() {
        List<Person> res = I_FILTER.byLastName("Shyshliannykov");
        Assert.assertEquals(1, res.size());

        List<Person> res1 = I_FILTER.byLastName("Shyshliannykov");
        Assert.assertEquals("Shyshliannykov", res1.get(0).getLastName());
    }
}
