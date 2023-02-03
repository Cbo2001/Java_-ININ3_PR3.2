package sebastian_z.devices;

import sebastian_z.creatures.Human;

public class Electric extends Car{

    public Electric(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }

    @Override
    public void refuel() {
        System.out.println("1. Rozpoczęcie procedury ładowania.");
        System.out.println("2. Z sieci prąd płynie.");
        System.out.println("3. Full, akumulator ciepły.");
        System.out.println(" siuuuuu ");
        System.out.println(" ");
    }
}
