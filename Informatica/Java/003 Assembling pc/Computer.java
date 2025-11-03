public class Computer {
    private String configurationName;
    private Cpu processor;
    private Ram memory;
    private Disk archive;
    static final double IVA = 0.22;

    public Computer(String configurationName, Cpu processor, Ram memory, Disk archive) {
        this.configurationName = configurationName;
        this.processor = processor;
        this.memory = memory;
        this.archive = archive;
    }

    public double calculateBasePrice(){
        return processor.getPrice() + memory.getPrice() + archive.getPrice();
    }

    public double calculateDiscountedPrice(double discountPercent){
        return (1 - (discountPercent / 100)) * calculateBasePrice();
    }

    public double calculateIvaPrice(double chosenPrice){
        return chosenPrice * IVA;
    }

    public String toString() {
        return "configuration name: " + configurationName + "\n"
                + processor.toString() + "\n"
                +  memory.toString() + "\n"
                + archive.toString() + "\n"
                + calculateBasePrice() + "\n";
    }
}
