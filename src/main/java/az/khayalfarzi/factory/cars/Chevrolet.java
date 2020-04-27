package az.khayalfarzi.factory.cars;

import az.khayalfarzi.factory.interfaces.Usable;

public class Chevrolet implements Usable {

    public void getMaxSpeed() {
        System.out.println("Maximum speed of Chevrolet is 250");
    }
}
