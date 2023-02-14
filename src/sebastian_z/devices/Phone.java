package sebastian_z.devices;

import sebastian_z.creatures.Human;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Phone extends Device{

    private static final String DEFAULT_APP_VERSION = "latest-stable";
    private static final String DEFAULT_APP_SERVER = "https://mTalent-apps.com";
    public final static String DEFAULT_PROTOCOLE="http://";
    Double screenSize;
    String androidiOS;

    public Set<Application> applications = new HashSet<>();

    private final Human owner;

    public Phone(String producer, String model, Integer yearOfProduction, Human owner) {
        super(producer, model, yearOfProduction);
        this.owner = owner;
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
    public void installApp(Application app) {
        if (this.owner.cash < app.price) {
            System.out.println("Masz za mało hajsu Typku");
        }
        this.applications.add(app);
        this.owner.cash -= app.price;
        System.out.println("Zainstalowano aplikację: "+ app.name);
    }

    public boolean appIsInstaledd(Application app) {
        return this.applications.contains(app);
    }

    public boolean appIsInstaledd(String appName) {
        for (Application app : this.applications)
            if (app.name.equals(appName)) return true;
        return false;
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

    public void allFreeApps() {
        System.out.println("Lista darmowych aplikacji:");
        for (Application app : this.applications)
            if (app.price == 0.0) System.out.println(app);
    }

    public Double priceAllApps() {
        Double valueOfApps = 0.0;
        for (Application app : this.applications) valueOfApps += app.price;
        return valueOfApps;
    }

    public void getAllAppsByName() {
        System.out.println("Lista aplikacji alfabetycznie:");
        List<Application> applicationListByName = applications.stream().sorted(Comparator.comparing(Application::getName)).collect(Collectors.toList());
        for (Application app : applicationListByName) {
            System.out.println(app);
        }
    }

    public void allAppsPriceLowToHigh() {
        System.out.println("Lista aplikacji wg ceny rosnąco:");
        List<Application> applicationListByPrice = applications.stream().sorted(Comparator.comparing(Application::getPrice)).collect(Collectors.toList());
        for (Application app : applicationListByPrice) {
            System.out.println(app);
        }
    }
}
