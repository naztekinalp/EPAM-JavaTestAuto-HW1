package HW4;

public class Rose extends FloweringPlant implements Flowerable {

    public Rose(int id) {
        super(id, "Rose", "UK");
    }

    public void flower() {
        System.out.println("Rose is flowered");
    }
}
