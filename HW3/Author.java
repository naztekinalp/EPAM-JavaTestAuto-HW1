package HW3;

public class Author {
    int ID;
    String FirstName;
    String LastName;

    Author() {
    }

    Author(int ID, String FirstName) {
        this.ID = ID;
        this.FirstName = FirstName;
    }

    Author(int ID, String FirstName, String LastName) {
        this.ID = ID;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }


    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String toString() {
        return "Author{ID='" + ID + "', FirstName=" + FirstName + ", LastName=" + LastName + "}";
    }
}
