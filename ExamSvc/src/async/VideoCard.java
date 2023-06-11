package async;

public class VideoCard {
    private String id;
    private Firm firm;
    private String model;
    private RamType ramType;
    private int ramGB;
    private int GPUFrequencyMhz;
    private double price;

    public VideoCard() {
    }


    public Firm getFirm() {
        return firm;
    }

    public void setFirm(Firm firm) {
        this.firm = firm;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public RamType getRamType() {
        return ramType;
    }

    public void setRamType(RamType ramType) {
        this.ramType = ramType;
    }

    public int getRamGB() {
        return ramGB;
    }

    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }


    public int getGPUFrequencyMhz() {
        return GPUFrequencyMhz;
    }

    public void setGPUFrequencyMhz(int GPUFrequencyMhz) {
        this.GPUFrequencyMhz = GPUFrequencyMhz;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public VideoCard(String id, Firm firm, String model, RamType ramType, int ramGB, int GPUFrequencyMhz, double price) {
        this.id = id;
        this.firm = firm;
        this.model = model;
        this.ramType = ramType;
        this.ramGB = ramGB;
        this.GPUFrequencyMhz = GPUFrequencyMhz;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
