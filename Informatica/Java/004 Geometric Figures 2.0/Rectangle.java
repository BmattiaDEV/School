public class Rectangle extends Figure{

    private final double height;
    private final double width;
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public double calcolaPerimetro() {
        return height * 2 + width * 2;
    }

    @Override
    public double calcolaArea() {
        return height * width;
    }
}
