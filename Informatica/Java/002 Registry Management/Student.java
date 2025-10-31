public class Student extends Person{
    private String freshman;

    public Student(String name, String surname, String taxIdCode, Address address, String freshman) {
        super(name, surname, taxIdCode, address);
        this.freshman = freshman;
    }

    @Override
    public String intruduceSelf() {
        return super.intruduceSelf() + " and a student, freshman: " + freshman + "\n";
    }
}
