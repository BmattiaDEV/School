import java.util.Scanner;

public static void main() {

    Scanner sc = new Scanner(System.in);

    // -- normal try -- //
    Address i1 = new Address("street1", "123", "NY", "11111");
    Student s1 = new Student("John", "Shoe", "JS1234", i1, "meow");

    Address i2 = new Address("street2", "321", "Las Vegas", "00000");
    Teacher d1 = new Teacher("Chad", "Guy", "CG4321", i2, "informatic");

    // -- scanner try -- //
    System.out.println("insert all parameters of address: \n (street - civic number - city - cap)");
    Address i3 = new Address(sc.nextLine(), sc.next(), sc.next(), sc.next());

    System.out.println("insert all parameters of address: \n (name - surname - tax id code - freshman)");
    Student s2 = new Student(sc.next(), sc.next(), sc.next(), i3, sc.next());

    System.out.println(s1.intruduceSelf());
    System.out.println(s1.printAddress());

    System.out.println("-------");

    System.out.println(d1.intruduceSelf());
    System.out.println(d1.printAddress());

    System.out.println("-------");

    System.out.println(s2.intruduceSelf());
    System.out.println(s2.printAddress());
}

