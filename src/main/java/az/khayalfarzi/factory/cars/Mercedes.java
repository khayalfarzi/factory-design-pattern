package az.khayalfarzi.factory.cars;

import az.khayalfarzi.factory.interfaces.Usable;

public class Mercedes implements Usable {

    public void getMaxSpeed() {
        System.out.println("Maximum speed of Mercedes is 350");
    }
}
