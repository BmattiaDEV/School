public class Ram extends ComponentHardwere {

    private int capacityGB;
    private String type;

    public Ram(String model, double price, int capacityGB, String type) {
        super(model, price);
        this.capacityGB = capacityGB;
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString()
                + " capacity +: " + capacityGB
                + " type: " + type;
    }
}
