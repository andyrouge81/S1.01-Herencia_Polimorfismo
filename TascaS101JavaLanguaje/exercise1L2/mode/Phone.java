package TascaS101JavaLanguaje.exercise1L2.mode;

public class Phone {

    // class fields

    private String brand;
    private String model;

    // constructor

    public Phone(String brand, String model){
        this.brand = brand;
        this.model = model;

    }

    // getter

    public String getModel(){ return model; }

    public String getBrand(){ return brand; }

    // method

    public String call(int num){

        return  "Está llamando al número: "+num;
    }

}
