package HW5;

abstract public class Plant {

    private class PlantHealth {

        private double waterLevel = 1.0;

        public double getWaterLevel() {
            return waterLevel;
        }

        public void setWaterLevel(double waterLevel) {
            this.waterLevel = waterLevel;
        }
    }

    String type;
    String nativeRegion;
    PlantHealth plantHealth = new PlantHealth();
    int id;

    public Plant(int id, String type, String nativeRegion) {
        this.id = id;
        this.type = type;
        this.nativeRegion = nativeRegion;
    }

    void waterPlant() {
        this.plantHealth.setWaterLevel(1.0);
    }

    void updateType(String type) {
        this.type = type;
        System.out.println("Type updated to " + type);
    }

    void updateNationRegion(String nativeRegion) {
        this.nativeRegion = nativeRegion;
        System.out.println("Native region updated to " + nativeRegion);
    }

    void changeWaterLevel(double waterLevel) {
        this.plantHealth.setWaterLevel(waterLevel);
    }
}
