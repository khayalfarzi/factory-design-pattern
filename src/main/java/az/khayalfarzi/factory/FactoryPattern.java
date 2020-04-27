package az.khayalfarzi.factory;

import az.khayalfarzi.factory.interfaces.Usable;

public class FactoryPattern {

    public static void main(String[] args) {

        UsableFactory usableFactory = new UsableFactory();

        //Get object of Mercedes class via Usable interface
        Usable mercedes = usableFactory.getCar("MERCEDES");
        mercedes.getMaxSpeed();

        //Get object of BMW class via Usable interface
        Usable bmw = usableFactory.getCar("BMW");
        bmw.getMaxSpeed();

        //Get object of Opel class via Usable interface
        Usable opel = usableFactory.getCar("OPEL");
        opel.getMaxSpeed();

        //Get object of Chevrolet class via Usable interface
        Usable chevrolet = usableFactory.getCar("CHEVROLET");
        chevrolet.getMaxSpeed();

        //Get object of KIA class via Usable interface
        Usable kia = usableFactory.getCar("KIA");
        kia.getMaxSpeed();
    }
}
