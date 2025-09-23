package TascaS101JavaLanguaje.exercise1L1.mode;

public class Percussion extends Instrumento{

    //constructor
    public Percussion(String name, double price){
        super(name, price);
    }

    // abstract method
    public void play(){
        System.out.println("Está sonando un instrumento de precusión.");
    }


}
