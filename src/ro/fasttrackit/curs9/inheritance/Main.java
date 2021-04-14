package ro.fasttrackit.curs9.inheritance;

import ro.fasttrackit.curs9.inheritance.other.OtherPackageSubclass;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent("parent-instance");
        Parent parentChild = new SamePackageChild();
        SamePackageChild samePackageChild = new SamePackageChild();

        Parent otherParentChild = new OtherPackageSubclass("pc1");
        OtherPackageSubclass otherPackageSubclass = new OtherPackageSubclass("ca");

        parent.publicMethod();
        parent.protectedMethod();
        parent.defaultMethod();
    //    parent.privateMethod();

        parentChild.publicMethod();
        parentChild.protectedMethod();
        parentChild.defaultMethod();
    //    parentChild.privateMethod();


        samePackageChild.protectedMethod();
        samePackageChild.publicMethod();
        samePackageChild.defaultMethod();
    //    samePackageChild.privateMethod();
        samePackageChild.childMethod();

        otherPackageSubclass.publicMethod();
        otherPackageSubclass.protectedMethod();
    //    otherPackageSubclass.defaultMethod();
    //    otherPackageSubclass.privateMethod();
        otherPackageSubclass.otherChildMethod();

        otherParentChild.protectedMethod();
        otherParentChild.publicMethod();
        otherParentChild.defaultMethod();
    //    otherParentChild.privateMethod();
    }
}
