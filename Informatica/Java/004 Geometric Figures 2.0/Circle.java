public class Circle extends Figure{

    private final double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double calcolaArea() {
        return radius * radius * Math.PI;
    }
}
