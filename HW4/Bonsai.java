package HW4;

public class Bonsai extends HousePlant implements Trimmable {

    String preferedPot = "shallow-small";
    static int price = 31556;


    public Bonsai(int id) {
        super(id, "Bonsai", "JP");
    }

    @Override
    public void trim() {
        System.out.println("Bonsai is trimmed.");
    }
}
