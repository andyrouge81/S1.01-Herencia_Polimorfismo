package TascaS101JavaLanguaje.Exercici2L1.application;

import TascaS101JavaLanguaje.Exercici2L1.mode.Coche;

public class MainCoche {
    public static void main(String[] args) {

        // creamos objetos de clase coche

        Coche coche1 = new Coche("Panamera");

        // llamada la metodo estático, al ser estático se debe de llamar con la clase Coche pues es un metodo de clase
        Coche.frenar();

        // llamada al metodo no estático, se debe hacer desde el objeto creado de la clase Coche
        coche1.acelerar();
    }
}
