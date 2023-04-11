package HW5;

public class Rose extends FloweringPlant implements Flowerable {
    public Thorns thorns = null;

    static class Thorns {
        static int count = 0;

        static void addThorn() {
            Thorns.count += 1;
        }

        static void removeThorn() {
            if (Thorns.count == 0) {
                System.out.println("Thorn cannot be removed further");
                return;
            }

            Thorns.count -= 1;
        }
    }

    public Rose(int id) {
        super(id, "Rose", "UK");
    }

    public void flower() {
        System.out.println("Rose is flowered");
    }
}
