package TascaS101JavaLanguaje.Exercici1L1.mode;

public class Viento extends Instrumento {

    //constructor
    public Viento(String nombre, double precio){
        super(nombre, precio);
    }

    // method abstract

    public void tocar(){
        System.out.println("Está sonando un instrumento de viento.");;
    }



}
