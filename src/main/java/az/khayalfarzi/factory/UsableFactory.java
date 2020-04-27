package az.khayalfarzi.factory;

import az.khayalfarzi.factory.cars.*;
import az.khayalfarzi.factory.interfaces.Usable;

public class UsableFactory {

    public Usable getCar(String name) {
        if (name.equalsIgnoreCase("MERCEDES")) {
            return new Mercedes();
        } else if (name.equalsIgnoreCase("BMW")) {
            return new BMW();
        } else if (name.equalsIgnoreCase("OPEL")) {
            return new Opel();
        } else if (name.equalsIgnoreCase("CHEVROLET")) {
            return new Chevrolet();
        } else if (name.equalsIgnoreCase("KIA")) {
            return new Kia();
        } else throw new IllegalArgumentException(String.format("Car name => %s <= not supported",name));
    }
}
