package sebastian_z.devices;

public class Disel extends Car{
    public Disel(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Rozpoczęcie procedury tankowania.");
        System.out.println("Z dystrybutora leje się płynne złoto.");
        System.out.println("Full, bak pełny.");
        System.out.println(" RrrrRrrrr ");
        System.out.println(" ");
    }
}
