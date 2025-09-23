package TascaS101JavaLanguaje.exercise2L1.application;

import TascaS101JavaLanguaje.exercise2L1.mode.Coche;

public class MainCoche {
    public static void main(String[] args) {

        // we create objects of Coche class

        Coche coche1 = new Coche("Panamera");

        // we call to the static method, it calls with the class "Coche" beacuse is a static method
        Coche.brake();

        // we call to the non static method, it calls with the object "coche1" beacuse is not a static method
        coche1.acelerar();
    }
}
