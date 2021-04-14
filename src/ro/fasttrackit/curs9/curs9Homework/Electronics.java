package ro.fasttrackit.curs9.curs9Homework;

import ro.fasttrackit.curs9.inheritance.Parent;

public class Electronics extends Parent {
    private String type;
    private  double length;
    private double width;
    private double height;
    private double weight;

    public Electronics(String type, double length, double width , double height, double weight){
        super("Produs electronic");

        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public void specificatii(){
        System.out.println("Tip:" + type + " Marimi: " + length + ", " + width + ", " + height + ", " + weight);
    }
}
