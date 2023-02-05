package sebastian_z.devices;

public class Application {

    String name;
    Double version;
    Double price;

    public Application(String name, Double version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\'' +
                ", version=" + version +
                ", price=" + price +
                '}';
    }
}
