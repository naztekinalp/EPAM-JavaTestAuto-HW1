package HW4;

public class Rose extends Plant implements Flowerable {
    public Rose(int id) {
        super(id, "Rose", "UK");
    }

    @Override
    public void flower() {
        System.out.println("Rose is flowered");
    }
}
