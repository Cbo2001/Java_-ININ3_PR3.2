package devices;

public class Car extends Device{

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

    @Override
    public void turnOn() {
        System.out.println("Przekręcam kluczyk");
        System.out.println("...czekam...");
        System.out.println("...modlę się w intencji akumulatora");
        System.out.println("ODPALA");
}}
