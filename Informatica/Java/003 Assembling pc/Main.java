//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main() {
    Cpu c1 = new Cpu("Intel I7", 300.00, 8, 5.4);
    Ram m1 = new Ram("KingSton", 80.00, 16, "ddr4");
    Disk d1 = new Disk("Samsung Evo", 100, 5, true);
    Computer a1 = new Computer("meow", c1, m1, d1);

    System.out.println(a1.toString());
    System.out.println(a1.toString());
    System.out.println(a1.calculateIvaPrice(a1.calculateBasePrice()));
}
