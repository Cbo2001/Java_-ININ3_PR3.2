package creatures;


 public abstract class Animal implements Salleable,Feedable {

    public String name;
    public String species;
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
@Override
    public void sell(Human seller, Human buyer, Double price){
        if(buyer.cash < price){
            System.out.println("Goń się Typie! Nie masz Hajsu Kolo");
        } else if (seller.pet != this) {
            System.out.println("Co chcesz sprzedać? BĄKA z gaci!");
        }
        else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println("Transakcja zakończona: POMYŚLNIE");
        }
    }

}


