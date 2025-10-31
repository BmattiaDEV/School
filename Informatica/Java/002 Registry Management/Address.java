public class Address {
    private String street;
    private String civicNumber;
    private String city;
    private String cap;

    public Address(String street, String civicNumber, String city, String cap) {
        this.street = street;
        this.civicNumber = civicNumber;
        this.city = city;
        this.cap = cap;
    }

    public String getCompleteAddress(){
        return street + ", " + civicNumber + ", " + city + ", " + cap;
    }
}
