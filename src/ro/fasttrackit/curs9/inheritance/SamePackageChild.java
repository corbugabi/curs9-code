package ro.fasttrackit.curs9.inheritance;

public class SamePackageChild extends Parent{

    public SamePackageChild(){
        super("Parent");
    }

    public void childMethod(){
        System.out.println("Ce am mostenit");
        System.out.println(publicString);
        System.out.println(protectedInt);
        System.out.println(defaultINt);
    //    System.out.println(privateString);


        publicMethod();
        protectedMethod();
        defaultMethod();
    //    privateMethod();

    }
}
