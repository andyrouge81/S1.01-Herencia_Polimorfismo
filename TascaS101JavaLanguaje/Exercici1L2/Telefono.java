package TascaS101JavaLanguaje.Exercici1L2;

public class Telefono {

    // atributos de clase

    private String marca;
    private String modelo;

    // constructor

    public Telefono(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;

    }

    // getter

    public String getModelo(){ return modelo;}

    public String getMarca(){ return marca;}

    // metodo

    public String trucar(int num){

        return  "Está llamando al número, "+num;
    }

}
