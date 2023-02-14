package sebastian_z.creatures;
import sebastian_z.devices.Car;
import sebastian_z.devices.Phone;
import sebastian_z.Salleable;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Human extends Animal implements Salleable {

    private static final int DEFAULT_GARAGE_SIZE = 3;
    private static final Double DEFAULT_HUMAN_WEIGHT = 70.0;
    private static final Double DEFAULT_START_SALARY = 0.0;
    private static final String HUMAN_SPECIES = "homo sapiens";
    public String firstName;
    String lastName;
    public Double cash;
    Animal pet;
    public Phone phone;

    //public Car auto; zadanie 11 - usunąć
    public Car[] garage;
    private Double salary;

    public FarmAnimal farmAnimal;

    public Human(String firstName) {
        super(HUMAN_SPECIES);
        this.firstName = firstName;
        this.salary = DEFAULT_START_SALARY;
        this.weight =DEFAULT_HUMAN_WEIGHT;
        this.cash=0.0;
        this.garage = new Car [DEFAULT_GARAGE_SIZE];
    }

    public Human( String firstName, Integer garageSize) {
        super("homo sapiens");
        this.firstName = firstName;
        this.cash = 0.0;
        this.garage = new Car[garageSize];
        this.salary = DEFAULT_START_SALARY;
    }


    public void setCar(Car newCar, Integer parkingLotNumber) {
        if (parkingLotNumber >= this.garage.length) {
            System.out.println("sorry, nie mamy tak dużego garażu");
        } else if (parkingLotNumber < 0) {
            System.out.println("chyba coś ci na łeb upadło");
        } else if (this.garage[parkingLotNumber] != null) {
            System.out.println("sorry miejsce zajęte");
        } else {
            this.garage[parkingLotNumber] = newCar;
            this.garage[parkingLotNumber].carOwners.add(this);
        }
    }

    public void getCar( Integer parkingLotNumber) {
        if (parkingLotNumber >= this.garage.length) {
            System.out.println("sorry, nie mamy tak dużego garażu");
        } else if (parkingLotNumber < 0) {
            System.out.println("chyba coś ci na łeb upadło");
        } else if (this.garage[parkingLotNumber] == null) {
            System.out.println("sorry to miejsce jest puste");
        } else {
            System.out.println("Na tym miejscu parkingowym znajduje się: " + this.garage[parkingLotNumber]);
        }
    }

    public Double getValueOfAllCars() {
        Double valueOfCars = 0.0;
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] != null) {
                valueOfCars += this.garage[i].value;
            }
        }
        return valueOfCars;
    }

    public boolean hasCar(Car car) {
        boolean hasAuto = false;
        for (Car value : this.garage) {
            if (value == car) {
                hasAuto = true;
                break;
            }
        }
        return hasAuto;
    }

    public boolean emptySpaceInTheGarage() {
        boolean emptySpace = false;
        for (Car car : this.garage) {
            if (car == null) {
                emptySpace = true;
                break;
            }
        }
        return emptySpace;
    }

    public void addCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.setCar(car, i);
                break;
            }
        }
    }

    public void removeCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car) {
                this.garage[i] = null;
                break;
            }
        }
    }

    public Double getSalary() {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("\nData/godz pobrania danych: " + dateTime.format(DateTimeFormatter.ofPattern("d.M.y HH:mm:ss")));
        System.out.print("Aktualna wartość wypłaty: " + this.salary);
        return this.salary;
    }

    public void setSalary(Double salary) {
        if (salary >= 0) {
            System.out.println("\nNowe dane zostały wysłane do systemu księgowego.\n");
            System.out.println("Należy koniecznie odebrać aneks od umowy od pani Hani z kadr.");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu.");
            this.salary = salary;
        } else System.out.println("\n\nNieprawidłowa wartość! Wynagrodzenie musi mieć wartość DODATNIĄ!!!");
    }


    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cash=" + cash +
                ", pet=" + pet +
                ", phone=" + phone +
                ", garage=" + Arrays.toString(garage) +
                ", salary=" + salary +
                ", farmAnimal=" + farmAnimal +
                '}';
    }

    /*public void setAuto(Car auto) {
        if (this.salary > auto.value) {
            System.out.println("\nUdało się kupić auto za gotówkę.");
            this.auto = auto;
        } else if (this.salary > (auto.value / 12.0)) {
            System.out.println("\nUdało się kupić auto na kredyt (no trudno).");
            this.auto = auto;
        } else {
            System.out.println("\nZapisz się na studia i znajdź nową robotę albo idź po podwyżkę.");
        }
    }*/
@Override
    public void sell(Human seller, Human buyer, Double price){
        System.out.println("Handel ludzmi jest ZAKAZANY!!! 997 ZGŁOŚ SIĘ!!!");
    }

    @Override
    public void feed(Double foodWeight) {

    }

    public void sortCarsByYear() {
        Arrays.sort(this.garage, (b, a) -> a.yearOfProduction.compareTo(b.yearOfProduction));
    }

    public boolean lastCarOwner(Car car, Human seller) {
        return car.carOwners.get(car.carOwners.size() - 1).equals(seller);
    }
}
