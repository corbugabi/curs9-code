package ro.fasttrackit.curs9.inheritance;

import ro.fasttrackit.curs9.inheritance.Parent;

public class OverradingMain {
    public static void main(String[] args) {
        Parent parentChild = new OverridingChild();
        OverridingChild overridingChild = new OverridingChild();

        System.out.println("--- Parent parentChild");
        parentChild.publicMethod();
        parentChild.protectedMethod();
        parentChild.defaultMethod();

        System.out.println();

        System.out.println("--- OverradingChild overradingChild");
        overridingChild.publicMethod();
        overridingChild.protectedMethod();
        overridingChild.defaultMethod();
    }
}
