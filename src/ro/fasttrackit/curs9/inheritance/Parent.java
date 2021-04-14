package ro.fasttrackit.curs9.inheritance;


public class Parent {
    //constanta in Java
    public static final String CONST = "test";

    public String publicString;
    protected int protectedInt;
    int defaultINt;
    private String privateString;

    public Parent(String name){
        this.privateString = name;
    }

    public void publicMethod(){
        System.out.println("Parent public method");
    }

    protected  void protectedMethod(){
        System.out.println("Parent procteded method");
    }

    void defaultMethod(){
        System.out.println("Parent defauld method");
    }

    private void privateMethod(){
        System.out.println("Parent private method");
    }

    public final void finalMethod(){
        System.out.println("Final method");
    }

}
