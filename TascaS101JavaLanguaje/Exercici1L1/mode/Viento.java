package TascaS101JavaLanguaje.Exercici1L1.mode;

public class Viento extends Instrumento {


    //constructor
    public Viento(String nombre, double precio){
        super(nombre, precio);
    }

    // metodo abstracto

    public void tocar(){
        System.out.println("Está sonando un instrumento de viento.");;
    }
    @Override
    public String toString(){
        return String.format("Nombre: %d - Precio: %.2f €");
    }

}
