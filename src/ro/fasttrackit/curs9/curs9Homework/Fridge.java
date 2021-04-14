package ro.fasttrackit.curs9.curs9Homework;

public class Fridge extends Electronics{
    int temperature;

    public Fridge(int temperature){
        super("Electro-casnic",1.2,0.6, 1, 0.5);

        this.temperature = temperature;
    }
}
