package TascaS101JavaLanguaje.exercise1L1.application;

import TascaS101JavaLanguaje.exercise1L1.mode.Stringed;
import TascaS101JavaLanguaje.exercise1L1.mode.Instrumento;
import TascaS101JavaLanguaje.exercise1L1.mode.Percussion;
import TascaS101JavaLanguaje.exercise1L1.mode.Wind;

public class MainInstrumento {
    public static void main(String[] args) {

        // we create the objects

        Instrumento wind1 = new Wind("Trompeta", 200);
        Instrumento stringed1 = new Stringed("Guitarra", 150);
        Instrumento percussion1 = new Percussion("Bateria", 500);

        // we show the methods for each instrument
        wind1.play();

        stringed1.play();

        percussion1.play();

    }
}
