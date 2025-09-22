package TascaS101JavaLanguaje.Exercici1L1.application;

import TascaS101JavaLanguaje.Exercici1L1.mode.Cuerda;
import TascaS101JavaLanguaje.Exercici1L1.mode.Instrumento;
import TascaS101JavaLanguaje.Exercici1L1.mode.Percusion;
import TascaS101JavaLanguaje.Exercici1L1.mode.Viento;

public class MainInstrumento {
    public static void main(String[] args) {

        // creamos los intrumentos

        Instrumento viento1 = new Viento("Trompeta", 200);
        Instrumento cuerda1 = new Cuerda("Guitarra", 150);
        Instrumento percusion1 = new Percusion("Bateria", 300);

        // visualizamos instrumentos
        viento1.tocar();

        cuerda1.tocar();

        percusion1.tocar();











    }
}
