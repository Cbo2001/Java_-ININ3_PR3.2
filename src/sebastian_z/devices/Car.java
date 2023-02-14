package sebastian_z.devices;

import sebastian_z.creatures.Human;
import sebastian_z.Salleable;

import java.util.ArrayList;

import static java.awt.PageAttributes.MediaType.B;
import static javax.print.attribute.standard.MediaSizeName.A;

public abstract class Car extends Device implements Salleable {

    public Double millage;
    public Double value;

    public ArrayList<Human> carOwners = new ArrayList<>();

    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.millage = 0.0;
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
    public void sell(Human seller, Human buyer, Double price) throws Exception {

        if (!seller.hasCar(this)) {
            throw new Exception("Co chcesz sprzedać? Powietrze!");
        }
        else if (!buyer.emptySpaceInTheGarage()) {
            throw new Exception("Typie gdzie postawisz te auto? Na strychu!");
        }
        else if(buyer.cash >= price){
            throw new Exception("Goń się Typie! Nie masz Hajsu Kolo");
        }
        buyer.addCar(this);
            seller.cash += price;
            buyer.cash -= price;
            buyer.addCar(this);
            seller.removeCar(this);
            System.out.println("Transakcja zakończona: POMYŚLNIE");
        }


    @Override
    public String toString() {
        return "Car{" +
                "millage=" + millage +
                ", value=" + value +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public abstract void refuel();
}

