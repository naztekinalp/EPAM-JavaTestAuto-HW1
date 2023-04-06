package HW4;

public abstract class Shrub extends Plant implements Trimmable {


    public Shrub(int id, String type, String nativeRegion) {
        super(id, type, nativeRegion);
    }

    @Override
    public void trim() {
        System.out.println("Shrub trimmed");
    }

}
