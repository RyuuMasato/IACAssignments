package Assignment2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address {
    private String  street,
                    zip,
                    city;

    public Address() {}

    public Address(String street, String zip, String city) {
        this.setStreet(street);
        this.setZip(zip);
        this.setCity(city);
    }

    @XmlElement
    public String getStreet() { return this.street; }

    public void setStreet(String street) { this.street = street; }

    @XmlElement
    public String getZip() { return this.zip; }

    public void setZip(String zip) { this.zip = zip; }

    @XmlElement
    public String getCity() { return this.city; }

    public void setCity(String city) { this.city = city; }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
