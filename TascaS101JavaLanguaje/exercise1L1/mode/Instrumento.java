package TascaS101JavaLanguaje.exercise1L1.mode;

public abstract class Instrumento {

    // class fields
    private String name;
    private double price;

    //constructor
    public Instrumento(String name, double price){
        this.name = name;
        this.price = price;
    }
    //  abstract method
    public abstract void play();


}
