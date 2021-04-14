package ro.fasttrackit.curs9.inheritance;

import ro.fasttrackit.curs9.inheritance.Parent;

public class OverridingChild extends Parent {
    public OverridingChild(){
        super("Overriding");
    }

    public void publicMethod(){
        System.out.println("My new implementation from child");
    }

    protected void protectedMethod(){
        System.out.println("Child implementation");
        super.protectedMethod();
    }

  //  public final void finalMethod(){

    //}
}
