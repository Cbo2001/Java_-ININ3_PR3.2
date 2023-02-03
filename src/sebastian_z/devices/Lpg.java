package sebastian_z.devices;

public class Lpg extends Car{
    public Lpg(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }
    @Override
    public void refuel() {
        System.out.println("Rozpoczęcie procedury tankowania");
        System.out.println("Z dystrybutora płynie Gas");
        System.out.println("Full, zbiornik pełny");
        System.out.println(" Brrbrbbrrum ");
        System.out.println(" ");
    }
}
