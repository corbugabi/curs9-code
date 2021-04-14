package ro.fasttrackit.curs9.curs9Homework;

import java.time.LocalDateTime;

public class Person {
    protected String firstName;
    protected String lastName;
    protected LocalDateTime birthDay;
    protected String address;

    public Person(){};

    public Person(String firstName){
        this.firstName = firstName;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, LocalDateTime birthDay){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
    }

    public Person(String firstName,String lastName, LocalDateTime birthDay, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.address = address;
    }



    public String fullName(){
        return firstName + " " + lastName;
    }

}
