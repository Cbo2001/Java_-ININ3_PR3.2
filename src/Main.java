import creatures.Animal;
import creatures.Human;
import devices.Car;
import devices.Phone;

import java.io.Console;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nZadanie 1: ");
        Animal azor = new Animal("pies");
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

        Car fiat = new Car("fiat", "bravo", 2010, 312321.5);
        System.out.println("\nZadanie 2 Dodawanie AUTA\n  Model auta: " + fiat.model);
        System.out.println("  Przebieg: " + fiat.millage);
        Human andrzej = new Human(2000.50);
        //andrzej.setAuto(fiat);
        System.out.println("Samochód Andrzeja to  " + andrzej.getAuto());
        System.out.println(andrzej);
        System.out.println(fiat);

        System.out.println("\nZadania 3 i 4");
        andrzej.getSalary();
        andrzej.setSalary(-200.0);
        andrzej.setSalary(2500.09);

        System.out.println("\nZadanie 5\n");
        Car seat = new Car("seat", "altea", 2011, 178321.3);
        //seat.value=1500.0;
        seat.value=5500.0;
        andrzej.setAuto(seat);

        System.out.println("\nZadanie 6\n");
        Car seat2 = new Car("seat", "altea", 2011, 178321.3);
        System.out.println(seat.equals(fiat));
        System.out.println(seat.equals(seat2));
        System.out.println(seat.equals(seat));
        System.out.println(seat);
        System.out.println(seat2);
        System.out.println(azor);


        System.out.println("\nZadanie 7\n");
        Phone xiaomi = new Phone("Honor", "x13 Pro", 6.0, "Android 12");
    }

}