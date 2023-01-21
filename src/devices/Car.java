package devices;

public class Car extends Device{
    final String producer;
    public String model;
    public Integer yearOfProduction;
    public Double millage;
    public Double value;


    public Car(String producer, String model, Integer yearOfProduction, Double millage) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.millage = millage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", millage=" + millage +
                ", value=" + value +
                '}';
    }
}
