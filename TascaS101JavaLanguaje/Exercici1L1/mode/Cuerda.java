package TascaS101JavaLanguaje.Exercici1L1.mode;

public class Cuerda extends Instrumento{

    public Cuerda(String nombre, double precio){
        super(nombre, precio);

    }

    // metodo abstracto

    public void tocar(){
        System.out.println("Está sonando un instrumento de cuerda.");
    }

    @Override
    public String toString(){
        return String.format("Nombre: %d - Precio: %.2f €");
    }
}
