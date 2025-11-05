package dev.kwasi.friendsappbase;

import java.io.Serializable;

public class Friend implements Serializable {
    final String firstName;
    final String lastName;

    final String status;

    public Friend(String fName, String lName, String status){
        this.firstName = fName;
        this.lastName = lName;
        this.status = status;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStatus() {
        return status;
    }

}
