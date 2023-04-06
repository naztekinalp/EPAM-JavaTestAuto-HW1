package HW4;

abstract public class Plant {
    String type;
    String nativeRegion;
    static int price;
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
    }

    void updateNationRegion(String nativeRegion) {
        this.nativeRegion = nativeRegion;
    }

}
