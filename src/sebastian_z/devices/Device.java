package sebastian_z.devices;

import sebastian_z.creatures.Human;

public abstract class Device {

    public String model;
    public String producer;
    public Integer yearOfProduction;
    public Double value;

    public Device(String producer, String model, Integer yearOfProduction) {
        this.model = this.model;
        this.producer = this.producer;
        this.yearOfProduction = this.yearOfProduction;
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
