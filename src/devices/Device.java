package devices;

import creatures.Human;

public abstract class Device {

    public String model;
    public String producer;
    public Integer yearOfProduction;

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
