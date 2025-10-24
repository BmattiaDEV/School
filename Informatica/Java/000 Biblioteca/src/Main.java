public class main() // tutto quello che il programma deve svolgere | fai alla fine
{
    public static void main(String[] args)
    {
        Biblioteca b = new Biblioteca(5);
        Libro l1 = new Libro("le mie cazzate" , "Russo" , 2F);
        b.aggiungiLibri(l1);

        b.aggiungiLibri(new Libro("Quanto sono intelligente" , "AA.VV" , 5F));
        b.aggiungiLibri(new Libro("Quanto sono intelligente" , "AA.VV" , 5F));

        String output = b.stampaTutti();
        System.out.println(b.stampaTutti());
    }
}



