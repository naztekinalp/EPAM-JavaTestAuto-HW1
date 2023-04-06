package HW4;

public class Bonsai extends HousePlant implements Trimmable {

    public Bonsai(int id) {
        super(id, "Bonsai", "JP");
    }

    @Override
    public void trim() {
        System.out.println("Bonsai is trimmed.");
    }
}
