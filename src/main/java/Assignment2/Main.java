package Assignment2;

public class Main {
    public static void main(String[] args) {
//        Marschal Customer to customer_address.xml
        Address address = new Address("Orvelterdek 21", "3432EL", "Nieuwegein");
        Customer customer = new Customer("Jorrit Meulenbeld", "25-08-1990", address);
        Marschaller marschaller = new Marschaller();
        marschaller.marschalObject("customer_address", customer);

//        Unmarschal earlier created object from XML
        Customer customerIn = (Customer) marschaller.unMarchalObject("customer_address", customer);
        System.out.println(customerIn);
    }
}
