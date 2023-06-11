package sample;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService(serviceName = "ShowCatalog", portName = "ShowCatalogPort", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public class ShopService {
    private static int[] quantityStock = {10, 20, 30, 4, 4, 2, 1, 0};
    private static VideoCard[] VideCard = {
            new VideoCard("001", Firm.PALIT, "RTX 2060 SUPER DUAL 8G", RamType.GDDR6, 8, 1470, 30990),
            new VideoCard("002", Firm.MSI, "RTX 3050 GAMING X 8G", RamType.GDDR6, 8, 1845, 29990),
            new VideoCard("003", Firm.GIGABYTE, "RTX 3060 GAMING OC-12GD", RamType.GDDR6, 12, 1837, 38990),
            new VideoCard("004", Firm.PALIT, "GTX 1650 StormX", RamType.GDDR5, 4, 1485, 13990),
            new VideoCard("005", Firm.MSI, "GTX 1650 D6 GAMING X", RamType.GDDR6, 4, 1680, 31590),
            new VideoCard("006", Firm.GIGABYTE, "RTX 2060 6GD", RamType.GDDR6, 8, 1470, 30990),
            new VideoCard("007", Firm.MSI, "GeForce GT 1030", RamType.GDDR4, 2, 1189, 7390),
            new VideoCard("008", Firm.GIGABYTE, "GTX 1650 4GL", RamType.GDDR5, 4, 1665, 14890)
    };
    private static ShopCatalog shopCatalog = new ShopCatalog(VideCard, quantityStock);

    @WebMethod(operationName = "GetShopCatalog")
    public ShopCatalog getShopCatalog() {
        return shopCatalog;
    }

}