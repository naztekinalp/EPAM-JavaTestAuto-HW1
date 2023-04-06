package HW4;

public class Rose extends Plant implements Flowerable {
    static int price = 31556;

    public Rose(int id) {
        super(id, "Rose", "UK");
    }

    @Override
    public void flower() {
        System.out.println("Rose is flowered");
    }
}
