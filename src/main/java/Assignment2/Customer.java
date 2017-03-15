package Assignment2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
    private String  name,
                    dateOfBirth;
    private Address address;

    public Customer() {}

    public Customer(Address address) {
        this.setAddress(address);
    }

    public Customer(String name, String date, Address address) {
        this(address);
        this.setName(name);
        this.setDateOfBirth(date);
    }

    @XmlElement
    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    @XmlElement
    public String getDateOfBirth() { return this.dateOfBirth; }

    public void setDateOfBirth(String date) { this.dateOfBirth = date; }

    @XmlElement
    public Address getAddress() { return this.address; }

    public void setAddress(Address address) { this.address = address; }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address=" + address +
                '}';
    }
}
