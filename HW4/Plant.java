package HW4;

abstract public class Plant {

    String type;
    String nativeRegion;
    double waterLevel = 1.0;
    int id;

    public Plant(int id, String type, String nativeRegion) {
        this.id = id;
        this.type = type;
        this.nativeRegion = nativeRegion;
    }

    void waterPlant() {
        this.waterLevel = 1.0;
    }

    void updateType(String type) {
        this.type = type;
        System.out.println("Type updated to " + type);
    }

    void updateNationRegion(String nativeRegion) {
        this.nativeRegion = nativeRegion;
        System.out.println("Native region updated to " + nativeRegion);
    }

}
