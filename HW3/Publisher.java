package HW3;

public class Publisher {
    int id;
    String name;
    String address;

    Publisher() {
    }

    Publisher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Publisher(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void setID(int id) {
        this.id = id;
        ;
    }

    public void setName(String name) {
        name = name;
    }

    public void setAddress(String address) {
        address = address;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return "Publisher{id='" + id + "', name=" + name + ", address=" + address + "}";
    }
}
