package sebastian_z.devices;

import sebastian_z.creatures.Human;

import java.util.List;

public class Phone extends Device{

    private static final String DEFAULT_APP_VERSION = "latest-stable";
    private static final String DEFAULT_APP_SERVER = "https://mTalent-apps.com";
    public final static String DEFAULT_PROTOCOLE="http://";
    Double screenSize;
    String androidiOS;

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
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

    public void installAnApp(List<String> apps) {
        for (String appName : apps) {
            this.installAnApp(appName);
        }
    }

    public void installAnApp(String appName, String version) {
        this.installAnApp(appName, version, DEFAULT_APP_SERVER);
    }

    public void installAnApp(String appName, String version, String server) {
        System.out.println("pobieram");
        System.out.println("sprawdzam miejsce");
        System.out.println("sprawdzam kontrole rodzicielską");
        System.out.println("ups, nie możesz zainstalować");
        //wypisanie co dokładnie instaluje
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
