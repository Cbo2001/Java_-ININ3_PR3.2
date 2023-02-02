package sebastian_z.devices;

import sebastian_z.creatures.Human;

public abstract class Device {

    public String model;
    public String producer;
    public Integer yearOfProduction;
    public Double value;

    public Device(String model, String producer, Integer yearOfProduction, Double value) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.value = 0.0;
    }

    @Override
    public String toString() {
        return "Device{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public  abstract  void turnOn();


    public abstract void sell(Human seller, Human buyer, Double price);
}
