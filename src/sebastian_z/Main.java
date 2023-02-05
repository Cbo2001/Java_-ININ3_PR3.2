package sebastian_z;

import sebastian_z.creatures.FarmAnimal;
import sebastian_z.creatures.Human;
import sebastian_z.creatures.Pet;
import sebastian_z.devices.*;

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

        Electric fiat = new Electric("fiat", "bravo", 2010);
        System.out.println("\nZadanie 2 Dodawanie AUTA\n  Model auta: " + fiat.model);
        System.out.println("  Przebieg: " + fiat.millage);
        Human andrzej = new Human("Andrzej", 5);
        //andrzej.setAuto(fiat);
        System.out.print("Samochód Andrzeja to  ");
        andrzej.getCar(0);
        System.out.println(andrzej);
        System.out.println(fiat);

        System.out.println("\nZadania 3 i 4");
        andrzej.getSalary();
        andrzej.setSalary(-200.0);
        andrzej.setSalary(2500.09);

        System.out.println("\nZadanie 5\n");
        Lpg seat = new Lpg("seat", "altea", 2011);
        //seat.value=1500.0;
        seat.value=5500.0;
        andrzej.setCar(seat, 1);

        System.out.println("\nZadanie 6\n");
        Disel seat2 = new Disel("seat", "altea", 2011);
        System.out.println(seat.equals(fiat));
        System.out.println(seat.equals(seat2));
        System.out.println(seat.equals(seat));
        System.out.println(seat);
        System.out.println(seat2);
        System.out.println(azor);

        System.out.println("\nZadanie 7\n");
        Phone honor = new Phone("Honor", "x13 Pro", 2017);
        honor.turnOn();
        seat.turnOn();

        System.out.println("\nZadanie 8\n");

        Electric passat = new Electric("VW", "Passat", 2010);
        Human me = new Human("Kacper", 2);
        Human brotherInLow = new Human("Piotrek", 3);
        me.setCar(passat,1);
        //me.auto = null;
        //brotherInLow.cash = 100.0;
        brotherInLow.cash = 10000.0;
        passat.sell(me, brotherInLow, 3000.0);

        honor.sell(me, brotherInLow, 1000.0 );

        azor.sell(me, brotherInLow, 500.0);

        andrzej.sell(me, brotherInLow, 20.0);


        System.out.println("\nZadanie 9\n");

        FarmAnimal byk = new FarmAnimal("bydło");
        me.farmAnimal = byk;
        byk.beEaten();
        System.out.println(byk);

        System.out.println("\nZadanie 10\n");
        fiat.refuel();
        seat.refuel();
        seat2.refuel();

        System.out.println("\nZadanie 11\n");

        Human you = new Human("kacper");
        Disel ford = new Disel("ford", "focus", 2019);
        ford.value = 50000.0;
        Electric fiat1 = new Electric("fiat", "126p", 1999);
        fiat1.value = 1000.0;
        Lpg opel = new Lpg("opel", "corsa", 2009);
        opel.value = 1500.5;


        you.setCar(ford, 0);
        you.setCar(fiat1, 1);
        you.setCar(opel,2);

        System.out.println("jaka jest wartość wszystkich aut?");
        System.out.println(you.getValueOfAllCars() + " zł");

        you.getCar(0);
        you.getCar(1);
        you.getCar(2);


        //you.sortAllCarsInGarageByYear();



    }

}