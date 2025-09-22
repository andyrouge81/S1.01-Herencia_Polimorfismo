package TascaS101JavaLanguaje.Exercici1L1.mode;

public class Percusion extends Instrumento{
    //constructor
    public Percusion(String nombre, double precio){
        super(nombre, precio);
    }

    public void tocar(){
        System.out.println("Está sonando un instrumento de precusión.");
    }

    @Override
    public String toString(){
        return String.format("Nombre: %d - Precio: %.2f €");
    }
}
