package sample;

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
}
