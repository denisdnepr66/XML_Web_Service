
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ByDate_QNAME = new QName("http://some/", "byDate");
    private final static QName _ByDateResponse_QNAME = new QName("http://some/", "byDateResponse");
    private final static QName _ByLastName_QNAME = new QName("http://some/", "byLastName");
    private final static QName _ByLastNameResponse_QNAME = new QName("http://some/", "byLastNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ByDate }
     * 
     */
    public ByDate createByDate() {
        return new ByDate();
    }

    /**
     * Create an instance of {@link ByDateResponse }
     * 
     */
    public ByDateResponse createByDateResponse() {
        return new ByDateResponse();
    }

    /**
     * Create an instance of {@link ByLastName }
     * 
     */
    public ByLastName createByLastName() {
        return new ByLastName();
    }

    /**
     * Create an instance of {@link ByLastNameResponse }
     * 
     */
    public ByLastNameResponse createByLastNameResponse() {
        return new ByLastNameResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://some/", name = "byDate")
    public JAXBElement<ByDate> createByDate(ByDate value) {
        return new JAXBElement<ByDate>(_ByDate_QNAME, ByDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://some/", name = "byDateResponse")
    public JAXBElement<ByDateResponse> createByDateResponse(ByDateResponse value) {
        return new JAXBElement<ByDateResponse>(_ByDateResponse_QNAME, ByDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByLastName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://some/", name = "byLastName")
    public JAXBElement<ByLastName> createByLastName(ByLastName value) {
        return new JAXBElement<ByLastName>(_ByLastName_QNAME, ByLastName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByLastNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://some/", name = "byLastNameResponse")
    public JAXBElement<ByLastNameResponse> createByLastNameResponse(ByLastNameResponse value) {
        return new JAXBElement<ByLastNameResponse>(_ByLastNameResponse_QNAME, ByLastNameResponse.class, null, value);
    }

}
