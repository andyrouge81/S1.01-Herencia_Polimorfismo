package TascaS101JavaLanguaje.Exercici2L1.mode;

public class Coche {
    // class fields

    private final static String MARCA = "Porsche";
    private static String modelo;
    private final int POTENCIA = 150;

    // constructor

    public Coche(String modelo){

        this.modelo = modelo;


    }
    // getters
    public String getMarca(){return MARCA;}
    public String getModelo(){return modelo;}
    public int getPOTENCIA(){ return POTENCIA;}

    // methods
    public static void frenar(){
        System.out.println("El vehículo está frenando.");
    }

    public void acelerar(){
        System.out.println("El vehículo está acelerando.");
    }

    public String toString(){
        return String.format("Marca: %s - Modelo: %s - Potencia: %d", getMarca(), getModelo(), getPOTENCIA());
    }


}
