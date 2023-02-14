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
        else if (!seller.lastCarOwner(this, seller)) {
            throw new Exception("To nie Twoje auto, Już je sprzedałeś");
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

    public boolean wasOwner(Human person) {
        return carOwners.contains(person);
    }

    public boolean hasSellCarTo(Human A, Human B) {
        boolean aHaveNow = false;
        boolean bHaveNow = false;
        if (carOwners.contains(A) && carOwners.contains(B)) {
            for (int i = 0; i < A.garage.length; i++) {
                if (A.garage[i] == this) {
                    aHaveNow = true;
                    break;
                }
            }
            for (int i = 0; i < B.garage.length; i++) {
                if (B.garage[i] == this) {
                    bHaveNow = true;
                    break;
                }
            }
        }
        return !aHaveNow && bHaveNow;
    }

    public int numberOfCarTransaction() {
        if (this.carOwners.size() > 0) return carOwners.size() - 1;
        else return 0;
    }

    public abstract void refuel();
}

