package async.client;

import javax.xml.namespace.QName;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ReservationGoodsClient {
    private final static QName RESERVATION_GOODS_QNAME = new QName(
            "http://asu.dgtu.donetsk.ua/ex/students", "ReservationGoods"
    );

    class ReserveGoodsAsyncHandler implements AsyncHandler<ReservationProcessResponse> {
        private ReservationProcessResponse response;

        @Override
        public void handleResponse(Response<ReservationProcessResponse> res) {
            try {
                response = res.get(2000, TimeUnit.MILLISECONDS);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        public UserOrderReserve getResponse() {
            return response.getReturn();
        }
    }

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

    public UserOrderReserve processCallback(URL url, Firm choiceFirm, String choiceModel, int choiceCount) {
        ReservationGoods svc = new ReservationGoods(url, RESERVATION_GOODS_QNAME);
        ReservationGoodsService port = svc.getReservationGoodsPort();
        ReserveGoodsAsyncHandler asyncHandler = new ReserveGoodsAsyncHandler();
        Future<?> futureResponse = port.reservationProcessAsync(
                choiceFirm,
                choiceModel,
                choiceCount,
                asyncHandler
        );

        while (!futureResponse.isDone()) {
            try {
                System.out.println("Reservation VideoCard.....");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        UserOrderReserve reserve = asyncHandler.getResponse();
        return reserve;
    }

    private static void showUserOrderReserve(UserOrderReserve reserve) {
        if (reserve != null) {
            VideoCard videoCard = reserve.getVideoCard();
            int count = reserve.getCount();
            double orderPrice = reserve.getOrderPrice();
            System.out.println("\nSuccessfully! your order has been added to the reserve");
            System.out.println("Reservation info:");
            System.out.println(
                    "ID_CODE = " + videoCard.getId() +
                            " / FIRM = " + videoCard.getFirm() +
                            " / MODEL = " + videoCard.getModel() +
                            " / RAM TYPE = " + videoCard.getRamType() +
                            " / RAM GB = " + videoCard.getRamGB() +
                            " / GPU Frequency Mhz = " + videoCard.getGPUFrequencyMhz() +
                            " / PRICE = " + videoCard.getPrice() + "נ." +
                            " / COUNT = " + count + "רע." +
                            " / TOTAL PRICE = " + orderPrice + "נ."
            );
        } else {
            System.out.println("\nFailure! your order has been NOT added to the reserve");
        }
    }

    public static void main(String[] args) {
        // input Data
        Firm choiceFirm = Firm.MSI;
        String choiceVideoCard = "RTX 3050 GAMING X 8G";
        int choiceCount = 2;
        //
        URL url = getWSDLURL("http://localhost:8082/ReservationGoods?wsdl");
        ReservationGoodsClient client = new ReservationGoodsClient();
        UserOrderReserve userLaptopReserve = client.processCallback(
                url,
                choiceFirm,
                choiceVideoCard,
                choiceCount
        );
        showUserOrderReserve(userLaptopReserve);
    }
}
