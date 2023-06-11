package async;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.Endpoint;

@WebService(serviceName = "ReservationGoods", portName = "ReservationGoodsPort", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/students")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public class ReservationGoodsService {
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

    private UserOrderReserve addToReserve(Firm choiceFirm, String choiceModel, int choiceCont) {
        int size = shopCatalog.getVideCardCatalog().length;
        for (int i = 0; i < size; i++) {
            VideoCard videoCardInCatalog = shopCatalog.getVideCardCatalog()[i];
            int quantityStock = shopCatalog.getQuantityStock()[i];
            if (choiceFirm == videoCardInCatalog.getFirm()
                    && choiceModel.equals(videoCardInCatalog.getModel())
                    && choiceCont <= quantityStock) {
                shopCatalog.setCountOnStock(i, quantityStock - choiceCont);
                return new UserOrderReserve(videoCardInCatalog, choiceCont);
            }
        }
        return null;
    }

    @WebMethod(operationName = "ReservationProcess")
    public UserOrderReserve reservationProcess(Firm choiceFirm, String choiceModel, int choiceCont) {
        try {
            Thread.sleep(1000 * 10);
            return addToReserve(choiceFirm, choiceModel, choiceCont);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String args[]) {
        Endpoint.publish("http://localhost:8082/ReservationGoods", new ReservationGoodsService());
    }
}
