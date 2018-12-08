
package mypackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
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

    private final static QName _GetavailableSeats_QNAME = new QName("http://example/", "getavailable_seats");
    private final static QName _GetSeatPrice_QNAME = new QName("http://example/", "getSeatPrice");
    private final static QName _GetavailableSeatsResponse_QNAME = new QName("http://example/", "getavailable_seatsResponse");
    private final static QName _GetSeatPriceResponse_QNAME = new QName("http://example/", "getSeatPriceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSeatPrice }
     * 
     */
    public GetSeatPrice createGetSeatPrice() {
        return new GetSeatPrice();
    }

    /**
     * Create an instance of {@link GetavailableSeatsResponse }
     * 
     */
    public GetavailableSeatsResponse createGetavailableSeatsResponse() {
        return new GetavailableSeatsResponse();
    }

    /**
     * Create an instance of {@link GetavailableSeats }
     * 
     */
    public GetavailableSeats createGetavailableSeats() {
        return new GetavailableSeats();
    }

    /**
     * Create an instance of {@link GetSeatPriceResponse }
     * 
     */
    public GetSeatPriceResponse createGetSeatPriceResponse() {
        return new GetSeatPriceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetavailableSeats }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "getavailable_seats")
    public JAXBElement<GetavailableSeats> createGetavailableSeats(GetavailableSeats value) {
        return new JAXBElement<GetavailableSeats>(_GetavailableSeats_QNAME, GetavailableSeats.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSeatPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "getSeatPrice")
    public JAXBElement<GetSeatPrice> createGetSeatPrice(GetSeatPrice value) {
        return new JAXBElement<GetSeatPrice>(_GetSeatPrice_QNAME, GetSeatPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetavailableSeatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "getavailable_seatsResponse")
    public JAXBElement<GetavailableSeatsResponse> createGetavailableSeatsResponse(GetavailableSeatsResponse value) {
        return new JAXBElement<GetavailableSeatsResponse>(_GetavailableSeatsResponse_QNAME, GetavailableSeatsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSeatPriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "getSeatPriceResponse")
    public JAXBElement<GetSeatPriceResponse> createGetSeatPriceResponse(GetSeatPriceResponse value) {
        return new JAXBElement<GetSeatPriceResponse>(_GetSeatPriceResponse_QNAME, GetSeatPriceResponse.class, null, value);
    }

}
