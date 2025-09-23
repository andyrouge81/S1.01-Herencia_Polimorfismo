package TascaS101JavaLanguaje.exercise1L1.mode;

public class Wind extends Instrumento {

    //constructor
    public Wind(String name, double price){
        super(name, price);
    }

    // method abstract

    public void play(){
        System.out.println("Está sonando un instrumento de viento.");;
    }



}
