package TascaS101JavaLanguaje.exercise2L1.mode;

public class Coche {

    // class fields

    private final static String CAR_BRAND = "Porsche";
    private static String model;
    private final int POWER = 150;

    // constructor

    public Coche(String model){

        this.model = model;


    }
    // getters
    public String getCarBrand(){return CAR_BRAND;}
    public String getModel(){return model;}
    public int getPOWER(){ return POWER;}

    // methods
    public static void brake(){
        System.out.println("El vehículo está frenando.");
    }

    public void accelerate(){
        System.out.println("El vehículo está acelerando.");
    }

    @Override
    public String toString(){
        return String.format("Marca: %s - Modelo: %s - Potencia: %d", getCarBrand(), getModel(), getPOWER());
    }


}
