package bitlab.bootcamp.chapter5.db.model;

public class Items {

    Long id;
    String name;
    String RAM;
    String SSD;
    String Processor;
    double price;

    public Items () {

    }
    public Items(Long id, String name, String RAM, String SSD, String processor, double price) {
        this.id = id;
        this.name = name;
        this.RAM = RAM;
        this.SSD = SSD;
        Processor = processor;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getSSD() {
        return SSD;
    }

    public void setSSD(String SSD) {
        this.SSD = SSD;
    }

    public String getProcessor() {
        return Processor;
    }

    public void setProcessor(String processor) {
        this.Processor = processor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
