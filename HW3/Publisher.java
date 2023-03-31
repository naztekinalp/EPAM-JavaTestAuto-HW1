package HW3;

public class Publisher {
    int ID;
    String Name;
    String Address;

    Publisher() {
    }

    Publisher(int ID, String Name) {
        this.ID = ID;
        this.Name = Name;
    }

    Publisher(int ID, String Name, String Address) {
        this.ID = ID;
        this.Name = Name;
        this.Address = Address;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String toString() {
        return "Publisher{ID='" + ID + "', Name=" + Name + ", Address=" + Address + "}";
    }
}
