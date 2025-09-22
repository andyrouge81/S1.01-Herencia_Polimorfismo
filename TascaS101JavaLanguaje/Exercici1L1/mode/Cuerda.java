package TascaS101JavaLanguaje.Exercici1L1.mode;

public class Cuerda extends Instrumento{

    public Cuerda(String nombre, double precio){
        super(nombre, precio);

    }

    // abstract method

    public void tocar(){
        System.out.println("Está sonando un instrumento de cuerda.");
    }


}
