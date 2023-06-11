
package async.client;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ReservationGoodsService", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/students")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReservationGoodsService {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns javax.xml.ws.Response<async.client.ReservationProcessResponse>
     */
    @WebMethod(operationName = "ReservationProcess")
    @RequestWrapper(localName = "ReservationProcess", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/students", className = "async.client.ReservationProcess")
    @ResponseWrapper(localName = "ReservationProcessResponse", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/students", className = "async.client.ReservationProcessResponse")
    public Response<ReservationProcessResponse> reservationProcessAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        Firm arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "ReservationProcess")
    @RequestWrapper(localName = "ReservationProcess", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/students", className = "async.client.ReservationProcess")
    @ResponseWrapper(localName = "ReservationProcessResponse", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/students", className = "async.client.ReservationProcessResponse")
    public Future<?> reservationProcessAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        Firm arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<ReservationProcessResponse> asyncHandler);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns async.client.UserOrderReserve
     */
    @WebMethod(operationName = "ReservationProcess")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ReservationProcess", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/students", className = "async.client.ReservationProcess")
    @ResponseWrapper(localName = "ReservationProcessResponse", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/students", className = "async.client.ReservationProcessResponse")
    @Action(input = "http://asu.dgtu.donetsk.ua/ex/students/ReservationGoodsService/ReservationProcessRequest", output = "http://asu.dgtu.donetsk.ua/ex/students/ReservationGoodsService/ReservationProcessResponse")
    public UserOrderReserve reservationProcess(
        @WebParam(name = "arg0", targetNamespace = "")
        Firm arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

}