public class TestFigure{
    public static void main() {
        Forma f1 = new Forma("Nero");

        f1.stampaDettagli();
        System.out.println(f1.calcoloArea());

        System.out.println("--------");

        Rettangolo r1 = new Rettangolo(20, 10, "Red");

        System.out.println("Colore: " + r1.getColore());
        r1.stampaDettagli();
        System.out.println(r1.calcoloArea());
    }



}