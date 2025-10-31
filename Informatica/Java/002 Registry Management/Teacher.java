public class Teacher extends Person{

    private String teachedSubject;

    public Teacher(String name, String surname, String taxIdCode, Address address, String teachedSubject) {
        super(name, surname, taxIdCode, address);
        this.teachedSubject = teachedSubject;
    }

    @Override
    public String intruduceSelf() {
        return super.intruduceSelf() + " and a teacher, I teach: " + teachedSubject + "\n";
    }
}
