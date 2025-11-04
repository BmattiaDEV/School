public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(2.00, 5.00);
        Circle c1 = new Circle(6.00);

        System.out.println(r1.calcolaArea());
        System.out.println(r1.calcolaPerimetro());

        System.out.println(c1.calcolaArea());
        System.out.println(c1.calcolaPerimetro());

    }
}