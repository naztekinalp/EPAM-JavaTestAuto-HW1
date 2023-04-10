package HW5;

public class Rose extends FloweringPlant implements Flowerable {
    public Thorns thorns = null;

    static class Thorns {
        int count = 0;

        public void addThorn() {
            this.count += 1;
        }

        public void removeThorn() {
            if (this.count == 0) {
                System.out.println("Thorn cannot be removed further");
                return;
            }

            this.count -= 1;
        }
    }

    public Rose(int id) {
        super(id, "Rose", "UK");
    }

    public void flower() {
        System.out.println("Rose is flowered");
    }
}
