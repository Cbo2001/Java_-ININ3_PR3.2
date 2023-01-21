package devices;

public class Car {
    final String producer;
    public String model;

    public Integer yearOfProduction;
    public Double millage;


    public Car(String producer, String model, Integer yearOfProduction, Double millage) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.millage = millage;
    }


}
