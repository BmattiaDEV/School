public class ComponentHardwere {
    private String model;
    private double price;

    public ComponentHardwere(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "componente: " + model
                + ", price: " + price;
    }
}
