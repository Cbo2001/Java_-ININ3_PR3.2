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
        return auto;
    }

    public Double getSalary() {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("\nData/godz pobrania danych: " + dateTime.format(DateTimeFormatter.ofPattern("d.M.y HH:mm:ss")));
        System.out.print("Aktualna wartość wypłaty: " + this.salary);
        return this.salary;
    }



    public void setAuto(Car auto) {
        this.auto = auto;
    }


}
