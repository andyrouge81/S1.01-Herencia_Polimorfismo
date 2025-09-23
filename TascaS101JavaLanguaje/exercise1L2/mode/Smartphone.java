package TascaS101JavaLanguaje.exercise1L2.mode;

import TascaS101JavaLanguaje.exercise1L2.interfaces.Camera;
import TascaS101JavaLanguaje.exercise1L2.interfaces.Watch;

public class Smartphone extends Phone implements Camera, Watch {

    // constructor

    public Smartphone(String brand, String model){

        super(brand, model);
    }

    // methods

    public String takePicture(){
        return "Se está haciendo una foto.";
    }

    public String alarm(){
        return "Está sonando la alarma";
    }
}
