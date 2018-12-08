
package mypackage;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@javax.jws.WebService(name = "WebService", targetNamespace = "http://example/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod(operationName = "getavailable_seats")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getavailable_seats", targetNamespace = "http://example/", className = "mypackage.GetavailableSeats")
    @ResponseWrapper(localName = "getavailable_seatsResponse", targetNamespace = "http://example/", className = "mypackage.GetavailableSeatsResponse")
    @Action(input = "http://example/WebService/getavailable_seatsRequest", output = "http://example/WebService/getavailable_seatsResponse")
    public int getavailableSeats(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSeatPrice", targetNamespace = "http://example/", className = "mypackage.GetSeatPrice")
    @ResponseWrapper(localName = "getSeatPriceResponse", targetNamespace = "http://example/", className = "mypackage.GetSeatPriceResponse")
    @Action(input = "http://example/WebService/getSeatPriceRequest", output = "http://example/WebService/getSeatPriceResponse")
    public String getSeatPrice(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}
