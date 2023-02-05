package sebastian_z.devices;

import sebastian_z.creatures.Human;
import sebastian_z.Salleable;

import java.util.ArrayList;

public abstract class Car extends Device implements Salleable {

    public Double millage;
    public Double value;

    public ArrayList<Human> carOwners = new ArrayList<>();

    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.millage = 0.0;
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
}
    public void drive() {
        this.millage += 10.0;
        System.out.println("\nAktualny przebieg to: " + this.millage);
    }
    @Override
    public void sell(Human seller, Human buyer, Double price){

        if (!seller.hasCar(this)) {
            System.out.println("Co chcesz sprzedać? Powietrze!");
        }
        else if (!buyer.emptySpaceInTheGarage()) {
            System.out.println("Typie gdzie postawisz te auto? Na strychu!");
        }
        else if(buyer.cash < price){
            System.out.println("Goń się Typie! Nie masz Hajsu Kolo");
        }

        else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.addCar(this);
            seller.removeCar(this);
            System.out.println("Transakcja zakończona: POMYŚLNIE");
        }

    }
    public abstract void refuel();
}

