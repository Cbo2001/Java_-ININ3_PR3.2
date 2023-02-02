package sebastian_z;

import sebastian_z.creatures.Human;
import sebastian_z.creatures.Pet;
import sebastian_z.devices.Car;
import sebastian_z.devices.Phone;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nZadanie 1: ");
        Pet azor = new Pet("pies") {

        };
        azor.name = "Azor";
        azor.feed();
        azor.takeFofAWalk();
        azor.takeFofAWalk();
        azor.takeFofAWalk();
        azor.takeFofAWalk();
        azor.takeFofAWalk();
        azor.takeFofAWalk();
        azor.takeFofAWalk();
        azor.takeFofAWalk();

        Car fiat = new Car("fiat", "bravo", 2010);
        System.out.println("\nZadanie 2 Dodawanie AUTA\n  Model auta: " + fiat.model);
        System.out.println("  Przebieg: " + fiat.millage);
        Human andrzej = new Human("Andrzej", 1500.0);
        //andrzej.setAuto(fiat);
        System.out.println("Samochód Andrzeja to  " + andrzej.getAuto());
        System.out.println(andrzej);
        System.out.println(fiat);

        System.out.println("\nZadania 3 i 4");
        andrzej.getSalary();
        andrzej.setSalary(-200.0);
        andrzej.setSalary(2500.09);

        System.out.println("\nZadanie 5\n");
        Car seat = new Car("seat", "altea", 2011);
        //seat.value=1500.0;
        seat.value=5500.0;
        andrzej.setAuto(seat);

        System.out.println("\nZadanie 6\n");
        Car seat2 = new Car("seat", "altea", 2011);
        System.out.println(seat.equals(fiat));
        System.out.println(seat.equals(seat2));
        System.out.println(seat.equals(seat));
        System.out.println(seat);
        System.out.println(seat2);
        System.out.println(azor);

        System.out.println("\nZadanie 7\n");
        Phone honor = new Phone("Honor", "x13 Pro", 6.0, "Android 12");
        honor.turnOn();
        seat.turnOn();

        System.out.println("\nZadanie 8\n");

        Car passat = new Car("VW", "Passat", 2010);
        Human me = new Human("Kacper", 4000.2);
        Human brotherInLow = new Human("Piotrek", 3200.0);
        me.auto = passat;
        //me.auto = null;
        //brotherInLow.cash = 100.0;
        brotherInLow.cash = 10000.0;
        passat.sell(me, brotherInLow, 3000.0);

        honor.sell(me, brotherInLow, 1000.0 );

        azor.sell(me, brotherInLow, 500.0);

        andrzej.sell(me, brotherInLow, 20.0);


        System.out.println("\nZadanie 9\n");

    }

}