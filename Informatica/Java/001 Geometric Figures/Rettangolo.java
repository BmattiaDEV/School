public class Rettangolo extends Forma{
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza, String colore) {
        super(colore); // adds this in forma class
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcoloArea(){
        return altezza*base;
    }

    @Override
    public String toString(){
        return stampaDettagli() + calcoloArea();
    }
}
