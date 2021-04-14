package ro.fasttrackit.curs9.curs9Homework;

public class MainProduct {
    public static void main(String[] args) {
        Cosmetics cosmetics = new Cosmetics("alb", 1);
        System.out.println(cosmetics.getName());

        Fridge fridge = new Fridge(18);
       fridge.specificatii();

    }
}
