package ro.fasttrackit.curs9.inheritance.other;

import ro.fasttrackit.curs9.inheritance.Parent;

public class OtherPackageSubclass extends Parent {
    public OtherPackageSubclass(String name){
        super(name);
    }

    public  void otherChildMethod(){
        System.out.println("Ce am mostenit");
        System.out.println(publicString);
        System.out.println(protectedInt);
     //   System.out.println(defaultINt);
        //  System.out.println(privateString);

        publicMethod();
        protectedMethod();
    //    defaultMethod();
    //    privateMethod();


    }

}
