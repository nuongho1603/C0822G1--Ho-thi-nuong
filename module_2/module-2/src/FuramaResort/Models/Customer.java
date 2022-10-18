package FuramaResort.Models;

public class Customer extends Person{
    private String type;
    private String address;

    public Customer() {
    }

    public Customer(int id, String nickName, int dateOfBirth, boolean gender, int CMND, int phone, String email, String type, String address) {
        super(id, nickName, dateOfBirth, gender, CMND, phone, email);
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
