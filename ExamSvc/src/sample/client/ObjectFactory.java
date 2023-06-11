
package sample.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sample.client package. 
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

    private final static QName _GetShopCatalogResponse_QNAME = new QName("http://asu.dgtu.donetsk.ua/ex/passexam", "GetShopCatalogResponse");
    private final static QName _GetShopCatalog_QNAME = new QName("http://asu.dgtu.donetsk.ua/ex/passexam", "GetShopCatalog");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sample.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetShopCatalog }
     * 
     */
    public GetShopCatalog createGetShopCatalog() {
        return new GetShopCatalog();
    }

    /**
     * Create an instance of {@link GetShopCatalogResponse }
     * 
     */
    public GetShopCatalogResponse createGetShopCatalogResponse() {
        return new GetShopCatalogResponse();
    }

    /**
     * Create an instance of {@link VideoCard }
     * 
     */
    public VideoCard createVideoCard() {
        return new VideoCard();
    }

    /**
     * Create an instance of {@link ShopCatalog }
     * 
     */
    public ShopCatalog createShopCatalog() {
        return new ShopCatalog();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShopCatalogResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asu.dgtu.donetsk.ua/ex/passexam", name = "GetShopCatalogResponse")
    public JAXBElement<GetShopCatalogResponse> createGetShopCatalogResponse(GetShopCatalogResponse value) {
        return new JAXBElement<GetShopCatalogResponse>(_GetShopCatalogResponse_QNAME, GetShopCatalogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShopCatalog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asu.dgtu.donetsk.ua/ex/passexam", name = "GetShopCatalog")
    public JAXBElement<GetShopCatalog> createGetShopCatalog(GetShopCatalog value) {
        return new JAXBElement<GetShopCatalog>(_GetShopCatalog_QNAME, GetShopCatalog.class, null, value);
    }

}
