package HW3;

public class Author {
    int id;
    String firstName;
    String lastName;

    Author() {
    }

    Author(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    Author(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        firstName = firstName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return "Author{id='" + id + "', firstName=" + firstName + ", lastName=" + lastName + "}";
    }
}
