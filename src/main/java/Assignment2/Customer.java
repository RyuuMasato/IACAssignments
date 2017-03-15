package Assignment2;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.HashMap;
import java.util.Map;

@XmlRootElement
public class Customer {
    private String  name,
                    dateOfBirth;
    private Map<String, Address> addresses = new HashMap<String, Address>();

    public Customer() {}

    public Customer(String name, String date) {
        this.setName(name);
        this.setDateOfBirth(date);
    }

    @XmlElement
    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    @XmlElement
    public String getDateOfBirth() { return this.dateOfBirth; }

    public void setDateOfBirth(String date) { this.dateOfBirth = date; }

    @XmlElementWrapper(name="addresses")
    public Map<String, Address> getAddresses() { return this.addresses; }

    public void setAddresses(Map addresses) { this.addresses = addresses; }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address=" + addresses +
                '}';
    }
}
