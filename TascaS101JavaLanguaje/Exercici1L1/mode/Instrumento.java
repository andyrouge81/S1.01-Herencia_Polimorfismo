package TascaS101JavaLanguaje.Exercici1L1.mode;

public abstract class Instrumento {
    // atributos de clase
    private String nombre;
    private double precio;

    //constructor
    public Instrumento(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    // metodo abstracto
    public abstract void tocar();


}
