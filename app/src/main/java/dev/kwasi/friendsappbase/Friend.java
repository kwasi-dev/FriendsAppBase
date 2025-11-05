package dev.kwasi.friendsappbase;

public class Friend {
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
