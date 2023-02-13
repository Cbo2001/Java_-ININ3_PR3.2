package sebastian_z;

import sebastian_z.creatures.Human;

public interface Salleable {
    void sell(Human seller, Human buyer, Double price) throws Exception;
}
