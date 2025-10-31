public class Person {
    private String name;
    private String surname;
    private String taxIdCode;
    private Address address;

    public Person(String name, String surname, String taxIdCode, Address address) {
        this.name = name;
        this.surname = surname;
        this.taxIdCode = taxIdCode;
        this.address = address;
    }

    public String intruduceSelf(){
        return "I am: " + name + " "
                + surname + ", tax id code: "
                + taxIdCode + "\n";
    }

    public String printAddress(){
        return address.getCompleteAddress();
    }


}