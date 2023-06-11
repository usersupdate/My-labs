package sample.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

public class ShopClient {

    private final static QName SHOWCATALOG_QNAME = new QName(
            "http://asu.dgtu.donetsk.ua/ex/passexam", "ShowCatalog"
    );

    private static URL getWSDLURL(String urlStr) {
        URL url = null;
        try {
            url = new URL(urlStr);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return url;
    }

    private void showShopCatalog(ShopCatalog catalog) {
        System.out.println("Welcome to VideCard Shop Catalog!!!");
        for (int i = 0; i < catalog.getVideCardCatalog().size(); i++) {
            VideoCard videoCard = catalog.getVideCardCatalog().get(i);
            int quantityOnStock = catalog.getQuantityStock().get(i);
            System.out.println(
                    "ID_CODE = " + videoCard.getId() +
                    " / FIRM = " + videoCard.getFirm() +
                    " / MODEL = " + videoCard.getModel() +
                    " / RAM TYPE = " + videoCard.getRamType() +
                    " / RAM GB = " + videoCard.getRamGB() +
                    " / GPU Frequency Mhz = " + videoCard.getGPUFrequencyMhz() +
                    " / PRICE = " + videoCard.getPrice() + "נ." +
                    " / ON STOCK = " + quantityOnStock + "רע."
            );
        }
    }

    private void process(URL url) {
        ShowCatalog service = new ShowCatalog(url, SHOWCATALOG_QNAME);
        ShopService shopSvcPort = service.getShowCatalogPort();
        ShopCatalog assortment = shopSvcPort.getShopCatalog();
        showShopCatalog(assortment);
    }

    public static void main(String[] args) {
        URL url = getWSDLURL("http://localhost:8081/ShopSvcWeb/ShowCatalog?wsdl");
        ShopClient client = new ShopClient();
        client.process(url);
    }
}
