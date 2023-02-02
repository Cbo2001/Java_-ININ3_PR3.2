package sebastian_z.devices;

import sebastian_z.creatures.Human;

public class Phone extends Device{

    Double screenSize;
    String androidiOS;

    public Phone(String producer, String model, Double screenSize, String androidiOS) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.androidiOS = androidiOS;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", androidiOS='" + androidiOS + '\'' +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Telefon się uruchamia ...1%...30%...80%...99%... GOTOWE!");
    }

    public void mute() {
        System.out.println("Telefon jest wyciszony!");
    }

    public void installAnApp(String app) {
        System.out.println("App: " + app + ", succesfully installed!");
    }
    @Override
    public void sell(Human seller, Human buyer, Double price){
       if(buyer.cash < price){
           System.out.println("Goń się Typie! Nie masz Hajsu Kolo");
       } else if (seller.phone != this) {
           System.out.println("Co chcesz sprzedać? Cegłe!");
       }
       else {
           seller.cash += price;
           buyer.cash -= price;
           buyer.phone = seller.phone;
           seller.phone = null;
           System.out.println("Transakcja zakończona: POMYŚLNIE");
       }
    }
}
