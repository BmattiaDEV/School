public class Disk extends ComponentHardwere {

    private int capacityTB;
    private boolean isSSD;

    public Disk(String model, double price, int capacityTB, boolean isSSD) {
        super(model, price);
        this.capacityTB = capacityTB;
        this.isSSD = isSSD;
    }

    @Override
    public String toString(){
        return super.toString()
                +  " capacityTB +: " + capacityTB
                +  "is ssd: " + isSSD;

    }

}
