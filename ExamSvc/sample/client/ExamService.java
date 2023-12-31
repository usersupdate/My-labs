
package sample.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ExamService", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ExamService {


    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Test")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Test", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam", className = "sample.client.Test")
    @ResponseWrapper(localName = "TestResponse", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam", className = "sample.client.TestResponse")
    @Action(input = "http://asu.dgtu.donetsk.ua/ex/passexam/ExamService/TestRequest", output = "http://asu.dgtu.donetsk.ua/ex/passexam/ExamService/TestResponse")
    public int test(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns sample.client.ProductCatalog
     */
    @WebMethod(operationName = "???")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "???", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam", className = "sample.client._003f_003f_003f")
    @ResponseWrapper(localName = "???Response", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam", className = "sample.client._003f_003f_003fResponse")
    @Action(input = "http://asu.dgtu.donetsk.ua/ex/passexam/ExamService/???Request", output = "http://asu.dgtu.donetsk.ua/ex/passexam/ExamService/???Response")
    public ProductCatalog _003f_003f_003f();

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "BuyLaptop")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "BuyLaptop", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam", className = "sample.client.BuyLaptop")
    @ResponseWrapper(localName = "BuyLaptopResponse", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam", className = "sample.client.BuyLaptopResponse")
    @Action(input = "http://asu.dgtu.donetsk.ua/ex/passexam/ExamService/BuyLaptopRequest", output = "http://asu.dgtu.donetsk.ua/ex/passexam/ExamService/BuyLaptopResponse")
    public String buyLaptop(
        @WebParam(name = "arg0", targetNamespace = "")
        ProductCatalog arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Laptop arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns sample.client.ProductCatalog
     */
    @WebMethod(operationName = "CreateCatalog")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CreateCatalog", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam", className = "sample.client.CreateCatalog")
    @ResponseWrapper(localName = "CreateCatalogResponse", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam", className = "sample.client.CreateCatalogResponse")
    @Action(input = "http://asu.dgtu.donetsk.ua/ex/passexam/ExamService/CreateCatalogRequest", output = "http://asu.dgtu.donetsk.ua/ex/passexam/ExamService/CreateCatalogResponse")
    public ProductCatalog createCatalog(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Laptop> arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        List<Integer> arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<sample.client.Laptop>
     */
    @WebMethod(operationName = "SearchLaptop")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchLaptop", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam", className = "sample.client.SearchLaptop")
    @ResponseWrapper(localName = "SearchLaptopResponse", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam", className = "sample.client.SearchLaptopResponse")
    @Action(input = "http://asu.dgtu.donetsk.ua/ex/passexam/ExamService/SearchLaptopRequest", output = "http://asu.dgtu.donetsk.ua/ex/passexam/ExamService/SearchLaptopResponse")
    public List<Laptop> searchLaptop(
        @WebParam(name = "arg0", targetNamespace = "")
        ProductCatalog arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns sample.client.ExamStatement
     */
    @WebMethod(operationName = "Pass")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Pass", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam", className = "sample.client.Pass")
    @ResponseWrapper(localName = "PassResponse", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam", className = "sample.client.PassResponse")
    @Action(input = "http://asu.dgtu.donetsk.ua/ex/passexam/ExamService/PassRequest", output = "http://asu.dgtu.donetsk.ua/ex/passexam/ExamService/PassResponse")
    public ExamStatement pass(
        @WebParam(name = "arg0", targetNamespace = "")
        ExamStatement arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Student arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns sample.client.ExamStatement
     */
    @WebMethod(operationName = "CreateStatement")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CreateStatement", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam", className = "sample.client.CreateStatement")
    @ResponseWrapper(localName = "CreateStatementResponse", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam", className = "sample.client.CreateStatementResponse")
    @Action(input = "http://asu.dgtu.donetsk.ua/ex/passexam/ExamService/CreateStatementRequest", output = "http://asu.dgtu.donetsk.ua/ex/passexam/ExamService/CreateStatementResponse")
    public ExamStatement createStatement(
        @WebParam(name = "arg0", targetNamespace = "")
        Subject arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        List<Student> arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetCatalogInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetCatalogInfo", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam", className = "sample.client.GetCatalogInfo")
    @ResponseWrapper(localName = "GetCatalogInfoResponse", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam", className = "sample.client.GetCatalogInfoResponse")
    @Action(input = "http://asu.dgtu.donetsk.ua/ex/passexam/ExamService/GetCatalogInfoRequest", output = "http://asu.dgtu.donetsk.ua/ex/passexam/ExamService/GetCatalogInfoResponse")
    public String getCatalogInfo(
        @WebParam(name = "arg0", targetNamespace = "")
        ProductCatalog arg0);

}
