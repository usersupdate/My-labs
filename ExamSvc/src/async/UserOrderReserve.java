package async;

public class UserOrderReserve {
    private VideoCard videoCard;
    private int count;
    private double orderPrice;

    public UserOrderReserve(VideoCard videoCard, int count) {
        this.videoCard = videoCard;
        this.count = count;
        this.orderPrice = videoCard.getPrice() * count;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }
}
