public class Biblioteca
{
    private Libro[] libri;
    private int numLibri;

    public Biblioteca(int dim)
    {
        libri = new Libro[dim];
        numLibri = 0;
    }

    public void aggiungiLibri(Libro l)
    {
        libri[numLibri] = l;
        numLibri ++;
    }

    public String stampaTutti()
    {
        String output = "";

        for(int i = 0; i < numLibri; i++)
        {
            output += libri[i].stampaDettagli();
        }

        return output;
    }
}