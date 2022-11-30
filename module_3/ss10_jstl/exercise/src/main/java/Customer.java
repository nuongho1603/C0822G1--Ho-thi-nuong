import java.util.Date;

public class Customer {
    private String nameCustomer;
    private String birthday;
    private String address;
    private String img;

    public Customer() {
    }

    public Customer(String nameCustomer, String birthday, String address, String img) {
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.address = address;
        this.img = img;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
