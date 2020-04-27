package az.khayalfarzi.factory.cars;

import az.khayalfarzi.factory.interfaces.Usable;

public class BMW implements Usable {

    public void getMaxSpeed() {
        System.out.println("Maximum speed of BMW is 300");
    }
}
