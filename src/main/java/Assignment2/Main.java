package Assignment2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Marschal Customer to customer_address.xml
        Map<String, Address> addressMap = new HashMap<String, Address>();
        Customer customer = new Customer("Jorrit Meulenbeld", "25-08-1990");
        customer.getAddresses().put("Shipping", new Address("Orvelterdek 21", "3432EL", "Nieuwegein"));
        customer.getAddresses().put("Billing", new Address("Omloop 48", "3552AZ", "Utrecht"));
        MarschallerService marschaller = new MarschallerService();
        marschaller.marschalObject("customer_address", customer);

//        Unmarschal earlier created object from XML
        Customer customerIn = (Customer) marschaller.unMarchalObject("customer_address", customer);
        System.out.println(customerIn);
    }
}
