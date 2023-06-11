package async;

public class ShopCatalog {
    private VideoCard[] videCardCatalog;
    private int[] quantityStock;

    public ShopCatalog() {
    }

    public ShopCatalog(VideoCard[] videCardCatalog, int[] quantityStock) {
        this.videCardCatalog = videCardCatalog;
        this.quantityStock = quantityStock;
    }

    public VideoCard[] getVideCardCatalog() {
        return videCardCatalog;
    }

    public void setVideCardCatalog(VideoCard[] videCardCatalog) {
        this.videCardCatalog = videCardCatalog;
    }

    public int[] getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(int[] quantityStock) {
        this.quantityStock = quantityStock;
    }

    public boolean setCountOnStock(int index, int value) {
        try {
            quantityStock[index] = value;
            return true;
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return false;
    }
}
