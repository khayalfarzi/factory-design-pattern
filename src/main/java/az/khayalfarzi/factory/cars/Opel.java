package az.khayalfarzi.factory.cars;

import az.khayalfarzi.factory.interfaces.Usable;

public class Opel implements Usable {

    public void getMaxSpeed() {
        System.out.println("Maximum speed of Opel is 200");
    }
}
