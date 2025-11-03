//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //-- creates the new bookshelf --//
    Bookshelf biblio = new Bookshelf();

    //-- creates the new books --//
    Book b1 = new Book("Title1","Author1" ,20.00);
    Book b2 = new Book("Title2","Author2" ,20.00);
    Book b3 = new Book("Title3","Author3" ,20.00);

    //-- adds the book to the array --//
    biblio.addBook(b1);
    biblio.addBook(b2);
    biblio.addBook(b3);

    //-- applies the discount to the specified book --//
    b1.applyDiscount(70);
    b2.applyDiscount(20);

    System.out.println(biblio.toString());
}
