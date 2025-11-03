public class Cpu extends ComponentHardwere{

    private int numberCore;
    private double frequencyGHz;

    public Cpu(String model, double price,  int numberCore, double frequencyGHz) {
        super(model, price);
        this.numberCore = numberCore;
        this.frequencyGHz = frequencyGHz;
    }

    @Override
    public String toString() {
        return super.toString()
                + " num core: " + numberCore
                + "frequency: " + frequencyGHz;
    }
}
