package HW4;

public abstract class FloweringPlant extends Plant implements Flowerable {

    public FloweringPlant(int id, String type, String nativeRegion) {
        super(id, type, nativeRegion);
    }

    public void flower() {
        System.out.println("Plant is flowered");
    }
}
