package TascaS101JavaLanguaje.exercise1L2.application;

import TascaS101JavaLanguaje.exercise1L2.interfaces.Camera;
import TascaS101JavaLanguaje.exercise1L2.mode.Smartphone;
import TascaS101JavaLanguaje.exercise1L2.interfaces.Watch;

public class Main {
    public static void main(String[] args) {

        // we create the objects who calls the methods by an interfaces

        Camera camera1 = new Smartphone("Samsung", "C-23");

        Watch watch1 = new Smartphone("Rolex", "SilverX");

        // we show the methods implements in the objects
        System.out.println(camera1.takePicture());

        System.out.println(watch1.alarm());

        // we create an objet smartphone
        Smartphone smartphone1 = new Smartphone("Nokia", "3810");

        // we call the method "call"
        System.out.println(smartphone1.call(688478564));


    }
}
