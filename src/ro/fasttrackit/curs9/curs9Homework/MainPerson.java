package ro.fasttrackit.curs9.curs9Homework;

import ro.fasttrackit.curs9.inheritance.Parent;

import java.time.LocalDateTime;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("Corbu","Gabi", LocalDateTime.of(2000,03,21,3,11),"Poienii de sus");
        System.out.println(person.fullName());

        Employee employee = new Employee(LocalDateTime.of(2021,3,13,10,3), "Programmer"){
            @Override
            public void getSalary() {

            }
        };
        System.out.println(employee.fullName());

        
    }
}
