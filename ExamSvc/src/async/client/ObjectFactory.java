
package async.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the async.client package. 
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

    private final static QName _ReservationProcessResponse_QNAME = new QName("http://asu.dgtu.donetsk.ua/ex/students", "ReservationProcessResponse");
    private final static QName _ReservationProcess_QNAME = new QName("http://asu.dgtu.donetsk.ua/ex/students", "ReservationProcess");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: async.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReservationProcess }
     * 
     */
    public ReservationProcess createReservationProcess() {
        return new ReservationProcess();
    }

    /**
     * Create an instance of {@link ReservationProcessResponse }
     * 
     */
    public ReservationProcessResponse createReservationProcessResponse() {
        return new ReservationProcessResponse();
    }

    /**
     * Create an instance of {@link VideoCard }
     * 
     */
    public VideoCard createVideoCard() {
        return new VideoCard();
    }

    /**
     * Create an instance of {@link UserOrderReserve }
     * 
     */
    public UserOrderReserve createUserOrderReserve() {
        return new UserOrderReserve();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationProcessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asu.dgtu.donetsk.ua/ex/students", name = "ReservationProcessResponse")
    public JAXBElement<ReservationProcessResponse> createReservationProcessResponse(ReservationProcessResponse value) {
        return new JAXBElement<ReservationProcessResponse>(_ReservationProcessResponse_QNAME, ReservationProcessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationProcess }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asu.dgtu.donetsk.ua/ex/students", name = "ReservationProcess")
    public JAXBElement<ReservationProcess> createReservationProcess(ReservationProcess value) {
        return new JAXBElement<ReservationProcess>(_ReservationProcess_QNAME, ReservationProcess.class, null, value);
    }

}
