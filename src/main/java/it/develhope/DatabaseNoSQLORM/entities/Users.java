package it.develhope.DatabaseNoSQLORM.entities;


import org.springframework.data.annotation.Id;

public class Users {

    //in mongoDb le tabelle vengono chiamate collection

    @Id
    private String id;

    private String firstName;
    private String lastName;

    public Users(){}

    public Users(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
