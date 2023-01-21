package creatures;
import devices.Car;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Human {
    Animal pet;
    private Car auto;
    private Double salary= 2000.0;


    public Human(Double salary) {
        this.salary = salary;
    }

    public Car getAuto() {
        return this.auto;
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
                "pet=" + pet +
                ", auto=" + auto +
                ", salary=" + salary +
                '}';
    }

    public void setAuto(Car auto) {
        if (this.salary > auto.value) {
            System.out.println("\nUdało się kupić auto za gotówkę.");
            this.auto = auto;
        } else if (this.salary > (auto.value / 12.0)) {
            System.out.println("\nUdało się kupić auto na kredyt (no trudno).");
            this.auto = auto;
        } else {
            System.out.println("\nZapisz się na studia i znajdź nową robotę albo idź po podwyżkę.");
        }



    }




}
