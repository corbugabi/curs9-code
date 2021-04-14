package ro.fasttrackit.curs9.curs9Homework;

import java.time.LocalDateTime;

public abstract class Employee extends Person{
    private LocalDateTime dateOfEmployment;
    private String position;

    public Employee(LocalDateTime dateOfEmployment, String position){
        super("Ionut","Lenghel",LocalDateTime.of(2001,8,21,16,32),"Floresti");
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
    }

    public Employee() {
        super();
    }

    public abstract void getSalary();
}
