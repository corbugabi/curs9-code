package ro.fasttrackit.curs9.curs9Homework;

public abstract class DatabaseAdmin extends Employee{
    private String dbTechnology;

    public DatabaseAdmin(String dbTechnology){
        super();
        this.dbTechnology = dbTechnology;
    }
}
