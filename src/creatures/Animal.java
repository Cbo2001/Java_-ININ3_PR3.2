package creatures;

public class Animal {

    public String name;
    final String species;
    public Double weight;
    Boolean alive;

    public Animal(String species) {
        this.species = species;
        this.alive = true;
        this.weight = 3.0;
    }
    public void feed() {
        if (this.alive = false) {
            System.out.println("Twoje zwierzę umarło Bydlaku, lecz się.");
        }
        else{
            this.weight += 0.5;
            System.out.println("Aktualna waga zwierzęcia to: " + this.weight);

        }


    }
    public void takeFofAWalk() {
        if (this.alive = false) {
            System.out.println("Twoje zwierzę umarło Bydlaku, lecz się");
        }
        if (this.weight <= 0) {
            System.out.println("Twoje zwierzę umarło Bydlaku, jesteś chory zwyrodnialcu?");
            this.alive = false;
        }
        else {
            this.weight -= 0.5;
            System.out.println("Aktualna waga zwierzęcia to: " + this.weight);
        }

        }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", weight=" + weight +
                ", alive=" + alive +
                '}';
    }
}


